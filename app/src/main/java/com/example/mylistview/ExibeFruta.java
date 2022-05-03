package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylistview.model.Fruta;

public class ExibeFruta extends AppCompatActivity {
    Fruta fruta;
    TextView textViewNomeFruta;
    ImageView imageViewFruta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_fruta);


    }




}