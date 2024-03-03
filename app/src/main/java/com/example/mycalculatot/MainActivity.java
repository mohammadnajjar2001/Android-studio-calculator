package com.example.mycalculatot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
double input1=0,input2=0;
int conter=0,conteEqualr=0;
TextView edit1,edit2;
String resultAll="";

boolean Subtraction,Addition,Remainder_Of_Division,Decimal_Point,Multiplication,Dev;
Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonSub,buttonAdd,buttonRemOfDiv,buttonDec,buttonMul,buttonDev,buttonEqual,buttonDel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button) findViewById(R.id.button0);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        buttonSub=(Button) findViewById(R.id.buttonSubtraction);
        buttonAdd=(Button) findViewById(R.id.buttonAddition);
        buttonRemOfDiv=(Button) findViewById(R.id.buttonRemainder_Of_Division);
        buttonDec=(Button) findViewById(R.id.buttonDecimal_Point);
        buttonMul=(Button) findViewById(R.id.buttonMultiplication);
        buttonDev=(Button) findViewById(R.id.buttonDev);
        buttonEqual=(Button) findViewById(R.id.buttonequalse);
        buttonDel=(Button) findViewById(R.id.buttondel);

        edit1=(TextView) findViewById(R.id.textView2);
        edit2=(TextView) findViewById(R.id.textView1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   edit1.setText(edit1.getText()+"1");
               }
           });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.length()!=0){
                    input1=Float.parseFloat(edit1.getText()+"");
                    Addition=true;
                    Decimal_Point=false;
                    edit2.setText(edit1.getText());
                    edit2.setText(edit2.getText()+"+");
                    conter=0;
                    conteEqualr=0;
                    edit1.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.length()!=0){
                    input1=Float.parseFloat(edit1.getText()+"");
                    Subtraction=true;
                    Decimal_Point=false;
                    edit2.setText(edit1.getText());
                    edit2.setText(edit2.getText()+"-");
                    conter=0;
                    conteEqualr=0;
                    edit1.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.length()!=0){
                    input1=Float.parseFloat(edit1.getText()+"");
                    Multiplication=true;
                    Decimal_Point=false;
                    edit2.setText(edit1.getText());
                    edit2.setText(edit2.getText()+"x");
                    conter=0;
                    conteEqualr=0;
                    edit1.setText(null);
                }
            }
        });
        buttonDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.length()!=0){
                    input1=Float.parseFloat(edit1.getText()+"");
                    Dev=true;
                    Decimal_Point=false;
                    edit2.setText(edit1.getText());
                    edit2.setText(edit2.getText()+"÷");
                    conter=0;
                    conteEqualr=0;
                    edit1.setText(null);
                }
            }
        });
        buttonRemOfDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.length()!=0){
                    input1=Float.parseFloat(edit1.getText()+"");
                    Remainder_Of_Division=true;
                    Decimal_Point=false;
                    edit2.setText(edit1.getText());
                    edit2.setText(edit2.getText()+"%");
                    conter=0;
                    conteEqualr=0;
                    edit1.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Addition||Subtraction||Multiplication||Dev||Remainder_Of_Division){
                    input2=Float.parseFloat(edit1.getText()+"");
                    resultAll=edit2.getText().toString();
                    if(conteEqualr==0){
                        conteEqualr++;
                    edit2.setText(resultAll+edit1.getText()+"=");}



                }
                if(Addition){
                    edit1.setText(input1+input2+"");
                    Addition=false;
                }
                if(Subtraction){
                    edit1.setText(input1-input2+"");
                    Subtraction=false;
                }
                if(Multiplication){
                    edit1.setText(input1*input2+"");
                    Multiplication=false;
                }
                if(Dev){
                    edit1.setText(input1/input2+"");
                    Dev=false;
                }
                if(Remainder_Of_Division){
                    edit1.setText(input1%input2+"");
                    Remainder_Of_Division=false;
                }
                resultAll=edit2.getText().toString();
                if(conteEqualr==1){
                    conteEqualr++;
                edit2.setText(resultAll+edit1.getText());}

            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    edit1.setText(null);
                    conter++;
                    if(conter==2){
                        conter=0;
                        conteEqualr=0;
                        edit2.setText(null);
                    }
                    input1=0;
                    input2=0;
                }
        });
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Decimal_Point){
                    //لا تفعل اي شيء
                }
                else {
                    edit1.setText(edit1.getText()+".");
                    Decimal_Point=true;
                }
            }
        });
    }
}