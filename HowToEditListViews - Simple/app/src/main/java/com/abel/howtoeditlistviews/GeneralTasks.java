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


public class GeneralTasks extends AppCompatActivity implements View.OnClickListener {

    Button button;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11;

    ScrollView scrollView_main;

    //Saved data goes into the final Strings, and can be read from inside onCreate()
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Skills_general = "skill1";
    public static final String Skills2_general = "skill2";
    public static final String Skills3_general = "skill3";
    public static final String Skill4_general = "skill4";

    public static final String Skills5_general = "skill1";
    public static final String Skills6_general = "skill2";
    public static final String Skills7_general = "skill3";
    public static final String Skill8_general = "skill4";

    public static final String Skills9_general = "skill1";
    public static final String Skills10_general = "skill2";
    public static final String Skills11_general = "skill3";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Basic creation commands
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_layout);

        //Connects button the save button to the button created as a global, as well as the checkboxes, and any views
        findViewsById();

        //Setup listener for button, so that onClick goes to that button
        button.setOnClickListener(this);

        //This prevents the activity from starting in the middle of the view. You need to create an ID for the scroll view first in the XML File
        //Not needed if everything fits in one space
        scrollView_main = (ScrollView)findViewById(R.id.scroll_view_general);
        scrollView_main.smoothScrollTo(0,0);


        //Loads the saved preferences for the checkboxes
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        if ((sharedpreferences.getBoolean("Skills_general",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox1.setChecked(true);
        else
            checkBox1.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills2_general",false))==true)
            checkBox2.setChecked(true);
        else
            checkBox2.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills3_general",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox3.setChecked(true);
        else
            checkBox3.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills4_general",false))==true)
            checkBox4.setChecked(true);
        else
            checkBox4.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills5_general",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox5.setChecked(true);
        else
            checkBox5.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills6_general",false))==true)
            checkBox6.setChecked(true);
        else
            checkBox6.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills7_general",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox7.setChecked(true);
        else
            checkBox7.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills8_general",false))==true)
            checkBox8.setChecked(true);
        else
            checkBox8.setChecked(false);



        if ((sharedpreferences.getBoolean("Skills9_general",false))==true)
            checkBox9.setChecked(true);
        else
            checkBox9.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills10_general",false))==true) //When using this without commiting, the false you put in here (in this case false) will be the DEFAULT VALUE
            checkBox10.setChecked(true);
        else
            checkBox10.setChecked(false);

        if ((sharedpreferences.getBoolean("Skills11_general",false))==true)
            checkBox11.setChecked(true);
        else
            checkBox11.setChecked(false);






        //Calls the method to hide the navigational bar, however it will reappear if you are using a videoView
        hideSystemUI();
    }

    //Make sure that you run this function inside onCreate() so that you can use each button or checkbox, or use the textView method above. Both do the same thing
    private void findViewsById() {
        button = (Button) findViewById(R.id.button_general);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox_global);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox_global1);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox_global2);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox_global3);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox_global4);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox_global5);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox_global6);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox_global7);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox_global8);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox_global9);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox_global10);

        scrollView_main = (ScrollView)findViewById(R.id.scroll_view_general);

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
            editor.putBoolean("Skills_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills_general", false);
            editor.commit();
        }

        if((checkBox2).isChecked())
        {
            editor.putBoolean("Skills2_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills2_general", false);
            editor.commit();
        }

        if((checkBox3).isChecked())
        {
            editor.putBoolean("Skills3_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills3_general", false);
            editor.commit();
        }

        if((checkBox4).isChecked())
        {
            editor.putBoolean("Skills4_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills4_general", false);
            editor.commit();
        }

        if((checkBox5).isChecked())
        {
            editor.putBoolean("Skills5_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills4_general", false);
            editor.commit();
        }

        if((checkBox6).isChecked())
        {
            editor.putBoolean("Skills6_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills6_general", false);
            editor.commit();
        }

        if((checkBox7).isChecked())
        {
            editor.putBoolean("Skills7_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills7_general", false);
            editor.commit();
        }

        if((checkBox8).isChecked())
        {
            editor.putBoolean("Skills8_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills8_general", false);
            editor.commit();
        }

        if((checkBox9).isChecked())
        {
            editor.putBoolean("Skills9_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills9_general", false);
            editor.commit();
        }

        if((checkBox10).isChecked())
        {
            editor.putBoolean("Skills10_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills10_general", false);
            editor.commit();
        }

        if((checkBox11).isChecked())
        {
            editor.putBoolean("Skills11_general", true);
            editor.commit();
        }
        else
        {
            editor.putBoolean("Skills11_general", false);
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




