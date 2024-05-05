package com.example.mesure_glycemie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mesure_glycemie.R;

public class home_activity extends AppCompatActivity {
    private Button btnConsultation ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        btnConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home_activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
    private  void init(){
        btnConsultation=findViewById(R.id.btnConsultation);
    }
}