package com.example.fruit_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView swigg_img, zomaro_img, dominos_img, pizzahub_img, mcdonal_img, uber_img, fresh_img, kfc_img, burgerking_img;
    private String swiggy;
    private String zomato;
    private String pizzahub;
    private String dominos;
    private String mcdonal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        swigg_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swiggy = "https://www.swiggy.com/";

                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n1", swiggy);
                startActivity(intent);

            }
        });

        zomaro_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zomato = "https://www.zomato.com/surat/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-NewUser_SC-Generic_L-PanIndia&utm_term=zomato&gclid=CjwKCAjwur-SBhB6EiwA5sKtjgSXJCkRFYhpWMIAzHeliU6VEttBJzZHEAw9NbOabT3Wwbk0Y0a7bRoCoiQQAvD_BwE";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n2", zomato);
                startActivity(intent);
            }
        });
        pizzahub_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizzahub = "https://www.pizzahut.co.in/menu/pizzas";

                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n3", pizzahub);
                startActivity(intent);
            }
        });
        dominos_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dominos = "https://pizzaonline.dominos.co.in/";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n4", dominos);
                startActivity(intent);
            }
        });
        mcdonal_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcdonal = "https://www.mcdonalds.com/us/en-us/mcdelivery.html";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n5", mcdonal);
                startActivity(intent);
            }
        });
        uber_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uber = "https://www.ubereats.com/";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n6", uber);
                startActivity(intent);
            }
        });
        fresh_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fresh = "https://www.freshmenu.com/";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n7", fresh);
                startActivity(intent);
            }
        });
        kfc_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kfc = "https://online.kfc.co.in/";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n8", kfc);
                startActivity(intent);
            }
        });
        burgerking_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String burgerking = "https://online.kfc.co.in/";
                Intent intent = new Intent(MainActivity.this, Swiggy.class);
                intent.putExtra("n9", burgerking);
                startActivity(intent);
            }
        });

    }


    private void blinding() {

        swigg_img = findViewById(R.id.swigg_img);
        zomaro_img = findViewById(R.id.zomaro_img);
        pizzahub_img = findViewById(R.id.pizzahub_img);
        dominos_img = findViewById(R.id.dominos_img);
        mcdonal_img = findViewById(R.id.mcdonal_img);
        uber_img = findViewById(R.id.uber_img);
        fresh_img = findViewById(R.id.fresh_img);
        kfc_img = findViewById(R.id.kfc_img);
        burgerking_img = findViewById(R.id.burgerking_img);
    }

}

//https://pizzaonline.dominos.co.in/      Dominps website
//https://www.pizzahut.co.in/   pizza hut
// zomato
//https://www.freshmenu.com/ fresshmenu
//https://www.mcdelivery.co.in/home mcdonal
//https://www.ubereats.com/
//https://www.bk.com/   burgerking
//https://online.kfc.co.in/ kfc



