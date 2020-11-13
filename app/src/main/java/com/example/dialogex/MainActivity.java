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
AlertDialog.Builder ad;
LinearLayout s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * when the button got clicked shows an alert dialog with  text
     * <p>
     *
     * @param view the button that got clicked
     */
    public void textad(View view) {
        ad=new AlertDialog.Builder(this);
        ad.setTitle("only text");
        ad.setMessage("hi albert");
        AlertDialog adb=ad.create();
        adb.show();
    }
    /**
     * when the button got clicked shows an alert dialog with image
     * <p>
     *
     * @param view the button that got clicked
     */
    public void photo(View view) {
        ad=new AlertDialog.Builder(this);
        ad.setMessage("hi");
        ad.setIcon(R.drawable.exercies);
        AlertDialog adb=ad.create();
        adb.show();
    }

    /**
     * when the button got clicked shows an alert dialog with image text and button
     * <p>
     *
     * @param view the button that got clicked
     */
    public void button(View view) {
        ad=new AlertDialog.Builder(this);
        ad.setIcon(R.drawable.exercies);
        ad.setMessage("hi");
        ad.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog adb=ad.create();
        adb.show();
    }

    /**
     * when the button got clicked sets an alert dialog that can either generate random screen color or cancel
     * <p>
     *
     * @param view the button that got clicked
     */
    public void randomcolor(View view) {
        ad.setMessage("random color");
        ad.setPositiveButton("random", new DialogInterface.OnClickListener() {
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
        ad.setNegativeButton("out", new DialogInterface.OnClickListener() {
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
    }

    /**
     * when the button got clicked shows alert dialog with random option rest background option an out
     * <p>
     * @param view the button that got clicked
     */
    public void whiteop(View view) {
        ad.setMessage("set color");
        ad.setPositiveButton("random", new DialogInterface.OnClickListener() {
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
        ad.setNeutralButton("restart", new DialogInterface.OnClickListener() {
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
        ad.setNegativeButton("out", new DialogInterface.OnClickListener() {
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