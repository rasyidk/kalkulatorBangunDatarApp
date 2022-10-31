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

public class countPersegiPanjang extends AppCompatActivity {

    Button bt_hitung;
    EditText et_panjang,et_lebar;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_persegi_panjang);

        bt_hitung = findViewById(R.id.psgpj_bt_hitung);
        et_panjang = findViewById(R.id.psgpj_et_panjang);
        et_lebar = findViewById(R.id.psgpj_et_lebar);
        tv_result = findViewById(R.id.psgpj_tv_hasil);

        bt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_panjang.getText().toString().trim().length() > 0 && et_lebar.getText().toString().trim().length() > 0){

                    float panjang = Float.valueOf(et_panjang.getText().toString());
                    float lebar = Float.valueOf(et_lebar.getText().toString());

                    if (panjang != 0 && lebar != 0){
                        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                        float res = lebar * panjang;
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