package com.example.a02_viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {
    Button buttonAdd1,buttonAdd2;
    TextView textView;
    MyViewModelClass myViewModelClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd1 = findViewById(R.id.button_add1);
        buttonAdd2 = findViewById(R.id.button_add2);
        textView = findViewById(R.id.textview_display);
        myViewModelClass = ViewModelProviders.of(this).get(MyViewModelClass.class);
        textView.setText(String.valueOf(myViewModelClass.num));

        buttonAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModelClass.num++;
                textView.setText(String.valueOf(myViewModelClass.num));
            }
        });

        buttonAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModelClass.num += 2;
                textView.setText(String.valueOf(myViewModelClass.num));
            }
        });
    }
}
