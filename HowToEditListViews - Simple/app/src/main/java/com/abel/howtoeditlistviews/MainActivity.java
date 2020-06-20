package com.abel.howtoeditlistviews;


import androidx.appcompat.app.AppCompatActivity; //YOU NEED THIS INSTEAD OF import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int[] images = {R.mipmap.oozla_round,R.mipmap.main_menu_maktar_round,R.mipmap.main_menu_barlow_round,R.mipmap.main_menu_endako_round,R.mipmap.main_menu_notak_round, R.mipmap.main_menu_siberius_round,R.mipmap.main_menu_tabora_round,R.mipmap.main_menu_dobbo_round, R.mipmap.main_menu_joba_round, R.mipmap.main_menu_todano_round,R.mipmap.main_menu_boldan_round, R.mipmap.main_menu_general_round, R.mipmap.main_menu_general_round, R.mipmap.main_menu_general_round, R.mipmap.main_menu_general_round};
    String[] version = {"Oozla","Maktar","Barlow","Endako","Notak","Siberius","Tabora","Dobbo","Joba", "Todano","Boldan","Snivelak","Damosel", "Grelbin", "General" };
    String[] versionNumber = {"2 Skills, 2 Bolts","2 Skills, 2 Bolts","1 Skill, 2 Bolts","2 Skill, 2 Bolts","1 Skill, 3 Bolts","1 Skill, 2 Bolts", "1 Skill, 3 Bolts","3 Skills, 2 Bolts","4 Skills, 2 Bolts","3 Skills, 3 Bolts", "1 Skill, 3 Bolts", "1 Bolt, 1 Skill","2 Skills, 2 Bolts","1 Skill, 3 Bolts", "6 Trophies" };

    ListView lView;
    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lView = (ListView) findViewById(R.id.androidList);
        lAdapter = new ListAdapter(MainActivity.this, version, versionNumber, images);
        lView.setAdapter(lAdapter);




        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                if (i == 0)
                {
                    Intent intent = new Intent(getApplicationContext(), OozlaTasks.class);
                    startActivity(intent);
                }

                if (i == 1)
                {
                    Intent intent = new Intent(getApplicationContext(), MaktarTasks.class);
                    startActivity(intent);
                }

                if (i == 2)
                {
                    Intent intent = new Intent(getApplicationContext(), BarlowTasks.class);
                    startActivity(intent);
                }

                if (i == 3)
                {
                    Intent intent = new Intent(getApplicationContext(), EndakoTasks.class);
                    startActivity(intent);
                }

                if (i == 4)
                {
                    Intent intent = new Intent(getApplicationContext(), NotakTasks.class);
                    startActivity(intent);
                }

                if (i == 5)
                {
                    Intent intent = new Intent(getApplicationContext(), SiberiusTasks.class);
                    startActivity(intent);
                }

                if (i == 6)
                {
                    Intent intent = new Intent(getApplicationContext(), TaboraTasks.class);
                    startActivity(intent);
                }

                if (i == 7)
                {
                    Intent intent = new Intent(getApplicationContext(), DobboTasks.class);
                    startActivity(intent);
                }

                if (i == 8)
                {
                    Intent intent = new Intent(getApplicationContext(), JobaTasks.class);
                    startActivity(intent);
                }

                if (i == 9)
                {
                    Intent intent = new Intent(getApplicationContext(), TodanoTasks.class);
                    startActivity(intent);
                }


                if (i == 10)
                {
                    Intent intent = new Intent(getApplicationContext(), BoldanTasks.class);
                    startActivity(intent);
                }

                if (i == 11)
                {
                    Intent intent = new Intent(getApplicationContext(), SnivelakTasks.class);
                    startActivity(intent);
                }

                if (i == 12)
                {
                    Intent intent = new Intent(getApplicationContext(), DamoselTasks.class);
                    startActivity(intent);
                }

                if (i == 13)
                {
                    Intent intent = new Intent(getApplicationContext(), GrelbinTasks.class);
                    startActivity(intent);
                }

                if (i == 14)
                {
                    Intent intent = new Intent(getApplicationContext(), GeneralTasks.class);
                    startActivity(intent);
                }

            }
        });

    }
}

