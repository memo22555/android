package com.example.myapplication6;



import android.app.Dialog;
import android.app.Person;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText price;
    TextView tv ;
    Button sum,clear,fiveP,tenP;
    int S=0;

    private AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        price=findViewById(R.id.input);

        tv=findViewById(R.id.Result);
        sum=findViewById(R.id.sum);
        clear=findViewById(R.id.clear);
        fiveP=findViewById(R.id.fiveP);
        tenP=findViewById(R.id.tenP);





        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


                    S = S + Integer.parseInt(price.getText().toString());

                    tv.setText(String.valueOf(S));
                    price.setText("");


                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "please Enter the price", Toast.LENGTH_SHORT).show();
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S=0;
                tv.setText("");
            }
        });
        fiveP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int oldp=S;
                int Discount=S *5 /100;
                tv.setText("Before"+oldp+"\n the price after 5% Discount is :"+(S-Discount));
            }
        });
        tenP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  oldp=S;
                int Discount=S *10 /100;
                tv.setText("Before"+oldp+"\nthe price after 10% Discount is :"+(S-Discount));
            }
        });


    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        alertDialog=new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle(R.string.setTitle);
        alertDialog.setMessage(R.string.setmessage);
        alertDialog.setPositiveButton(R.string.postivebtn, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        alertDialog.setNegativeButton(R.string.negativebtn, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertDialog.setCancelable(false);
        alertDialog.create();
        alertDialog.show();
    }

}