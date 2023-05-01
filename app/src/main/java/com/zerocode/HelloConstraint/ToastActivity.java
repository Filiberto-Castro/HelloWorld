package com.zerocode.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    private int count = 0;
    private TextView countValue;

    private Button countZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        countValue = (TextView) findViewById(R.id.show_count);
        countZero = (Button) findViewById(R.id.btnZero);
    }

    public void showToast(View view) {

        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {

        count++;
        countValue.setText(String.valueOf(count));


        if (count%2==0){
            int color = Color.GREEN;
            view.setBackgroundColor(color);
        }else {
            view.setBackgroundColor(Color.BLUE);
        }

        if (count != 0){
            countZero.setBackgroundColor(Color.RED);
        }else{
            countZero.setBackgroundColor(Color.GRAY);
        }


    }

    public void countZero(View view) {

        countValue.setText("0");
        count = 0;
        view.setBackgroundColor(Color.GRAY);

    }
}