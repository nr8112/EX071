package com.example.ex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
     Double ans,a,b;
     char o='a';
      int num=5;
    String s,sAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.etn);
    }


    public void cred(View view) {
        Intent cr=new Intent(this,credits.class);
            sAns =String.valueOf(ans);
            cr.putExtra("noa", sAns);
            startActivity(cr);

        }


    public void hilok(View view) {
        s=et.getText().toString();
        if (s.isEmpty())
            Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show();
        else {
            et.getText().clear();
            a = Double.parseDouble(s);
            num = 1;
        }
    }

    public void shave(View view) {

        s = et.getText().toString();
        if (s.isEmpty()){
            Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show();
        et.setText("");
    }
        else {
            b = Double.parseDouble(s);

            switch (num) {
                case 1:
                    b = Double.parseDouble(et.getText().toString());
                    ans = a / b;
                    break;
                case 2:
                    b = Double.parseDouble(et.getText().toString());
                    ans = a * b;
                    break;
                case 3:
                    b = Double.parseDouble(et.getText().toString());
                    ans = a + b;
                    break;
                case 4:
                    b = Double.parseDouble(et.getText().toString());
                    ans = a - b;
                    break;
                default:
                    b = Double.parseDouble(et.getText().toString());
                    ans=b;

            }
            if(ans==null){
                et.setText("");
                Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show();
            }
            else et.setText( ""+ans);
        }



    }

    public void ploss(View view) {
        s=et.getText().toString();
        if (s.isEmpty())
        Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            et.getText().clear();
            a = Double.parseDouble(s);
            num = 3;
        }
    }

    public void cleer(View view) {
        et.getText().clear();
        s="";
        a=null;
        b=null;
        num=5;

    }

    public void kefell(View view) {
        s=et.getText().toString();
        if (s.isEmpty())
        Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            et.getText().clear();
            a = Double.parseDouble(s);
            num = 2;
        }

    }

    public void minos(View view) {
        s=et.getText().toString();
        if (s.isEmpty())
        Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            et.getText().clear();
            a = Double.parseDouble(s);
            num = 4;
        }

    }
}
