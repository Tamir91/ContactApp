package com.example.android.contactapp.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.contactapp.R;

/**
 * Created by Android on 8/17/2017.
 */

public class FormDialog {
    static Context context;

    // EditText resultText
    public FormDialog(Context context) {
        this.context = context;
    }


    public static Dialog create() {


        final Dialog formDialog = new Dialog(context);
        formDialog.setContentView(R.layout.my_layout);
        final EditText nameText = (EditText) formDialog.findViewById(R.id.nameEditText);
        final EditText ageText = (EditText) formDialog.findViewById(R.id.ageEditText);
        final EditText titleText = (EditText) formDialog.findViewById(R.id.titleEditText);
        final EditText salaryText = (EditText) formDialog.findViewById(R.id.salaryEditText);
        Button btn = (Button) formDialog.findViewById(R.id.buttonSend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String formText = nameText.getText() + ","
                        + ageText.getText() + ","
                        + titleText.getText() + ","
                        + salaryText.getText() + "NIS";
                //resultText.setText(formText);
                formDialog.dismiss();
            }
        });
        return formDialog;
    }
}
