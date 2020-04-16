package com.example.blackactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etInput1;
    private EditText etInput2;
    private EditText etInput3;
    private TextView tvOutput;
    private String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput1 = findViewById(R.id.etInputNim);
        etInput2 = findViewById(R.id.etInputNama);
        etInput3 = findViewById(R.id.etInputAlamat);
        tvOutput = findViewById(R.id.tvOutput);

    }
    public void BtnTampilkan(View v){
        tvOutput.setText("NIM\t:"+etInput1.getText()+"\n"+"NAMA\t:"+etInput2.getText()+"\n"+"ALAMAT\t"+etInput3.getText());
    }
}
