package com.example.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class PaintView extends View {

    //Constructor
    public PaintView(Context context, AttributeSet attr) {
        super(context, attr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //畫布顏色
        canvas.drawColor(Color.WHITE);

        //畫筆
        Paint paint = new Paint();
        //畫筆顏色
        paint.setColor(Color.GRAY);

        //畫點
        canvas.drawPoint(50,50,paint);

    }
}
