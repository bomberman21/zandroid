package com.example.nsv_ajay.cookies;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView imageview=(ImageView)findViewById(R.id.android_cookie_image_view);
        Log.i("MainActivity.java", "Captain");
        imageview.setImageResource(R.drawable.after);
        TextView textview=(TextView)findViewById(R.id.status_text_view);
        textview.setText("I am so full");


        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}