package com.informatica.jabtinformatics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void irView_Ingresar(View view){
        Intent i=new Intent(this,View_Ingresar.class);
        startActivity(i);
    }
    public void irView_Registrar(View view){
        Intent i=new Intent(this,View_Registrar.class);
        startActivity(i);
    }
    
}