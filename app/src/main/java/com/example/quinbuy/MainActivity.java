package com.example.quinbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        getActionBar().hide();

        Button searchButton = findViewById(R.id.bt_home_search);
        Button wishButton = findViewById(R.id.bt_home_wishlist);
        if(getSharedPreferences("wishlist", MODE_PRIVATE).getAll().size() <= 0) {
            wishButton.setVisibility(View.INVISIBLE);
        }

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextHome = findViewById(R.id.et_home);
                String searchTerm = String.valueOf(editTextHome.getText());
                if(!searchTerm.equals("")) {
                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                    intent.putExtra("searchTerm", searchTerm);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Enter a valid Search Term!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        wishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductWishlist.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        SharedPreferences sharedPreferences = getSharedPreferences("wishlist", MODE_PRIVATE);
        if(sharedPreferences.getAll().size() > 0){
            findViewById(R.id.bt_home_wishlist).setVisibility(View.VISIBLE);
        }else {
            findViewById(R.id.bt_home_wishlist).setVisibility(View.INVISIBLE);
        }
    }
}