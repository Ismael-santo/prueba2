package com.example.jenniserie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        resultado = (TextView) findViewById(R.id.resultado);



    }


    public void calcular(View v) {
        String valor1=et1.getText().toString();
        int result= Integer.parseInt(valor1);


        List<Integer> fib=new ArrayList<>();
        int a=0, b=1, c=b+a;
        fib.add(a);
        fib.add(b);





        for (int i = 0; i < result; i++) {
           c=b+a;
            a = b;
            b=c;
            fib.add(c);

            resultado.setText(String.valueOf("" + fib));

            if (c>1000){

                resultado.setText(String.valueOf("La serie excede a 1000"));
            }

        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.op1){
            finish();
            Intent op1 = new Intent(this, MainActivity.class);
            startActivity(op1);
        }
        return super.onOptionsItemSelected(item);


        }


    }


