package com.example.myfirt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText plName, plEmail ;
    RadioButton rdNam, rdNu;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        plName = (EditText)findViewById(R.id.plName);
        plEmail = (EditText)findViewById(R.id.plEmail);
        rdNam = (RadioButton)findViewById(R.id.rdNam);
        rdNu = (RadioButton)findViewById(R.id.rdNu);
        spin = (Spinner)findViewById(R.id.spin);
    }
    public void display(View v){
        String a = plName.getText().toString() + "\n" + plEmail.getText().toString() + "\n" + spin.getSelectedItem().toString();
       if(rdNam.isChecked()==true){
           a += "\n" + rdNam.getText().toString();
       }
       else{
           a += "\n" + rdNu.getText().toString();
       }
        txt.setText(a);
        plName.setText("");
        plEmail.setText("");
    }
}