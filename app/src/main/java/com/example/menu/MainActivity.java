package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        TextView menu_item1 = findViewById(R.id.text_croissants);
        TextView menu_item2 = findViewById(R.id.text_fries);
        TextView menu_item3 = findViewById(R.id.text_burger);
        TextView menu_item4 = findViewById(R.id.text_egg_sandwich);
        String item1 = menu_item1.getText().toString();
        String item2 = menu_item2.getText().toString();
        String item3 = menu_item3.getText().toString();
        String item4 = menu_item4.getText().toString();

        Log.i(TAG, "\n Menu: \n"+ item1 + "\n" + item2 + "\n" + item3 + "\n" + item4 );

    }
}
