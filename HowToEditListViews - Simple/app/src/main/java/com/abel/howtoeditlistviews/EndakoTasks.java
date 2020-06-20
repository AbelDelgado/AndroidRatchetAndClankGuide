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


public class EndakoTasks extends AppCompatActivity implements View.OnClickListener {

    Button button;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    //Saved data goes into the final Strings, and can be read from inside onCreate()
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Skills_endako = "skill1";
    public static final String Skills2_endako = "skill2";
    public static final String Skills3_endako = "skill3";
    public static final String Skill4_endako = "skill4";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Basic creation commands
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endako_layout);

        //This prevents the activity from starting in the middle of the view. You need to create an ID for the scroll view first in the XML File
        ScrollView scrollView_main = (ScrollView)findViewById(R.id.scroll_view_endako);
        scrollView_main.smoothScrollTo(0,0);


        //Connects button the save button to the button created as a global, as well as the checkboxes
        findViewsById();

        //Setup listener for button, so that onClick goes to that button
        button.setOnClickListener(this);


        //Plays the videos with the Media Player option

        //If you set this, the video will play as soon as activity is started
        //view.start();

        VideoView view2 = (VideoView)findViewById(R.id.videoView3_endako);
        String path2 = "android.resource://" + getPackageName() + "/" +R.raw.skills_endako;
        view2.setVideoURI(Uri.parse(path2));

        MediaController mediaController2 = new
                MediaController(this);
        mediaController2.setAnchorView(view2);
        view2.setMediaController(mediaController2);




        //Loads the saved preferences for the checkboxes
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        if ((sharedpreferences.getBoolean("Skills_endako",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox1.setChecked(true);
        else
            checkBox1.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills2_endako",false))==true)
            checkBox2.setChecked(true);
        else
            checkBox2.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills3_endako",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox3.setChecked(true);
        else
            checkBox3.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills4_endako",false))==true)
            checkBox4.setChecked(true);
        else
            checkBox4.setChecked(false);
    }

    //Make sure that you run this function inside onCreate() so that you can use each button or checkbox, or use the textView method above. Both do the same thing
    private void findViewsById() {
        button = (Button) findViewById(R.id.save_button_endako);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1_endako);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox4_endako);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3_endako);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox5_endako);
    }


    public void onClick(View v)
    {
        //Setup the save feature
        SharedPreferences.Editor editor = sharedpreferences.edit();

        if((checkBox1).isChecked())
        {
            editor.putBoolean("Skills_endako", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills_endako", false);
            editor.commit();
        }

        if((checkBox2).isChecked())
        {
            editor.putBoolean("Skills2_endako", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills2_endako", false);
            editor.commit();
        }

        if((checkBox3).isChecked())
        {
            editor.putBoolean("Skills3_endako", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills3_endako", false);
            editor.commit();
        }

        if((checkBox4).isChecked())
        {
            editor.putBoolean("Skills4_endako", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills4_endako", false);
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




