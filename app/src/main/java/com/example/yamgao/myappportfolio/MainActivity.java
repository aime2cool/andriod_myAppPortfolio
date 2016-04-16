package com.example.yamgao.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view) {
        Context context = getApplicationContext();
        Button b = (Button)view;

        String buttonText = b.getText().toString();
        StringBuilder sb = new StringBuilder("This button will launch my ").append(buttonText).append(" app");

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, sb.toString(), duration);
        toast.show();
    }
}
