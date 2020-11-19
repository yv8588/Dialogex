/**
 * @author yoad
 * @version 1.0
 * alert dialog exercise
 */
package com.example.dialogex;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {
AlertDialog.Builder adb;
LinearLayout s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=(LinearLayout)findViewById(R.id.s);
    }
    /**
     * when the button got clicked shows an alert dialog with  text
     * <p>
     *
     * @param view the button that got clicked
     */
    public void textad(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("only message");
        adb.setMessage("hi albert");
        AlertDialog ad=adb.create();
        ad.show();
    }
    /**
     * when the button got clicked shows an alert dialog with image
     * <p>
     *
     * @param view the button that got clicked
     */
    public void photo(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("only photo");
        adb.setMessage("only photo");
        adb.setIcon(R.drawable.ic_android_black_24dp);
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * when the button got clicked shows an alert dialog with image text and button
     * <p>
     *
     * @param view the button that got clicked
     */
    public void button(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("button and message and photo");
        adb.setMessage("hi");
        adb.setIcon(R.drawable.ic_android_black_24dp);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * when the button got clicked sets an alert dialog that can either generate random screen color or cancel
     * <p>
     *
     * @param view the button that got clicked
     */
    public void randomcolor(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("random color or out");
        adb.setMessage("set background");
        adb.setPositiveButton("random", new DialogInterface.OnClickListener() {
            @Override
        /**
          * when the ok got clicked on the dialog sets the screen at random color
         * <p>
         *
         * @param view the button that got clicked  on the dialog alert
         */
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                s.setBackgroundColor(color);
            }
        });
        adb.setNegativeButton("out", new DialogInterface.OnClickListener() {
            @Override
            /**
             * when the out got clicked on the dialog get out
             * <p>
             *
             * @param view the button that got clicked  on the dialog alert
             */
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * when the button got clicked shows alert dialog with random option rest background option an out
     * <p>
     * @param view the button that got clicked
     */
    public void whiteop(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("random restart or out");
        adb.setMessage("choose");
        adb.setPositiveButton("random", new DialogInterface.OnClickListener() {
            @Override
            /**
             * when the ok got clicked on the dialog sets the screen at random color
             * <p>
             *
             * @param view the button that got clicked  on the dialog alert
             */
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                s.setBackgroundColor(color);
            }
        });
        adb.setNeutralButton("restart", new DialogInterface.OnClickListener() {
            @Override
            /**
             * when the reset  got clicked on the dialog sets background back to white
             * <p>
             *
             * @param view the button that got clicked  on the dialog alert
             */
            public void onClick(DialogInterface dialog, int which) {
                s.setBackgroundColor(WHITE);
            }
        });
        adb.setNegativeButton("out", new DialogInterface.OnClickListener() {
            @Override
            /**
             * when the out got clicked on the dialog get out
             * <p>
             *
             * @param view the button that got clicked  on the dialog alert
             */
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
    @Override
    /**
     *creates option menu from the main xml resource general menu
     * <p>
     * @parm menu the menu
     * @return true if menu created
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    /**
     * when item selected goes to credits
     * <p>
     * @param item the item hat was chosen
     * @return true if the operation succeed
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int id=item.getItemId();
       if(id==R.id.credits){
           Intent si= new Intent(this,credits.class);
           startActivity(si);
       }
        return super.onOptionsItemSelected(item);
    }
}