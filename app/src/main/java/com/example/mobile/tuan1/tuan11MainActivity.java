package com.example.mobile.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mobile.R;

public class tuan11MainActivity extends AppCompatActivity {
    // khai bao cac control
    EditText txt1,txt2 ;
    Button btn1;
    TextView tvt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        // anh xa cac control
        txt1 = findViewById(R.id.demo11txt1);
        txt2 = findViewById(R.id.demo11txt2);
        btn1 = findViewById(R.id.demo11btn1);
        tvt1 = findViewById(R.id.demo11tvt1);
        // xu ly su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();
        });
    }
    //dinh nghia ham tinh tong
    private void tinhTong() {
        /* lay du lieu nhap voa tu Edittext1*/
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);// chuyen du lieu sang so
        /* lay du lieu nhap voa tu Edittext2*/
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);// chuyen du lieu sang so
        // tinh tong
        float tong = so1 + so2 ;
        // in ket qua ra man hinh
        tvt1.setText(String.valueOf(tong));
    }
}