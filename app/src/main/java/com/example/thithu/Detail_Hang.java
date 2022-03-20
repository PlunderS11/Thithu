package com.example.thithu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail_Hang extends AppCompatActivity {
    TextView txtName, txtGia;
    ImageView imgHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hang);
        txtName = findViewById(R.id.ten);
        txtGia = findViewById(R.id.gia);
        imgHinh = findViewById(R.id.hinh);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtName.setText(bundle.getString("name"));
        txtGia.setText(bundle.getString("gia"));
        imgHinh.setImageResource(bundle.getInt("img"));
    }
}