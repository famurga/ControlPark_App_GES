package com.example.controlpark_app.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.controlpark_app.R;

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