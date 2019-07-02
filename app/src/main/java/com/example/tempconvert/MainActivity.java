package com.example.tempconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button c2f_Btn;
    private Button f2c_Btn;
    private EditText input_Edt;
    private TextView output_TV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c2f_Btn=findViewById(R.id.c2f_btn);
        f2c_Btn=findViewById(R.id.f2c_btn);
        input_Edt=findViewById(R.id.input_edt);
        output_TV=findViewById(R.id.output_tv);

        userInput();

    }

    private void userInput(){

        c2f_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConverterClass converterClass=new ConverterClass();
                double degCel=Double.parseDouble(input_Edt.getText().toString());
                double degFar=converterClass.c2f_fn(degCel);
                output_TV.setText(Double.toString(degFar));


            }
        });


        f2c_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass=new ConverterClass();
                double degFar=Double.parseDouble(input_Edt.getText().toString());
                double degCel=converterClass.f2c_fn(degFar);
                output_TV.setText(Double.toString(degCel));

            }
        });

    }




}
