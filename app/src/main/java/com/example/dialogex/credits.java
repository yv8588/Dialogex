package com.example.dialogex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }
    @Override
    /**
     * when item selected goes  back to first activity
     * <p>
     * @param item the item hat was chosen
     * @return true if the operation succeed
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.back){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}