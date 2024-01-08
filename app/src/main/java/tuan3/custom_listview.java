package tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mobile.R;

import java.util.ArrayList;

public class custom_listview extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);
        lv = findViewById(R.id.tuan32lv);
        ls.add(new T32Contact("Vu Tien Thanh", "20",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Le Phuong Anh", "20",R.drawable.ic_launcher_background));
        //tao adpter
        adapter = new T32Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}