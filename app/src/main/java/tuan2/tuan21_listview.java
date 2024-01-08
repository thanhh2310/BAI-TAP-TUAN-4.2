package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mobile.R;

public class tuan21_listview extends AppCompatActivity {
    ListView lstv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_listview);
        lstv = findViewById(R.id.list_java);
        // nguon du lieu
        String[] arr = new String[]{"bai","tap","tuan","2"};
        // adapter
        ArrayAdapter<String> adpater = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        // hien thi len listview
        lstv.setAdapter(adpater);
    }
}