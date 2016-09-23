package com.example.yukai.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yukai on 16/9/22.
 */

public class LineView extends SortedDividerViewGroup {
    public static final int COUNT = 5;

    public static final int KEY_0 = 0;
    public static final int KEY_1 = 1;
    public static final int KEY_2 = 2;
    public static final int KEY_3 = 3;
    public static final int KEY_4 = 4;

    public LineView(Context context) {
        this(context, null);
    }

    public LineView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected final int getTotalViewCount() {
        return COUNT;
    }

    @Override
    protected View getDividerView(int index) {
        TextView view = new TextView(getContext());
        view.setTextColor(0xffffffff);
        view.setText(String.valueOf(index+1));
        view.setBackgroundColor(0xff000000);
        view.setGravity(Gravity.CENTER_VERTICAL);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(20, 150);
        view.setLayoutParams(params);
        return view;
    }

}
