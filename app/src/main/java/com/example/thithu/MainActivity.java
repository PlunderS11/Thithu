package com.example.thithu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Hang> hangArrayList;

    HangAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.idGridview);
        hangArrayList = new ArrayList<>();

        hangArrayList.add(new Hang("Cáp chuyển từ Cổng USB sang PS2...", "14", "69000", "-39%", 5, R.drawable.dauchuyendoi));
        hangArrayList.add(new Hang("Cáp chuyển từ Cổng USB sang PS2...", "23", "44000", "-39%", 3, R.drawable.dauchuyendoipsps));
        hangArrayList.add(new Hang("Cáp chuyển từ Cổng USB sang PS2...", "42", "22000", "-39%", 4, R.drawable.daynguon));
        hangArrayList.add(new Hang("Cáp chuyển từ Cổng USB sang PS2...", "21", "14000", "-39%", 1, R.drawable.giacchuyen));
        hangArrayList.add(new Hang("Cáp chuyển từ Cổng USB sang PS2...", "35", "89000", "-39%", 4, R.drawable.daucam));
        hangArrayList.add(new Hang("Cáp chuyển từ Cổng USB sang PS2...", "51", "34000", "-39%", 2, R.drawable.dauchuyendoi));
        adapter = new HangAdapter(this, R.layout.item_hang, hangArrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail_Hang.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", hangArrayList.get(i).ten);
                bundle.putString("gia", hangArrayList.get(i).gia);
                bundle.putInt("img",hangArrayList.get(i).hinh);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}