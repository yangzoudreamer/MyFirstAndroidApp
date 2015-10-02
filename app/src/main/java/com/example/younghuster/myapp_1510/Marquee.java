package com.example.younghuster.myapp_1510;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by younghuster on 2015/10/2.
 */
class Marquee extends TextView{

    public Marquee(Context context) {
        super(context);
    }

    public Marquee(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Marquee(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    public Marquee(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }


    @Override
    public boolean isFocused() {
        return true;
    }
}
