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

public class countLingkaran extends AppCompatActivity {

    Button bt_hitung;
    EditText et_jari;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_lingkaran);

        bt_hitung = findViewById(R.id.lkr_bt_hitung);
        et_jari = findViewById(R.id.lkr_et_jari);
        tv_result = findViewById(R.id.lkr_tv_hasil);

        bt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_jari.getText().toString().trim().length() > 0){

                    float number = Float.valueOf(et_jari.getText().toString());

                    if (number != 0 ){
                        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

                        number = number * number * 22 / 7;
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