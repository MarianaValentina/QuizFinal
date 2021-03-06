package com.example.marry.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Mary on 03/28/2018.
 */

public class Pop_Culture extends Activity {
    //AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_culture);

        /*
          set the new dimensions for our pop-up
         */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width2 = dm.widthPixels;
        int height2 = dm.heightPixels;
        /*
          height and width to be 60% and 80% of the screen, that's why we multily by .6 and .8
         */
        getWindow().setLayout((int) (width2 * .7), (int) (height2 * .8));

        Bundle bundle = getIntent().getExtras();
        int result = bundle.getInt("answer");

        //we get the resourses from string.xml and transform them into a string
        String message = getResources().getString(R.string.message_culture);
        String message1 = getResources().getString(R.string.total);
        //build the whole string that will be displayed
        String mess = new StringBuilder(message).append(" ").append(result).append(message1).toString();

        TextView text = findViewById(R.id.mesaj_culture_quiz);
        text.setText(mess);

    }
}
