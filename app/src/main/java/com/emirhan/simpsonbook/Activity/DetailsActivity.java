package com.emirhan.simpsonbook.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.emirhan.simpsonbook.Model.Simpson;
import com.emirhan.simpsonbook.R;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name;
    TextView job;
    TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.imageView);
        name = findViewById(R.id.name);
        job = findViewById(R.id.job);
        age = findViewById(R.id.age);

        Intent intent = getIntent();
        Simpson current = (Simpson) intent.getSerializableExtra("selectedSimpson");
        System.out.println(current.getName()+current.getJob()+current.getAge());
        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),current.getImageId());
        imageView.setImageBitmap(bitmap);

        age.setText("Age: " + current.getAge());
        name.setText(current.getName());
        job.setText(current.getJob());



    }
}