/**
 * @author yoad
 * @version 1.0
 * alert dialog exercise
 */
package com.example.dialogex;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
AlertDialog.Builder ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * when the button got clicked shows an alert dialog with  text
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
     * @param view the button that got clicked
     */
    public void photo(View view) {
        ad=new AlertDialog.Builder(this);
        ad.setTitle("hello");
        ad.setMessage("hi");
        ad.setIcon(R.drawable.exercies);
        AlertDialog adb=ad.create();
        adb.show();

    }

    /**
     * when the button got clicked shows an alert dialog with image text and button
     * @param view the button that got clicked
     */
    public void button(View view) {
        ad=new AlertDialog.Builder(this);
        ad.setMessage("hi");
        ad.setIcon(R.drawable.exercies);
        ad.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog adb=ad.create();
        adb.show();
    }

}