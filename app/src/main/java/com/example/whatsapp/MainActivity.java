package com.example.whatsapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.google.firebase.FirebaseApp;

public class MainActivity <viewpager> extends AppCompatActivity {

    private Toolbar mToolbar;
private viewpager myviewpager;
private TabLayout mytablayout;
    private TabsAccessorAdaptor myTabAccessorAdaptor;
    private Firebaseuser currentUser ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar=(Toolbar) findViewById(R.id.main_page_toolbar);
                setSupportActionBar(mToolbar);
                            getSupportActionBar().setTitle("whatsapp");


        myviewpager= (viewpager) findViewById(R.id.main_tabs_pager);
        myTabAccessorAdaptor =new TabsAccessorAdaptor(getSupportFragmentManager());
       myviewpager.setAdaptor(myTabAccessorAdaptor);

        mytablayout=(TabLayout) findViewById(R.id.main_page_toolbar);
        mytablayout.setupWithViewPager((ViewPager) myviewpager);




    }

    @Override
    protected void onStart() {

        super.onStart();

        if (currentUser==null){

    SendUserToLoginActivity()

            }

        }


    private void SendUserToLoginActivity() {

    Intent LogInIntent=new Intent(MainActivity.this, LoginActivity.class);
    startActivity(LoginIntent);

    }
}
