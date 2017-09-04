package com.example.lenovo.kailadevimela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
public class Main5Activity extends AppCompatActivity {
    private Integer images[] = {R.drawable.pic1, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10, R.drawable.pic11, R.drawable.pic12, R.drawable.pic13,  R.drawable.pic15, R.drawable.pic16,  R.drawable.pic18, R.drawable.pic19, R.drawable.pic20, R.drawable.pic21, R.drawable.pic22, R.drawable.pic23, R.drawable.pic24, R.drawable.pic25, R.drawable.pic26, R.drawable.pic27
    };
    private int currImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        setInitialImage();
        setImageRotateListener();
    }

    private void setImageRotateListener() {
        final Button rotatebutton = (Button) findViewById(R.id.btnRotateImage);
        rotatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                currImage++;
                if (currImage == 24) {
                    currImage = 0;
                }
                setCurrentImage();
            }
        });
    }

    private void setInitialImage() {
        setCurrentImage();
    }

    private void setCurrentImage() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageResource(images[currImage]);

    }
}