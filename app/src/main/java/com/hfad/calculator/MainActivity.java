package com.hfad.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editTextForOperand;
    TextView textView;

    Button buttonNumber7, buttonNumber8, buttonNumber9, buttonDivide,
            buttonNumber4, buttonNumber5, buttonNumber6, buttonMultiply,
            buttonNumber1, buttonNumber2, buttonNumber3, buttonMinus,
            buttonDot, buttonNumber0, buttonEquals, buttonPlus,
            buttonAC;

    boolean plus, minus, divide, multiply;
    double valueONE, valueTWO, valueResult, value;

    DecimalFormat formattedDouble = new DecimalFormat("#0.000000");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editTextForOperand = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        buttonNumber7 = findViewById(R.id.buttonNumber7);
        buttonNumber8 = findViewById(R.id.buttonNumber8);
        buttonNumber9 = findViewById(R.id.buttonNumber9);
        buttonDivide = findViewById(R.id.buttonDivide);

        buttonNumber4 = findViewById(R.id.buttonNumber4);
        buttonNumber5 = findViewById(R.id.buttonNumber5);
        buttonNumber6 = findViewById(R.id.buttonNumber6);
        buttonMultiply = findViewById(R.id.buttonMultiply);

        buttonNumber1 = findViewById(R.id.buttonNumber1);
        buttonNumber2 = findViewById(R.id.buttonNumber2);
        buttonNumber3 = findViewById(R.id.buttonNumber3);
        buttonMinus = findViewById(R.id.buttonMinus);

        buttonDot = findViewById(R.id.buttonDot);
        buttonNumber0 = findViewById(R.id.buttonNumber0);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonPlus = findViewById(R.id.buttonPlus);

        buttonAC = findViewById(R.id.buttonAC);

        buttonNumber0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }

                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "0");
                } else {
                    if ((String.valueOf(editText.getText().charAt(0)).equals("0"))) {
                        if (String.valueOf(editText.getText()).length() == 2 &&
                                String.valueOf(editText.getText().charAt(1)).equals(".")) {
                            editText.setText(editText.getText() + "0");
                        } else {
                            editText.setText(editText.getText());
                        }
                    } else {
                        editText.setText(editText.getText() + "0");
                    }
                }

            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!String.valueOf(editText.getText()).contains(".")) {
                    editText.setText(editText.getText() + ".");
                } else {
                    editText.setText(editText.getText());
                }
            }
        });

        buttonNumber1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "1");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "1");
                            } else {
                                editText.setText("1");
                            }
                        else {
                            editText.setText("1");
                        }
                    } else {
                        editText.setText(editText.getText() + "1");
                    }
                }
            }
        });

        buttonNumber2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "2");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "2");
                            } else {
                                editText.setText("2");
                            }
                        else {
                            editText.setText("2");
                        }
                    } else {
                        editText.setText(editText.getText() + "2");
                    }
                }
            }
        });

        buttonNumber3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "3");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "3");
                            } else {
                                editText.setText("3");
                            }
                        else {
                            editText.setText("3");
                        }
                    } else {
                        editText.setText(editText.getText() + "3");
                    }
                }
            }
        });

        buttonNumber4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "4");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "4");
                            } else {
                                editText.setText("4");
                            }
                        else {
                            editText.setText("4");
                        }
                    } else {
                        editText.setText(editText.getText() + "4");
                    }
                }
            }
        });

        buttonNumber5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "5");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "5");
                            } else {
                                editText.setText("5");
                            }
                        else {
                            editText.setText("5");
                        }
                    } else {
                        editText.setText(editText.getText() + "5");
                    }
                }
            }
        });

        buttonNumber6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "6");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "6");
                            } else {
                                editText.setText("6");
                            }
                        else {
                            editText.setText("6");
                        }
                    } else {
                        editText.setText(editText.getText() + "6");
                    }
                }
            }
        });

        buttonNumber7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "7");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "7");
                            } else {
                                editText.setText("7");
                            }
                        else {
                            editText.setText("7");
                        }
                    } else {
                        editText.setText(editText.getText() + "7");
                    }
                }
            }
        });

        buttonNumber8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "8");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "8");
                            } else {
                                editText.setText("8");
                            }
                        else {
                            editText.setText("8");
                        }
                    } else {
                        editText.setText(editText.getText() + "8");
                    }
                }
            }
        });

        buttonNumber9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (valueResult != 0) {
                    valueONE = valueResult;
                    valueResult = 0;
                }
                if (String.valueOf(editText.getText()).isEmpty()) {
                    editText.setText(editText.getText() + "9");
                } else {
                    if (String.valueOf(editText.getText().charAt(0)).equals("0")) {
                        if (String.valueOf(editText.getText()).length() == 2)
                            if (String.valueOf(editText.getText().charAt(1)).equals(".")) {
                                editText.setText(editText.getText() + "9");
                            } else {
                                editText.setText("9");
                            }
                        else {
                            editText.setText("9");
                        }
                    } else {
                        editText.setText(editText.getText() + "9");
                    }
                }
            }
        });

        /* parseDouble(String s)  returns a new double initialized to the value
        represented by the specified String, as performed by the valueOf method of class Double. */
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (String.valueOf(editTextForOperand.getText()).isEmpty()) {
                    if (editText != null) {
                        if (valueResult == 0) {
                            valueONE = Double.parseDouble(editText.getText() + "");
                        }
                    }
                    editTextForOperand.setText(editTextForOperand.getText() + "+");
                    plus = true;
                    editText.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (String.valueOf(editTextForOperand.getText()).isEmpty()) {
                    if (editText != null) {
                        if (valueResult == 0) {
                            valueONE = Double.parseDouble(editText.getText() + "");
                        }
                    }
                    editTextForOperand.setText(editTextForOperand.getText() + "-");
                    minus = true;
                    editText.setText(null);
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (String.valueOf(editTextForOperand.getText()).isEmpty()) {
                    if (editText != null) {
                        if (valueResult == 0) {
                            valueONE = Double.parseDouble(editText.getText() + "");
                        }
                    }
                    editTextForOperand.setText(editTextForOperand.getText() + "*");
                    multiply = true;
                    editText.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (String.valueOf(editTextForOperand.getText()).isEmpty()) {
                    if (editText != null) {
                        if (valueResult == 0) {
                            valueONE = Double.parseDouble(editText.getText() + "");
                        }
                    }
                    editTextForOperand.setText(editTextForOperand.getText() + "/");
                    divide = true;
                    editText.setText(null);
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(null);
                editTextForOperand.setText(null);
                textView.setText(null);
                valueONE = 0;
                valueTWO = 0;
                valueResult = 0;
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                valueTWO = Double.parseDouble(editText.getText() + "");

                if (plus == true) {
                    valueResult = valueONE + valueTWO;
                    textView.setText(valueONE + " + " + valueTWO + "\n = " + formattedDouble.format(valueResult));
                    plus = false;
                    editText.setText(null);
                    editTextForOperand.setText(null);
                }

                if (minus == true) {
                    valueResult = valueONE - valueTWO;
                    textView.setText(valueONE + " - " + valueTWO + "\n = " + formattedDouble.format(valueResult));
                    minus = false;
                    editText.setText(null);
                    editTextForOperand.setText(null);
                }

                if (multiply == true) {
                    valueResult = valueONE * valueTWO;
                    textView.setText(valueONE + " * " + valueTWO + "\n = " + formattedDouble.format(valueResult));
                    multiply = false;
                    editText.setText(null);
                    editTextForOperand.setText(null);
                }

                if (divide == true) {
                    valueResult = valueONE / valueTWO;
                    textView.setText(valueONE + " / " + valueTWO + "\n = " + formattedDouble.format(valueResult));
                    divide = false;
                    editText.setText(null);
                    editTextForOperand.setText(null);
                }
            }
        });
    }
}