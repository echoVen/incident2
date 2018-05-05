package com.example.administrator.incident2;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;

import java.util.jar.Attributes;

/**
 * Created by Administrator on 2018/5/6/006.
 */

public class Mybutton extends AppCompatButton{
    public Mybutton(Context context, AttributeSet attrs) {
        super(context,attrs);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.v("com.sise","the onKeyDown in MyButton");
        return  true;
    }
}

