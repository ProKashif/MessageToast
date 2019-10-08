package com.example.hellolib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.Toast;

public class Message {

    public static void showMessage(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showDebugLog(String key, String msg) {
        Log.d(key, msg);
    }

    public static void showAlertDialog(Context context, String title, String message) {
        new AlertDialog.Builder(context)
                .setTitle(title).
                setMessage(message).
                setPositiveButton("Ok",
                        null
                ).create().show();
    }
}