package com.alfianzv.hadiah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(this);

        TextView etName = findViewById(R.id.et_name);

        Button btnViewDrink = findViewById(R.id.btn_view_drink);

        btnViewDrink.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });

    }

    @Override
    public void onClick(View v) {
        Button btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(this);

        TextView etName = findViewById(R.id.et_name);

        if (v.getId() == R.id.btn_submit) {
            Toast.makeText(MainActivity.this, "Please Press Again", Toast.LENGTH_SHORT).show();

            btnSubmit.setOnClickListener(view ->  {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", etName.getText().toString());
                startActivity(intent);
            });
        }
    }

}