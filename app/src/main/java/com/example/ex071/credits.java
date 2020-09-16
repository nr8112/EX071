package com.example.ex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    TextView t;
    String a ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        t=findViewById(R.id.tw_ans);
        showc();
    }

    public void showc() {
        Intent mi = getIntent();
        a= mi.getStringExtra("noa");
        t.setText("anser is:"+a);

    }
    public void go(View view) {
        finish();
    }
}
