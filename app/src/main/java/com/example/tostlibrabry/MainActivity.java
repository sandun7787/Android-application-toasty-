package com.example.tostlibrabry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {


    private Object Toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    public void showToast(android.view.View view) {
        switch(view.getId()){
            case R.id.button_Success:
                Toasty.success(this,"Success Toast",Toast.LENGHT_SHORT).show();
                break;

            case R.id.button_Error:
                Toasty.success(this,"Success Toast",Toast.LENGHT_SHORT).show();
                break;

            case R.id.button_Success:
                Toasty.success(this,"Success Toast",Toast.LENGHT_SHORT).show();
                break;

            case R.id.button_Success:
                Toasty.success(this,"Success Toast",Toast.LENGHT_SHORT).show();
                break;

            case R.id.button_Success:
                Toasty.success(this,"Success Toast",Toast.LENGHT_SHORT).show();
                break;

        }
    }
}