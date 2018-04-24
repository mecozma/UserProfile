package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Profile ImageView
         */
        ImageView profileImage = (ImageView) findViewById(R.id.profileImage);
        profileImage.setImageResource(R.drawable.img1);

        /**
         * Textview for name
         */

        TextView name = (TextView) findViewById(R.id.name);
            name.setText("Eduard");

        /**
         * Textview for birthday
         */

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("07/08/1985");

        /**
         * Textview for country
         */
        TextView country = (TextView) findViewById(R.id.country);
        country.setText("Romania");


    }
}
