package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Fragmento1 fragmento1;
    private Fragmento2 fragmento2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmento1 = new Fragmento1();
        fragmento2 = new Fragmento2();
    }

    public void irFragmento1(View view){
        FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.espacofrags, fragmento1);
        fm.commit();
    }

    public void irFragmento2(View view){
        FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.espacofrags, fragmento2);
        fm.commit();
    }


}