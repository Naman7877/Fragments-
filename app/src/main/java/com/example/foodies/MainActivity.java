package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.foodies.fragment.firstFragment;
import com.example.foodies.fragment.secondFragment;

public class MainActivity extends AppCompatActivity {
    Button first,second;
    LinearLayout linearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        linearlayout=findViewById(R.id.linearlayout);
        getSupportActionBar().hide();


        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstFragment f1=new firstFragment();

                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, f1);
                transaction.commit();


            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondFragment f2=new secondFragment();

                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, f2);
                transaction.commit();

            }
        });
    }
}