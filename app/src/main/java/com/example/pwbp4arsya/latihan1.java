package com.example.pwbp4arsya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class latihan1 extends AppCompatActivity {

    private Button btnHitung = null;
    private EditText edtHasil = null;
    private EditText edtBilA = null;
    private EditText edtBilB = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan1);
        initComponent();
    }

    private void initComponent() {
        edtHasil = (EditText) findViewById(R.id.edt_hasil);
        edtBilA = (EditText) findViewById(R.id.edt_bilA);
        edtBilB = (EditText) findViewById(R.id.edt_bilB);

        btnHitung = (Button) findViewById(R.id.btn_hitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtHasil.setText(String.valueOf(tambah(Integer.parseInt(edtBilA.getText().toString()),Integer.parseInt(edtBilB.getText().toString()))));
            }
        });
    }

    private int tambah(int valA, int valB) {
        return valA + valB;
    }
}
