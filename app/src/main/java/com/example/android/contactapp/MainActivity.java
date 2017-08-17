package com.example.android.contactapp;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.android.contactapp.Dialogs.FormDialog;

public class MainActivity extends AppCompatActivity {
    Button buttonReg;
    EditText editTextRes;
    FormDialog formDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
        formDialog = new FormDialog(this);
    }

    public void initViews() {
        buttonReg = (Button) findViewById(R.id.buttonReg);
        editTextRes = (EditText) findViewById(R.id.editTextResult);
    }

    public void initListeners() {
        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog myDialog = FormDialog.create();
                myDialog.show();
            }
        });
    }


}
