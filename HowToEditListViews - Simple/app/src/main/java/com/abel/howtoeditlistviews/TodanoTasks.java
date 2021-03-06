package com.abel.howtoeditlistviews;

import androidx.appcompat.app.AppCompatActivity; //YOU NEED THIS INSTEAD OF import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.MediaController;


public class TodanoTasks extends AppCompatActivity implements View.OnClickListener {

    Button button;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;

    ScrollView scrollView_main;

    //Saved data goes into the final Strings, and can be read from inside onCreate()
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Skills_todano = "skill1";
    public static final String Skills2_todano = "skill2";
    public static final String Skills3_todano = "skill3";
    public static final String Skill4_todano = "skill4";
    public static final String Skill5_todano = "skill4";
    public static final String Skill6_todano = "skill5";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Basic creation commands
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todano_layout);

        //Connects button the save button to the button created as a global, as well as the checkboxes, and any views
        findViewsById();

        //Setup listener for button, so that onClick goes to that button
        button.setOnClickListener(this);

        //This prevents the activity from starting in the middle of the view. You need to create an ID for the scroll view first in the XML File
        //Not needed if everything fits in one space
        scrollView_main = (ScrollView)findViewById(R.id.scroll_view_todano);
        scrollView_main.smoothScrollTo(0,0);



        //Plays the videos with the Media Player option
        //If you set this, the video will play as soon as activity is started
        //view.start();

        VideoView view2 = (VideoView)findViewById(R.id.videoView_todano);
        String path2 = "android.resource://" + getPackageName() + "/" +R.raw.video_todano;
        view2.setVideoURI(Uri.parse(path2));

        MediaController mediaController2 = new MediaController(this);
        mediaController2.setAnchorView(view2);
        view2.setMediaController(mediaController2);




        //Loads the saved preferences for the checkboxes
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        if ((sharedpreferences.getBoolean("Skills_todano",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox1.setChecked(true);
        else
            checkBox1.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills2_todano",false))==true)
            checkBox2.setChecked(true);
        else
            checkBox2.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills3_todano",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox3.setChecked(true);
        else
            checkBox3.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills4_todano",false))==true)
            checkBox4.setChecked(true);
        else
            checkBox4.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills5_todano",false))==true)
            checkBox5.setChecked(true);
        else
            checkBox5.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills6_todano",false))==true)
            checkBox6.setChecked(true);
        else
            checkBox6.setChecked(false);



        //Calls the method to hide the navigational bar, however it will reappear if you are using a videoView
        hideSystemUI();
    }

    //Make sure that you run this function inside onCreate() so that you can use each button or checkbox, or use the textView method above. Both do the same thing
    private void findViewsById() {
        button = (Button) findViewById(R.id.button_todano);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox7_todano);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox8_todano);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox9_todano);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox14_todano);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox_todano);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox10_todano);
        scrollView_main = (ScrollView)findViewById(R.id.scroll_view_todano);

    }


    private void hideSystemUI() {
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        scrollView_main.setSystemUiVisibility(
                scrollView_main.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }





    public void onClick(View v)
    {
        //Setup the save feature
        SharedPreferences.Editor editor = sharedpreferences.edit();

        if((checkBox1).isChecked())
        {
            editor.putBoolean("Skills_todano", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills_todano", false);
            editor.commit();
        }

        if((checkBox2).isChecked())
        {
            editor.putBoolean("Skills2_todano", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills2_todano", false);
            editor.commit();
        }

        if((checkBox3).isChecked())
        {
            editor.putBoolean("Skills3_todano", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills3_todano", false);
            editor.commit();
        }

        if((checkBox4).isChecked())
        {
            editor.putBoolean("Skills4_todano", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills4_todano", false);
            editor.commit();
        }

        if((checkBox5).isChecked())
        {
            editor.putBoolean("Skills5_todano", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills5_todano", false);
            editor.commit();
        }

        if((checkBox6).isChecked())
        {
            editor.putBoolean("Skills6_todano", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills6_todano", false);
            editor.commit();
        }
        finish();

        //Close entire App completely
        /*
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

         */
    }

}




