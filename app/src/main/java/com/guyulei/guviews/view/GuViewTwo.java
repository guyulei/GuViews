package com.guyulei.guviews.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
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
        /*Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        // 第二个 Shader：
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Shader shader2 = new BitmapShader(bitmap2, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        // ComposeShader：结合两个 Shader
        Shader shader = new ComposeShader(shader1, shader2, PorterDuff.Mode.SRC_OVER);
        paint.setShader(shader);
        canvas.drawCircle(200,200,200,paint);*/
        //PorterDuff.Mode
        //PorterDuff.Mode.DST_OUT，就会变成挖空效果
        /*PorterDuff.Mode 一共有 17 个，可以分为两类：
        Alpha 合成 (Alpha Compositing)
        混合 (Blending)*/

        //LightingColorFilter
       /* Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        canvas.drawBitmap(bitmap1,0,0,paint);
        ColorFilter lightingColorFilter = new LightingColorFilter(0xffffff, 0x003000);
        paint.setColorFilter(lightingColorFilter);
        canvas.drawBitmap(bitmap1,400,0,paint);*/

        //setPathEffect(PathEffect effect)  来给图形的轮廓设置效果
        /*DashPathEffect(float[] intervals, float phase) 中， 第一个参数 intervals 是一个数组，它指定了虚线的格式：
        数组中元素必须为偶数（最少是 2 个），按照「画线长度、空白长度、画线长度、空白长度」……的顺序排列，
        例如上面代码中的 20, 5, 10, 5
        就表示虚线是按照「画 20 像素、空 5 像素、画 10 像素、空 5 像素」的模式来绘制；第二个参数 phase 是虚线的偏移量。*/
        /*PathEffect pathEffect = new DashPathEffect(new float[]{40,30,20, 10}, 10);
        paint.setPathEffect(pathEffect);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300, 300, 200, paint);*/
        //
        /*PathEffect pathEffect = new CornerPathEffect(100);
        paint.setPathEffect(pathEffect);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100,100, 300, 200, paint);*/
        //
        /*PathEffect pathEffect = new DiscretePathEffect(20, 5);
        paint.setPathEffect(pathEffect);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100,100, 300, 200, paint);*/

        //
        /*PathEffect dashEffect = new DashPathEffect(new float[]{20, 10}, 0);//虚线
        PathEffect discreteEffect = new DiscretePathEffect(20, 5);//随意偏离线
        SumPathEffect sumPathEffect = new SumPathEffect(dashEffect, discreteEffect);
        paint.setPathEffect(sumPathEffect);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100,100, 300, 200, paint);*/

        //不过它是先对目标 Path 使用一个 PathEffect，然后再对这个改变后的 Path 使用另一个 PathEffect。
       /* PathEffect dashEffect = new DashPathEffect(new float[]{20, 10}, 0);//虚线
        PathEffect discreteEffect = new DiscretePathEffect(20, 5);//随意偏离线
        ComposePathEffect composePathEffect = new ComposePathEffect(dashEffect, discreteEffect);
        paint.setPathEffect(composePathEffect);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShadowLayer(10, 0, 0, Color.RED);
        canvas.drawRect(100, 100, 300, 200, paint);*/
        //
        /*paint.setShadowLayer(10, 0, 0, Color.RED);
        paint.clearShadowLayer();*/

        //
        /*NORMAL: 内外都模糊绘制
        SOLID: 内部正常绘制，外部模糊
        INNER: 内部模糊，外部不绘制
        OUTER: 内部不绘制，外部模糊（什么鬼？）*/

        /*Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.SOLID));
        canvas.drawBitmap(bitmap1, 100, 100, paint);*/

        /*direction 是一个 3 个元素的数组，指定了光源的方向；
        ambient 是环境光的强度，数值范围是 0 到 1； specular 是炫光的系数； blurRadius 是应用光线的范围*/
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        paint.setMaskFilter(new EmbossMaskFilter(new float[]{0, 1, 1}, 0.2f, 8, 10));
        canvas.drawBitmap(bitmap1, 100, 100, paint);

        //
        paint.reset();

    }
}
