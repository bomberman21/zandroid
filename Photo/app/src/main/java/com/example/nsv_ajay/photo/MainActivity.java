package com.example.nsv_ajay.photo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
       // int ct=0;
        setContentView(R.layout.activity_main);
        final ImageView imageview=(ImageView)findViewById(R.id.ivimage);
        Button btnchanger=(Button)findViewById(R.id.btnchanger);
        btnchanger.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) { imageview.setImageResource(R.drawable.yourimage);
                MainActivity.super.onPause();

            }

            public void OnClick(View view)
            {

            }

            protected void onPause() {
                MainActivity.super.onPause();
                Log.d("android", "The onPause()event");
            }

        });

    }
}
