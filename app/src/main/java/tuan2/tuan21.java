package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mobile.R;

public class tuan21 extends AppCompatActivity {
    EditText heSoa , heSob, heSoc;
    Button nut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21);
        heSoa = findViewById(R.id.a);
        heSob = findViewById(R.id.b);
        heSoc = findViewById(R.id.c);
        nut = findViewById(R.id.btn);
        // su kien khi click button
        nut.setOnClickListener(v->{
            // dinh huong di chuyen
            Intent i = new Intent(tuan21.this,tuan22.class);
            // dua du lieu vao
            i.putExtra("soa",heSoa.getText().toString());
            i.putExtra("sob",heSob.getText().toString());
            i.putExtra("soc", heSoc.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}