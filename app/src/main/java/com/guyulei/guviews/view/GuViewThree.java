package com.guyulei.guviews.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by A on 2017/11/7.
 */

public class GuViewThree extends View {

    Paint  paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path   path  = new Path();
    String text  = "顾雨磊的女朋友叫周红伟";


    public GuViewThree(Context context) {
        super(context);
    }

    public GuViewThree(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GuViewThree(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(30);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //1
        /*paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100, 150);
        path.lineTo(200, 100);
        path.lineTo(300, 100);
        path.lineTo(400, 150);
        path.lineTo(500, 300);
        path.lineTo(400, 350);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        paint.setPathEffect(new CornerPathEffect(60));
        canvas.drawPath(path, paint);
        paint.setColor(Color.RED);
        paint.setTextSize(40);
        canvas.drawTextOnPath("顾雨磊的女朋友叫周红伟", path, 0, -10, paint);*/

        //2 StaticLayout
        /*width 是文字区域的宽度，文字到达这个宽度后就会自动换行；
        align 是文字的对齐方向
        spacingmult 是行间距的倍数，通常情况下填 1 就好；
        spacingadd 是行间距的额外增加值，通常情况下填 0 就好；
        includeadd 是指是否在文字上下添加额外的空间，来避免某些过高的字符的绘制出现越界*/
        /*TextPaint textPaint1 = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        textPaint1.setTextSize(30);
        String text1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        StaticLayout staticLayout1 = new StaticLayout(text1, textPaint1, 300, Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
        String text2 = "a\nbc\ndefghi\njklm\nnopqrst\nuvwx\nyz";
        StaticLayout staticLayout2 = new StaticLayout(text2, textPaint1, 600, Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
        canvas.save();
        canvas.translate(50, 100);
        staticLayout1.draw(canvas);
        canvas.translate(0, 200);
        staticLayout2.draw(canvas);
        canvas.restore();*/

        //
        /*paint.setTextSize(30);
        String text = "顾雨磊的女朋友叫周红伟";
        paint.setTypeface(Typeface.DEFAULT);
        canvas.drawText(text, 100, 50, paint);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText(text, 100, 100, paint);
        paint.setTypeface(Typeface.MONOSPACE);
        canvas.drawText(text, 100, 150, paint);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawText(text, 100, 200, paint);
        paint.setTypeface(Typeface.SERIF);
        canvas.drawText(text, 100, 250, paint);
        paint.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        canvas.drawText(text, 100, 300, paint);*/
        /*paint.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Satisfy-Regular.ttf"));
        canvas.drawText(text, 100, 450, paint);*/
        //
        /*paint.setTextSize(30);
        String text = "顾雨磊的女朋友叫周红伟";
        paint.setFakeBoldText(false);
        canvas.drawText(text, 100, 150, paint);
        paint.setFakeBoldText(true);
        canvas.drawText(text, 100, 230, paint);*/
        //
       /* paint.setTextSize(30);
        String text = "顾雨磊的女朋友叫周红伟";
        paint.setStrikeThruText(true);
        canvas.drawText(text, 100, 300, paint);*/

        //
       /* paint.setTextSize(30);
        String text = "顾雨磊的女朋友叫周红伟";
        paint.setUnderlineText(true);
        canvas.drawText(text, 100, 150, paint);*/

        //

        /*paint.setTextSkewX(-0.5f);
        canvas.drawText(text, 100, 150, paint);*/
        //
        /*paint.setTextScaleX(1);
        canvas.drawText(text, 100, 150, paint);
        paint.setTextScaleX(0.8f);
        canvas.drawText(text, 100, 230, paint);
        paint.setTextScaleX(1.2f);
        canvas.drawText(text, 100, 310, paint);*/

        //
        /*paint.setLetterSpacing(1);
        canvas.drawText(text, 100, 150, paint);
        paint.setLetterSpacing(0.8f);
        canvas.drawText(text, 100, 230, paint);
        paint.setLetterSpacing(1.2f);
        canvas.drawText(text, 100, 310, paint);*/

        //
        /*paint.setFontFeatureSettings("smcp"); // 设置 "small caps"
        canvas.drawText(text, 100, 150, paint);*/

        //
       /* paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(text, 500, 150, paint);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(text, 500, 200, paint);
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(text, 500, 400, paint);*/

        //
        /*paint.setTextLocale(Locale.CHINA); // 简体中文
        canvas.drawText(text, 150, 150, paint);
        paint.setTextLocale(Locale.TAIWAN); // 繁体中文
        canvas.drawText(text, 150, 200, paint);
        paint.setTextLocale(Locale.JAPAN); // 日语
        canvas.drawText(text, 150, 250, paint);*/

        //
        /*canvas.drawText(text, 100, 150, paint);
        canvas.drawText(text, 100, 150 + paint.getFontSpacing(), paint);
        canvas.drawText(text, 100, 150 + paint.getFontSpacing() * 2, paint);*/

        //
        /*float offsetX = 100;
        float offsetY = 100;
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(text, offsetX, offsetY, paint);
        Rect bounds = new Rect();
        paint.getTextBounds(text, 0, text.length(), bounds);
        bounds.left += offsetX;
        bounds.top += offsetY;
        bounds.right += offsetX;
        bounds.bottom += offsetY;
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(bounds, paint);*/

        //
        /*float offsetX = 100;
        float offsetY = 100;
        canvas.drawText(text, offsetX, offsetY, paint);
        float textWidth = paint.measureText(text);
        canvas.drawLine(offsetX, offsetY, offsetX + textWidth, offsetY, paint);*/

        //
        int measuredCount;
        float[] measuredWidth = {0};

        // 宽度上限 300 （不够用，截断）
        measuredCount = paint.breakText(text, 0, text.length(), true, 100, measuredWidth);
        canvas.drawText(text, 0, measuredCount, 150, 150, paint);

        // 宽度上限 400 （不够用，截断）
        measuredCount = paint.breakText(text, 0, text.length(), true, 200, measuredWidth);
        canvas.drawText(text, 0, measuredCount, 150, 150 + paint.getFontSpacing(), paint);

        // 宽度上限 500 （够用）
        measuredCount = paint.breakText(text, 0, text.length(), true, 300, measuredWidth);
        canvas.drawText(text, 0, measuredCount, 150, 150 + paint.getFontSpacing() * 2, paint);

        // 宽度上限 600 （够用）
        measuredCount = paint.breakText(text, 0, text.length(), true, 600, measuredWidth);
        canvas.drawText(text, 0, measuredCount, 150, 150 + paint.getFontSpacing() * 3, paint);
    }
}
