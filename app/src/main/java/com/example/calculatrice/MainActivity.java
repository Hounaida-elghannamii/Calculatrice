package com.example.calculatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button butt1,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9,butt0,nbutt,pbutt,dbutt,ebutt,kabutt,kbbutt,cbutt,mbutt,pobutt,acbutt;
    TextView res,sos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.res);
        sos=findViewById(R.id.sos);
        butt0=findViewById(R.id.butt0);
        butt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });

        butt1=findViewById(R.id.butt1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt2=findViewById(R.id.butt2);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt3=findViewById(R.id.butt3);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt4=findViewById(R.id.butt4);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt5=findViewById(R.id.butt5);
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt6=findViewById(R.id.butt6);
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt7=findViewById(R.id.butt7);
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt8=findViewById(R.id.butt8);
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        butt9=findViewById(R.id.butt9);
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        nbutt=findViewById(R.id.nbutt);
        nbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        pbutt=findViewById(R.id.pbutt);
        pbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        dbutt=findViewById(R.id.dbutt);
        dbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        mbutt=findViewById(R.id.mbutt);
        mbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        ebutt=findViewById(R.id.ebutt);
        ebutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sos.setText(res.getText());
            }
        });
        kabutt=findViewById(R.id.kabutt);
        kabutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        kbbutt=findViewById(R.id.kbbutt);
        kbbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        cbutt=findViewById(R.id.cbutt);
        cbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule.substring(0,calcule.length()-1);
                sos.setText(calcule);
                res.setText(calcule);
            }
        });
        pobutt=findViewById(R.id.pobutt);
        pobutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
        acbutt=findViewById(R.id.acbutt);
        acbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sos.setText("");
                res.setText("0");
            }
        });
        pbutt=findViewById(R.id.pbutt);
        pbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                String buttonText=button.getText().toString();
                // sos.setText(buttonText);
                String calcule=sos.getText().toString();
                calcule=calcule+buttonText;
                sos.setText(calcule);
                String finalR=getResult(calcule);
                if(!finalR.equals("Err")){
                    res.setText(finalR);
                }
            }
        });
    }
    String getResult(String data){
        try{
            Context context=Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable=context.initSafeStandardObjects();
            String finalR=context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalR.endsWith(".0")){
                finalR=finalR.replace(".0","");
            }
            return  finalR;
        }catch (Exception e){
            return "Err";
        }
    }

}