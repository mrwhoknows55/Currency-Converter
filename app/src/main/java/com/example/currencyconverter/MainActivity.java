package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {


    Button pound, euro, usd, yen, dinar, ruble, asd, cad, btc;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.btnEuro);
        usd = findViewById(R.id.btnUsd);
        pound = findViewById(R.id.btnPound);
        yen = findViewById(R.id.btnYen);
        dinar = findViewById(R.id.btnDinar);
        asd = findViewById(R.id.btnAsd);
        ruble = findViewById(R.id.btnRuble);
        cad = findViewById(R.id.btnCad);
        btc = findViewById(R.id.btnBtc);

        editText = findViewById(R.id.editText);

        textView = findViewById(R.id.textView);

//        Euro

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.01280;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" €");
                }
            }
        });

//        USD
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.0145;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k) +" $");
                }
            }
        });

 //        Pound
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.010910;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" £");
                }
            }
        });

//        Yen

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 1.6169;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" ¥");
                }
            }
        });

//        Ruble

        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.93997;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" \u20BD");
                }
            }
        });

//        Dinar

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.0044100;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k) +" KWD");
                }
            }
        });

//        ASD

        asd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.020470;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" A$");
                }
            }
        });

//        CAD

        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.019340;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" C$");
                }
            }
        });

//        BTC

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Enter Value");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.000003703;

                    DecimalFormat numFormat = new DecimalFormat("0.00");

                    textView.setText("" + numFormat.format(k)+" BTC");
                }
            }
        });


    }
}
