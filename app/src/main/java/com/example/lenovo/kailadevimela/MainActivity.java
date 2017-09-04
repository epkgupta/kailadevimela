package com.example.lenovo.kailadevimela;

import android.content.Context;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;
import android.app.AlertDialog;


public class MainActivity extends AppCompatActivity {
    private TextView tv;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) this.findViewById(R.id.text);
        tv.setSelected(true);
    }

    public void onclick(View view) {
        Intent mintent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(mintent);
    }

    public void click(View view) {
        Intent mintent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(mintent);
    }

    public void click1(View view) {
        Intent mintent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(mintent);
    }
    public void click2(View view) {
        Intent mintent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(mintent);
    }
    public void click3(View view) {
        Intent mintent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(mintent);
    }
    public void click4(View view) {
        Intent mintent = new Intent(MainActivity.this, Main7Activity.class);
        startActivity(mintent);
    }
    public void click5(View view) {
        Intent mintent = new Intent(MainActivity.this, Main9Activity.class);
        startActivity(mintent);
    }
    public void click10(View view) {
        Intent mintent = new Intent(MainActivity.this, Main8Activity.class);
        startActivity(mintent);
    }
    public void click6 (View view) {
        Intent mintent = new Intent(MainActivity.this,Main10Activity.class);
        startActivity(mintent);
    }


    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}





