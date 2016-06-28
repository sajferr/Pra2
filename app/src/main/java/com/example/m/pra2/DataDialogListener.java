package com.example.m.pra2;

import android.app.DatePickerDialog;
import android.content.Context;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by m on 2016-06-27.
 */
public class DataDialogListener implements DatePickerDialog.OnDateSetListener {

   Context context;

    public DataDialogListener(Context context) {
        this.context = context;
        Log.d("Uwaga","7");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Log.d("Uwaga","6");
        Toast.makeText(context, "Udało się", Toast.LENGTH_SHORT).show();

    }
}
