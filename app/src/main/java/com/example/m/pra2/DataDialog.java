package com.example.m.pra2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.util.Log;

import java.util.Calendar;

/**
 * Created by m on 2016-06-27.
 */
public class DataDialog extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int years = calendar.get(Calendar.YEAR);
        Log.d("Uwaga","3");
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DataDialogListener listener = new DataDialogListener(getActivity());
        Log.d("Uwaga","4");
        DatePickerDialog pickerr = new DatePickerDialog(getActivity(),listener,years,month,day);
        Log.d("Uwaga","5");
        return pickerr;
    }
}
