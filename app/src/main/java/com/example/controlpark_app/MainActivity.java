package com.example.controlpark_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment FragmentLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentLogin = new LoginFragment();

        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.ContenedorFragments,FragmentLogin).commit();
    }
}