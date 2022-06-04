package com.example.ci_day6_profile_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity3 extends AppCompatActivity {
 BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bottomNavigationView=findViewById(R.id.bottomView3);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new FirstFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.skill);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch(item.getItemId()){

                    case R.id.skill:
                        fragment =new FirstFragment();
                        break;

                    case R.id.training:
                        fragment =new SecondFragment();
                        break;

                    case R.id.milestone:
                        fragment =new ThirdFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
                return true;
            }
        });
    }
}