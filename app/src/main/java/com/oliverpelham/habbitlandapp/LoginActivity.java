package com.oliverpelham.habbitlandapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.oliverpelham.habbitlandapp.ui.login.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow();
        }

        //ask if logged in if so go to HomeScreen frame, else go to login frame
    }

    //establish if logged in or not..
   // protected void onStart(){
        //if (auth.getCurrentUser() != null) {
        //LoginFragment view = new LoginFragment
        //...
        //}

//    }
}
