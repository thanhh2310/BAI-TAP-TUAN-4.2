package tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mobile.R;

public class tuan422 extends AppCompatActivity {
    Button btn;
    TextView tv;
    Context context=this;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan422);
        Tuan42VolleyFn volleyFn = new Tuan42VolleyFn();
        tv = findViewById(R.id.tuan422Tv);
        btn = findViewById(R.id.tuan422btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tv);
            }
        });
    }
}