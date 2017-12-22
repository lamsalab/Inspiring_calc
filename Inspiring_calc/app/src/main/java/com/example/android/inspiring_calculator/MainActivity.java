package com.example.android.inspiring_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView screen;
    Button[] numArr;
    Button[] oprArr;
    static boolean clickedInspireMe;
    static boolean clickedAns;
    String opr;
    public HashMap<Integer, String> quotes;

    private final int NUMS = 10;
    private final int OPRS = 8;

    StringBuilder num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (EditText) findViewById(R.id.text);
        numArr = new Button[NUMS];
        oprArr = new Button[OPRS];

        for (int i = 0; i < NUMS; i++) {
            numArr[i] = (Button) findViewById(getNumId(i));

        }
        for (int i = 0; i < OPRS; i++) {
            oprArr[i] = (Button) findViewById(getOprId(i));

        }
        num1 = new StringBuilder();
        num2 = new StringBuilder();


        quotes = new HashMap<>();
        try {
            insertQuotes(quotes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < NUMS; i++) {
            numArr[i].setOnClickListener(this);

        }
        for (int i = 0; i < OPRS; i++) {
            oprArr[i].setOnClickListener(this);
        }


    }

    public double finalNumber(String num1, String num2, String opr) {
        switch (opr) {
            case "Add":
                return Double.parseDouble(num1) + Double.parseDouble(num2);
            case "Subtract":
                return Double.parseDouble(num1) - Double.parseDouble(num2);
            case "Multiply":
                return Double.parseDouble(num1) * Double.parseDouble(num2);
            case "Divide":
                return Double.parseDouble(num1) / Double.parseDouble(num2);
            default:
                return -1.0;
        }
    }

    public int getNumId(int i) {
        switch (i) {
            case 0:
                return R.id.button0;
            case 1:
                return R.id.button1;
            case 2:
                return R.id.button2;
            case 3:
                return R.id.button3;
            case 4:
                return R.id.button4;
            case 5:
                return R.id.button5;
            case 6:
                return R.id.button6;
            case 7:
                return R.id.button7;
            case 8:
                return R.id.button8;
            case 9:
                return R.id.button9;
            default:
                return -1;
        }
    }

    public int getOprId(int i) {
        switch (i) {
            case 0:
                return R.id.buttonAdd;
            case 1:
                return R.id.buttonSubtract;
            case 2:
                return R.id.buttonMultiply;
            case 3:
                return R.id.buttonDivide;
            case 4:
                return R.id.buttonDecimal;
            case 5:
                return R.id.buttonAns;
            case 6:
                return R.id.buttonCLR;
            case 7:
                return R.id.buttonInspire;
            default:
                return -1;
        }
    }

    @Override
    public void onClick(final View v) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                switch (v.getId()) {
                    case R.id.button0:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "0");
                        break;

                    case R.id.button1:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "1");
                        break;

                    case R.id.button2:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "2");
                        break;

                    case R.id.button3:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "3");
                        break;

                    case R.id.button4:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "4");
                        break;

                    case R.id.button5:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "5");
                        break;

                    case R.id.button6:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "6");
                        break;

                    case R.id.button7:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "7");
                        break;

                    case R.id.button8:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "8");
                        break;

                    case R.id.button9:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + "9");
                        break;

                    case R.id.buttonDecimal:
                        if(clickedAns){
                            screen.setText(null);
                            clickedAns = false;
                            clickedInspireMe = false;
                            num1.setLength(0);
                        }
                        screen.setText(screen.getText() + ".");
                        break;

                    case R.id.buttonAdd:
                        opr = "Add";
                        num1.append(screen.getText());
                        screen.setText(null);
                        break;

                    case R.id.buttonSubtract:
                        opr = "Subtract";
                        num1.append(screen.getText());
                        screen.setText(null);
                        break;

                    case R.id.buttonMultiply:
                        opr = "Multiply";
                        num1.append(screen.getText());
                        screen.setText(null);
                        break;

                    case R.id.buttonDivide:
                        opr = "Divide";
                        num1.append(screen.getText());
                        screen.setText(null);
                        break;

                    case R.id.buttonAns:
                        double answer;
                        String num2 = screen.getText().toString();
                        clickedAns = true;
                        if(num2.charAt(num2.length() - 1) == '.' ||
                                num1.charAt(num1.toString().length() - 1) == '.'){
                            screen.setText("Please enter a valid number");
                        }
                        else if (clickedInspireMe == true) {
                            screen.setText("hahah");
                            screen.setText(null);
                        }
                        else
                        {
                            answer = finalNumber(num1.toString(), num2, opr);
                            screen.setText(answer + "");
                        }
                        break;

                    case R.id.buttonCLR:
                        screen.setText(null);
                        if(num1.toString() != "") {
                            num1.delete(0, num1.length() - 1);
                        }
                        break;

                    case R.id.buttonInspire:
                        int random;
                        Random rand = new Random();
                        random = rand.nextInt(quotes.size());
                        screen.setText(quotes.get(random));
                        clickedInspireMe = true;
                    default:
                        return;
                }
            }
        });

    }
    public void insertQuotes(final HashMap map) throws IOException {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String fileName = "quotes.txt";
                int i = 0;
                try {
                    InputStream is = getAssets().open("quotes.txt");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String line;
                    StringBuilder out = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        out.append(line);
                        map.put(i, out.toString());
                        out.setLength(0);
                        i++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}

