package com.kingandroid.kingapp.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.kingandroid.kingapp.R;

public class DialogFragmentShow extends DialogFragment {
    static DialogFragmentShow newInstance(String title)
    {
        DialogFragmentShow dialog = new DialogFragmentShow();
        Bundle args = new Bundle();
        args.putString("title", title);
        dialog.setArguments(args);
        return dialog;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(R.drawable.tuxing);
        builder.setTitle(title);
        builder.setPositiveButton("OK", OkAction);
        builder.setNegativeButton("Cancel", CancleAction);
        return builder.create();
    }



    DialogInterface.OnClickListener OkAction = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            ((DialogFragmentExampleActivity)
                    getActivity()).doPositiveClick();
        }
    };


    DialogInterface.OnClickListener CancleAction = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            ((DialogFragmentExampleActivity)
                    getActivity()).doNegativeClick();
        }
    };




}
