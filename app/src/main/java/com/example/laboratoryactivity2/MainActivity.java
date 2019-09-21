package com.example.laboratoryactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_1, et_2, et_3, et_4, et_5, et_6, et_7, et_8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1 = findViewById(R.id.et1);
        et_2 =findViewById(R.id.et2);
        et_3 = findViewById(R.id.et3);
        et_4 = findViewById(R.id.et4);
        et_5 = findViewById(R.id.et5);
        et_6 = findViewById(R.id.et6);
        et_7 = findViewById(R.id.et7);
        et_8 = findViewById(R.id.et8);

    }

    public void saveData(View v) {
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String uap1= et_1.getText().toString();
        String uap2 = et_2.getText().toString();
        String uap3 = et_3.getText().toString();
        String uap4 = et_4.getText().toString();
        String uap5 = et_5.getText().toString();
        String uap6 = et_6.getText().toString();
        String uap7 = et_7.getText().toString();
        String uap8 = et_8.getText().toString();
        editor.putString("uap1", uap1);
        editor.putString("uap2", uap2);
        editor.putString("uaapschool3", uap3);
        editor.putString("uap3", uap4);
        editor.putString("uap5", uap5);
        editor.putString("uap6", uap6);
        editor.putString("uap7", uap7);
        editor.putString("uap8", uap8);


        editor.commit();
        Toast.makeText(this, "data saved in data1.xml", Toast.LENGTH_LONG).show();
   }

    public void validate(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

}
