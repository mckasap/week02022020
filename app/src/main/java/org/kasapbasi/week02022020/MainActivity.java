package org.kasapbasi.week02022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.imageView);

        try{
            iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM) );

        }catch (Exception ex){


        }

    }
}
