package com.oliverpelham.habbitlandapp.ui.login;

import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.oliverpelham.habbitlandapp.R;

public class LoginFragment extends Fragment {

    private LoginViewModel mViewModel;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }
    //private View.OnClickListener loginButtonListner;
    private FirebaseAuth authent;

    //{
    //    loginButtonListner = new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {
    //            //What to do on click
    //        }
    //    };
    //}


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        authent = FirebaseAuth.getInstance();

        View view = inflater.inflate(R.layout.login_fragment, container, false);


        Button loginButton = (Button)view.findViewById(R.id.loginButton);
        Button registerButton = (Button)view.findViewById(R.id.registerButton);


        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Login Failed", Toast.LENGTH_LONG).show();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Registration Failed", Toast.LENGTH_LONG).show();
            }
        });




        return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = authent.getCurrentUser();


        //updateUI(currentUser); //Approaching this in a different way?
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        // TODO: Use the ViewModel
    }




}
