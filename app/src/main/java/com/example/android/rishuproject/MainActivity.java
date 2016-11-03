package com.example.android.rishuproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnActivity2;
    Button  mBtnActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnActivity2=(Button)findViewById(R.id.button2);
        mBtnActivity3=(Button)findViewById(R.id.button3);

        mBtnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });


        mBtnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                /*Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("www.javatpoint.com"));
                startActivity(intent);
*/
                Intent downloadIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
                //downloadIntent.setData(Uri.parse("www.javatpoint.com"));
                startActivity(downloadIntent);

            }
        });



    }




    public void callsecond(View v)

    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }




}
