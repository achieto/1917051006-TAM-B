package com.example.prianlyy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        TextView tittle = findViewById(R.id.toolbar_tittle);

        leftIcon.setOnClickListener(new View.OnClickListener(){
            @override
            public void onClick(view v){
                Toast.makeText(MainActivity.this, "You clicked in left icon", Toast.LENGTH_SHORT).show();
            }
        });
        rightIcon.setOnClickListener(new View.OnClickListener(){
            @override
            public void onClick(view v){
                Toast.makeText(MainActivity.this, "You clicked in right icon", Toast.LENGTH_SHORT).show();
            }
        });

        tittle.setText("Prianly");
    }
}