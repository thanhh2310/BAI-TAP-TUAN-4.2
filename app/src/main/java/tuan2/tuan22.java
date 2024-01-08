package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mobile.R;

public class tuan22 extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22);
        result = findViewById(R.id.kq);
        // don du lieu
        Intent i1 = getIntent();
        //do hang
        String heso1 = i1.getExtras().getString("soa");
        String heso2 = i1.getExtras().getString("sob");
        String heso3 = i1.getExtras().getString("soc");
        // giai phuong trinh bac 2
        Float a = Float.parseFloat(heso1);
        Float b = Float.parseFloat(heso2);
        Float c = Float.parseFloat(heso3);
        Float denta = b*b -4*a*c ;
        if(denta < 0){
            result.setText("\t\t phuong trinh vo nghiem");
        }
        else if(denta == 0){
            result.setText(String.valueOf(-b/2*a));
        }
        else {
            result.setText("x1= "+( (-b+Math.sqrt(denta)))/(2*a) + "\n" + "x2= "+( (-b-Math.sqrt(denta)))/(2*a));
        }

    }
}