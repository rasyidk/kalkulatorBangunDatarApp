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

public class countSegitiga extends AppCompatActivity {


    Button bt_hitung;
    EditText et_alas,et_tinggi;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_segitiga);

        bt_hitung = findViewById(R.id.sgt_bt_hitung);
        et_alas = findViewById(R.id.sgt_et_alas);
        et_tinggi = findViewById(R.id.sgt_et_tinggi);
        tv_result = findViewById(R.id.sgt_tv_hasil);

        bt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_alas.getText().toString().trim().length() > 0 && et_tinggi.getText().toString().trim().length() > 0){

                    float alas = Float.valueOf(et_alas.getText().toString());
                    float tinggi = Float.valueOf(et_tinggi.getText().toString());

                    if (alas != 0 && tinggi != 0){
                        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

                        float res = alas * tinggi / 2;
                        tv_result.setText(String.valueOf(res + " cm"));
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