package com.example.mynextapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login (View view){
        Log.i("info","Button wurde geklickt");

        EditText myInputName = findViewById(R.id.editName);
        Log.i("Name", myInputName.getText().toString());

        EditText myInputPw = findViewById(R.id.editPw);
        Log.i("Passwort", myInputPw.getText().toString());

        Toast.makeText(this, "Erfolgreich eingeloggt " + myInputName.getText().toString() , Toast.LENGTH_SHORT).show();
    }
    public void register (View view){
        ImageView imgView = (ImageView) findViewById(R.id.imageView5);
        imgView.setImageResource(R.drawable.frankfurt_school_logo);
    }
}
