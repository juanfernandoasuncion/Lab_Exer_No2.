package com.example.laboratoryactivity2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    EditText et_School;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et_School = findViewById(R.id.etSchool);

    }
    public void verify (View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String uap11 = sp.getString("uap1", null);
        String uap12 = sp.getString("uap2", null);
        String uap13 = sp.getString("uap3", null);
        String uap14 = sp.getString("uap4", null);
        String uap15 = sp.getString("uap5", null);
        String uap16 = sp.getString("uap6", null);
        String uap17 = sp.getString("uap7", null);
        String uap18 = sp.getString("uap8", null);

        if (uap11.equals(et_School.getText().toString()) || uap12.equals(et_School.getText().toString()) || uap13.equals(et_School.getText().toString()) || uap14.equals(et_School.getText().toString()) || uap15.equals(et_School.getText().toString()) || uap16.equals(et_School.getText().toString()) ||
                uap17.equals(et_School.getText().toString()) || uap18.equals(et_School.getText().toString())) {
            Toast.makeText(this, "School is competing in UAAP..", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "School is not competing in UAAP..", Toast.LENGTH_LONG).show();
        }
    }
}

