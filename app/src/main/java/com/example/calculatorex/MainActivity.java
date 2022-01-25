package com.example.calculatorex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private EditText edit;
        private Button btn0, btn1,btn2,btn3, btn4,btn5, btn6, btn7, btn8,btn9
                ,add,sub,mul,div, clear,enter;
        int number;
        int temp;
        int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit=findViewById(R.id.edit);
        btn1=(Button)findViewById(R.id. btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        add=(Button)findViewById(R.id.add);
        btn4=(Button)findViewById(R.id. btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        sub=(Button)findViewById(R.id.sub);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        mul=(Button)findViewById(R.id.mul);
        btn0=(Button)findViewById(R.id.btn0);
        clear=(Button)findViewById(R.id.clear);
        enter=(Button)findViewById(R.id.enter);
        div=(Button)findViewById(R.id.div);

        View.OnClickListener click=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //edit.setText(((Button)view).getText());
                String text=edit.getText().toString();
                text+=((Button)view).getText();
                edit.setText(text);
            }
        };
        btn0.setOnClickListener(click);
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btn6.setOnClickListener(click);
        btn7.setOnClickListener(click);
        btn8.setOnClickListener(click);
        btn9.setOnClickListener(click);

        View.OnClickListener cal=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((Button)view==add){
                    String text=edit.getText().toString();
                    number=Integer.parseInt(text);
                    temp=1;
                    edit.setText("");
                }
                else if((Button)view==sub){
                    String text=edit.getText().toString();
                    number=Integer.parseInt(text);
                    temp=2;
                    edit.setText("");
                }
                else if((Button)view==mul){
                    String text=edit.getText().toString();
                    number=Integer.parseInt(text);
                    temp=3;
                    edit.setText("");
                }
                else if((Button)view==div){
                    String text=edit.getText().toString();
                    number=Integer.parseInt(text);
                    temp=4;
                    edit.setText("");
                }

                else if((Button)view==enter){
                    if(temp==1) {
                        res = number + Integer.valueOf(edit.getText().toString());
                        edit.setText(String.valueOf(res));
                    }
                    else if(temp==2){
                        res=number-Integer.valueOf(edit.getText().toString());
                        edit.setText(String.valueOf(res));
                    }
                    else if(temp==3){
                        res=number*Integer.valueOf(edit.getText().toString());
                        edit.setText(String.valueOf(res));
                    }
                    else if(temp==4){
                        res=number/Integer.valueOf(edit.getText().toString());
                        edit.setText(String.valueOf(res));
                    }
                }

            }
        };

        add.setOnClickListener(cal);
        sub.setOnClickListener(cal);
        mul.setOnClickListener(cal);
        div.setOnClickListener(cal);
        enter.setOnClickListener(cal);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res=0;
                edit.setText("");

            }
        });

    }
}