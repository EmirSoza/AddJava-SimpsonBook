package com.emirhan.simpsonbook.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.emirhan.simpsonbook.Adapter.CustomAdapter;
import com.emirhan.simpsonbook.Model.Simpson;
import com.emirhan.simpsonbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        Simpson homer = new Simpson("Homer Simpson", "Security", 50, R.drawable.homer);
        Simpson bart = new Simpson("Bart Simpson", "Student", 9, R.drawable.bart);
        Simpson lisa = new Simpson("Lisa Simpson", "Student", 8, R.drawable.lisa);

        final ArrayList<Simpson> simpsons = new ArrayList<Simpson>();
        simpsons.add(homer);
        simpsons.add(bart);
        simpsons.add(lisa);
        System.out.println(simpsons);
        CustomAdapter customAdapter = new CustomAdapter(simpsons,MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                //Normalde simpson i gonderemezdik ama simson mmodelini serialize dan implement ettik bu sekilde kullanmayi sagladik
                intent.putExtra("selectedSimpson", simpsons.get(position));
                System.out.println(simpsons.get(position));
                startActivity(intent);
            }
        });
    }
}