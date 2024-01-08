package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mobile.R;

public class tuan22_2_tinhtongjava extends AppCompatActivity {
    TextView ketqua;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan222_tinhtongjava);
        ketqua = findViewById(R.id.ketqua);
        Intent i1 = getIntent();
        String sothunhat = i1.getExtras().getString("so1");
        String sothuhai = i1.getExtras().getString("so2");
        Float a = Float.parseFloat(sothunhat);
        Float b = Float.parseFloat(sothuhai);
        Float c = a + b;
        ketqua.setText(String.valueOf(c));
    }
}