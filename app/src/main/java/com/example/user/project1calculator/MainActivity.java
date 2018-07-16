package com.example.user.project1calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonmc;
    Button buttonmr;
    Button buttonmplus;
    Button buttonmminus;
    Button buttonms;
    Button buttonpercent;
    Button buttonsqrt;
    Button buttonsqr;
    Button buttoninverse;
    Button buttonce;
    Button buttonc;
    Button buttonbksp;
    Button buttondivide;
    Button buttonmultiply;
    Button buttonminus;
    Button buttonplus;
    Button buttontimesminus1;
    Button buttondot;
    Button buttonequal;
    TextView textViewResult;

    String tmp;
    String result;
    String operator;
    float Mem;

    int bt[] = new int[24];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add24Buttons();
        result = "0";
        initControl();
        initControlListener();
    }

    private void add24Buttons() {
        String[] label = {
                "%", "sqrt", "x^2", "1/x",
                "CE", "C", "BkSp", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "="
        };
        GridLayout gridLayout = getGridLayout();
        for (int i = 0; i < 24; i++) {
            Button btn = createButton(label[i], i);
            appendThisButtonToGrid(btn,gridLayout);
            bt[i]=btn.getId();
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View arg0){
                    int id = arg0.getId();
                    Button b = findViewById(id);
                    Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void initControl(){
        buttonpercent   = findViewById(bt[0]);
        buttonsqrt      = findViewById(bt[1]);
        buttonsqr       = findViewById(bt[2]);
        buttoninverse   = findViewById(bt[3]);
        buttonce        = findViewById(bt[4]);
        buttonc         = findViewById(bt[5]);
        buttonbksp      = findViewById(bt[6]);
        buttondivide    = findViewById(bt[7]);
        button7         = findViewById(bt[8]);
        button8         = findViewById(bt[9]);
        button9         = findViewById(bt[10]);
        buttonmultiply  = findViewById(bt[11]);
        button4         = findViewById(bt[12]);
        button5         = findViewById(bt[13]);
        button6         = findViewById(bt[14]);
        buttonminus     = findViewById(bt[15]);
        button1         = findViewById(bt[16]);
        button2         = findViewById(bt[17]);
        button3         = findViewById(bt[18]);
        buttonplus      = findViewById(bt[19]);
        buttontimesminus1=findViewById(bt[20]);
        button0         = findViewById(bt[21]);
        buttondot       = findViewById(bt[22]);
        buttonequal     = findViewById(bt[23]);
        buttonmminus    = findViewById(R.id.buttonMMinus);
        buttonmplus     = findViewById(R.id.buttonMPlus);
        buttonmc        = findViewById(R.id.buttonMC);
        buttonmr        = findViewById(R.id.buttonMR);
        buttonms        = findViewById(R.id.buttonMS);
        textViewResult  = findViewById(R.id.editNumber);
    }

    private void initControlListener(){
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onNumberButtonClicked("0");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onNumberButtonClicked("1");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("2");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("3");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("4");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("5");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("6");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("7");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("8");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("9");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        buttonce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClearButtonClicked();
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClearButtonClicked();
                operator="";
                tmp="0";
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        //the following buttons are binary operations
        buttonplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onOperationButtonClicked("+");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onOperationButtonClicked("-");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttonmultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onOperationButtonClicked("X");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onOperationButtonClicked("/");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        //calculate for binary operations
        buttonequal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onCalButtonClicked();
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        //the following buttons are unary operations
        buttonpercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onUnaryOperatorButtonClicked("%");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttonsqrt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onUnaryOperatorButtonClicked("sqrt");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttonsqr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onUnaryOperatorButtonClicked("x^2");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttoninverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUnaryOperatorButtonClicked("1/x");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        buttontimesminus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUnaryOperatorButtonClicked("+/-");
                int id = v.getId();
                Button b = findViewById(id);
                Toast.makeText(getApplicationContext(), b.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void onUnaryOperatorButtonClicked(String arity){
        try{
            float res = Integer.valueOf(textViewResult.getText().toString());
            switch (arity){
                case "%":
                    res = res/100;
                    break;
                case "sqrt":
                    res = (float) Math.sqrt(res);
                    break;
                case "x^2":
                    res = res * res;
                    break;
                case "1/x":
                    res = 1 / res;
                    break;
                case "+/-":
                    res = -res;
                    break;
                default:
                    break;
            }
            if(res == (int)res)
                result = String.valueOf((int)res);
            else
                result = String.valueOf(res);
            textViewResult.setText(result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void onCalButtonClicked(){
        try{
            float res=0;
            float number1 = Float.valueOf(tmp);
            float number2 = Float.valueOf(textViewResult.getText().toString());
            switch (operator){
                case "+":
                    res = number1 + number2;
                    break;
                case "-":
                    res = number1 - number2;
                    break;
                case "X":
                    res = number1 * number2;
                    break;
                case "/":
                    res = number1 / number2;
                    break;
                default:
                    break;
            }
            operator="";
            if(res == (int)res)
                result = String.valueOf((int)res);
            else
                result = String.valueOf(res);
            textViewResult.setText(result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void onOperationButtonClicked(String operator){
        tmp = textViewResult.getText().toString();
        onClearButtonClicked();
        this.operator = operator;
    }

    private void onNumberButtonClicked(String pos){
        result = textViewResult.getText().toString();
        if (result.compareTo("0") == 0)
            result = "";
        result = result + pos;
        textViewResult.setText(result);
    }

    private void onClearButtonClicked(){
        result = "0";
        textViewResult.setText(result);
    }

    private void appendThisButtonToGrid(Button btn, GridLayout gridLayout) {
        GridLayout.LayoutParams parem = new GridLayout.LayoutParams(GridLayout.spec(GridLayout.UNDEFINED, 1f), GridLayout.spec(GridLayout.UNDEFINED, 1f));

        gridLayout.addView(btn, parem);
    }

    private GridLayout getGridLayout() {
        return (GridLayout)findViewById(R.id.gridLayout);
    }

    private Button createButton(String s, int i) {
        Button btn = new Button(this);
        btn.setText(s);
        btn.setId(1505+i);
        return btn;
    }

    public void onButtonMCClick(View view) {
        Mem = 0;
    }

    public void onButtonMRClick(View view) {
        if(Mem != (int)Mem)
            textViewResult.setText(String.valueOf(Mem));
        else
            textViewResult.setText(String.valueOf((int)Mem));
    }

    public void onButtonMPlusClick(View view) {
        float numberOnTextView = Float.valueOf(textViewResult.getText().toString());
        Mem += numberOnTextView;
    }

    public void onButtonMMinusClick(View view) {
        float numberOnTextView = Float.valueOf(textViewResult.getText().toString());
        Mem -= numberOnTextView;
    }

    public void onButtonMSClick(View view) {
        float numberOnTextView = Float.valueOf(textViewResult.getText().toString());
        Mem = numberOnTextView;
    }
}
