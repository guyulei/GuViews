package com.guyulei.guviews.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.guyulei.guviews.R;

/**
 * Created by A on 2017/11/3.
 */

public class GuViewTwo extends View {
    public GuViewTwo(Context context) {
        super(context);
    }

    public GuViewTwo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        //LinearGradient 线性渐变

        //设置了 Shader 的情况下， Paint.setColor/ARGB() 所设置的颜色就不再起作用。
        //TileMode 一共有 3 个值可选： CLAMP, MIRROR 和 REPEAT。
        // CLAMP 会在端点之外延续端点处的颜色；MIRROR 是镜像模式；REPEAT 是重复模式
        /*Shader linearShader = new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(linearShader);
        canvas.drawCircle(300, 300, 200, paint);*/

        //从中心向周围辐射状的渐变
        /*Shader shader = new RadialGradient(300, 300, 200, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(300, 300, 200, paint);*/

        //SweepGradient 扫描渐变
        /*Shader shader = new SweepGradient(300, 300, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));
        paint.setShader(shader);
        canvas.drawCircle(300, 300, 200, paint);*/

        //BitmapShader
        /*Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        Shader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        paint.setShader(shader);
        canvas.drawCircle(200,200,200,paint);*/

        //ComposeShader 混合着色器   把两个 Shader 一起使用
        // 第一个 Shader：头像的 Bitmap
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        // 第二个 Shader：
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Shader shader2 = new BitmapShader(bitmap2, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        // ComposeShader：结合两个 Shader
        Shader shader = new ComposeShader(shader1, shader2, PorterDuff.Mode.SRC_OVER);
        paint.setShader(shader);
        canvas.drawCircle(200,200,200,paint);
        //PorterDuff.Mode
        //PorterDuff.Mode.DST_OUT，就会变成挖空效果
        /*PorterDuff.Mode 一共有 17 个，可以分为两类：
        Alpha 合成 (Alpha Compositing)
        混合 (Blending)*/




    }
}
