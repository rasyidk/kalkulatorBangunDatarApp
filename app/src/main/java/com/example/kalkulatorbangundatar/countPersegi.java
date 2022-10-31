package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class countPersegi extends AppCompatActivity {

    Button bt_hitung;
    EditText et_sisi;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_persegi);

        bt_hitung = findViewById(R.id.psg_bt_hitung);
        et_sisi = findViewById(R.id.psg_et_sisi);
        tv_result = findViewById(R.id.psg_tv_hasil);

        bt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (et_sisi.getText().toString().trim().length() > 0){

                    float number = Float.valueOf(et_sisi.getText().toString());

                    if (number != 0 ){
                        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                        number = number * number;
                        tv_result.setText(String.valueOf(number + " cm"));
                    }else {
                        Toast.makeText(getApplicationContext(),"Must greater than 0",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Tidak Boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}