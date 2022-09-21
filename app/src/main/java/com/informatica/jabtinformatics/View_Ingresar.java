package com.informatica.jabtinformatics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class View_Ingresar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ingresar);
    }
    public void irAtras(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}