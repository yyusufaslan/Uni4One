package com.project.uni4one;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.project.fragments.SignInFragment;

public class WelcomeActivity extends AppCompatActivity {
    android.app.FragmentManager manager;
    Button signIn,signUp;
    Context context;

    public WelcomeActivity(Context context) {
        this.context = context;
    }

    public WelcomeActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        manager = getFragmentManager();
        signIn = (Button) findViewById(R.id.signIn);
        signUp = (Button) findViewById(R.id.signUp);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignInFragment fragmentSignIn = new SignInFragment();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.fragment_forms,fragmentSignIn,"fragment_sign_in");
                transaction.commit();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignInFragment fragmentSignUp = new SignInFragment();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.fragment_forms,fragmentSignUp,"fragment_sign_up");
                transaction.commit();
            }
        });

    }
}
