package com.example.resultassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Credit extends AppCompatActivity {


    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String credit=editText.getText().toString();
                Intent mainintent=new Intent(Credit.this,MainActivity.class);
                mainintent.putExtra("abc",credit);
                startActivity(mainintent);
            }
        });
    }
}
