package com.as.customview;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class BasicView extends View {

    public BasicView(Context context) {
        this(context, null);
    }

    public BasicView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public BasicView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
