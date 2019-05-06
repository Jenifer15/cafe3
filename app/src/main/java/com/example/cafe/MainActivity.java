package com.example.cafe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantidade = 0;
    int preço= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teste(View view){
//        TextView texteView = findViewById(R.id.teste);
//        TextView.setText("OI");
    }

    public void menos(View view){
        quantidade = quantidade - 1;
        TextView quanti = findViewById(R.id.quanti);
        quanti.setText(""+quantidade);
        ptotal();
    }

    public void somar(View view){
        quantidade = quantidade + 1;
        TextView quanti = findViewById(R.id.quanti);
        quanti.setText(""+quantidade);
        ptotal();
    }
    public void ptotal(){
        preço = preço * 3;
        TextView preço = findViewById(R.id.preço);
        preço.setText(""+preço);
    }

}
