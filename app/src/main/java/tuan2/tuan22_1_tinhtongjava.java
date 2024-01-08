package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mobile.R;

public class tuan22_1_tinhtongjava extends AppCompatActivity {
    EditText so1, so2;
    Button bam;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan221_tinhtongjava);
        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        bam = findViewById(R.id.nutt);
        bam.setOnClickListener(v->{
            Intent i = new Intent(tuan22_1_tinhtongjava.this, tuan22_2_tinhtongjava.class);
            i.putExtra("so1", so1.getText().toString());
            i.putExtra("so2", so2.getText().toString());
            startActivity(i);
        });
    }
}