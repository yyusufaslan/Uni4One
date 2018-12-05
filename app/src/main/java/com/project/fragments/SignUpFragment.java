package com.project.fragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.project.uni4one.R;

public class SignUpFragment extends Fragment implements View.OnClickListener {

    Context context;
    View view;
    android.app.FragmentManager manager;
    Button signIn,signUp;
    TextView back_sign_up_text;
    EditText email,password,password_again;
    public SignUpFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up, container,false);
        manager = getFragmentManager();
        email = (EditText) view.findViewById(R.id.email);
        password = (EditText) view.findViewById(R.id.password);
        password_again = (EditText) view.findViewById(R.id.password_again);
        back_sign_up_text = (TextView)view.findViewById(R.id.back_sign_in_text);
        back_sign_up_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.addToBackStack("fragment_sign_up");
                transaction.commit();
            }
        });
        return view;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.email_sign_in_button){
            String getEmailId = email.getText().toString();
            String getPassword = password.getText().toString();
            String getPasswordAgain = password_again.getText().toString();
            if (getPasswordAgain != getPassword)
            {
                Toast.makeText(context, "Şifreler Uyuşmuyor", Toast.LENGTH_SHORT).show();
            }else if (getEmailId.equals("") || getEmailId.length() == 0
                    || getPassword.equals("") || getPassword.length() == 0) {
                Toast.makeText(context, "Uppss bir şeyler ya çok kısa ya da yanlış..", Toast.LENGTH_SHORT).show();
            }else{

            }
        }
    }
}
