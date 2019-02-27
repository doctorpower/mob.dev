package com.example.evgeniy.labproject;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Fragment1 fragment1 = new Fragment1();
    Fragment2 fragment2 = new Fragment2();
    Fragment3 fragment3 = new Fragment3();
    Fragment4 fragment4 = new Fragment4();

    FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragment3);
        fragmentTransaction.commit();

        final DrawerLayout drawer = findViewById(R.id.draw002er1);
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        drawer.closeDrawers();

                        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                        switch(menuItem.getItemId()) {
                            case R.id.item1:
                                fragmentTransaction.replace(R.id.content_frame, fragment1);

                                break;
                            case R.id.item2:
                                fragmentTransaction.replace(R.id.content_frame, fragment2);

                                break;
                            case R.id.item3:
                                fragmentTransaction.replace(R.id.content_frame, fragment3);

                                break;
                            case R.id.item4:
                                fragmentTransaction.replace(R.id.content_frame, fragment4);

                                break;
                            default:
                                break;
                        }

                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                        return true;
                    }
                });
    }
}
