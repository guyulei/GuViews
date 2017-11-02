package com.guyulei.guviews.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.guyulei.guviews.R;

/**
 * Created by A on 2017/11/2.
 */

public class GuViewOne extends View {

    private Paint mPaint;
    private Path  mPath;

    public GuViewOne(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public GuViewOne(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initview();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initview() {
        mPaint = new Paint();
        // 初始化 Path 对象
        mPath = new Path();
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        mPath.arcTo(200, 200, 400, 400, -225, 225, true);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400, 542);


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //这类颜色填充方法一般用于在绘制之前设置底色，或者在绘制之后为界面设置半透明蒙版
        /*canvas.drawColor(Color.BLACK);
        canvas.drawColor(Color.parseColor("#88880000"));
        canvas.drawRGB(100, 200, 100);
        canvas.drawARGB(100, 100, 200, 100);*/
        //单位都是像素
        mPaint.setColor(Color.RED);
        //FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充。
        // 它的默认值是 FILL，填充模式。
        //mPaint.setStyle(Paint.Style.STROKE);
        //mPaint.setStrokeWidth(20);// 线条宽度为 20 像素
        mPaint.setAntiAlias(true);//来动态开关抗锯齿
        /*canvas.drawCircle(300, 300, 200, mPaint);
        canvas.drawRect(50, 50, 600, 600, mPaint);*/
        //点的大小可以通过 paint.setStrokeWidth(width) 来设置
        //点的形状可以通过 paint.setStrokeCap(cap) ROUND 圆形的点，SQUARE 或 BUTT 画出来是方形的点
        /*mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(100,100,mPaint);*/
        //
        /*float[] points = {0, 0, 100, 100, 150, 150, 200, 200, 250, 250, 150, 50, 150, 100};
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        canvas.drawPoints(points, 2 *//* 跳过两个数，即前两个 0 *//*, 4 *//* 一共绘制四个点*//*, mPaint);*/
        //
        /*canvas.drawOval(150, 200, 450, 400, mPaint);
        canvas.drawLine(10, 650, 300, 700, mPaint);
        float[] points = {20, 720, 120, 720,
                70, 720, 70, 820,
                20, 820, 120, 820,
                150, 720, 250, 720,
                150, 720, 150, 820,
                250, 720, 250, 820,
                150, 820, 250, 820};
        canvas.drawLines(points, mPaint);*/

        //rx 和 ry 是圆角的横向半径和纵向半径
        //canvas.drawRoundRect(100, 100, 500, 300, 60, 90, mPaint);

        //startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度），
        // sweepAngle 是弧形划过的角度；useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形
        /*mPaint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, mPaint); // 绘制扇形
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, mPaint); // 绘制弧形
        mPaint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, mPaint); // 绘制不封口的弧形*/
        //canvas.drawPath(mPath, mPaint); // 绘制出 path 描述的图形（心形），大功告成

        //
        /*mPath.addCircle(300, 300, 200, Path.Direction.CW);
        canvas.drawPath(mPath, mPaint);*/

       /* mPaint.setStyle(Paint.Style.STROKE);
        mPath.lineTo(100, 100); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        mPath.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
        canvas.drawPath(mPath, mPaint);*/

        /*mPaint.setStyle(Paint.Style.STROKE);
        mPath.lineTo(100, 100); // 画斜线
        mPath.moveTo(200, 100); // 我移~~
        mPath.lineTo(200, 0); // 画竖线
        canvas.drawPath(mPath, mPaint);*/
        //
       /* mPaint.setStyle(Paint.Style.STROKE);
        mPath.lineTo(100, 100);
        mPath.arcTo(100, 100, 300, 300, -90, 0, true); // 强制移动到弧形起点（无痕迹）
        canvas.drawPath(mPath, mPaint);*/

       /* mPaint.setStyle(Paint.Style.STROKE);
        mPath.lineTo(100, 100);
        mPath.arcTo(100, 100, 300, 300, -90, 0, false); // 直接连线连到弧形起点（有痕迹）
        canvas.drawPath(mPath, mPaint);*/

        /*mPaint.setStyle(Paint.Style.STROKE);
        mPath.lineTo(100, 100);
        mPath.addArc(100, 100, 300, 300, -90, 0);
        canvas.drawPath(mPath, mPaint);*/

        /*mPaint.setStyle(Paint.Style.STROKE);
        mPath.moveTo(100, 500);
        mPath.quadTo(300, 100, 600, 500);
        canvas.drawPath(mPath, mPaint);*/
        /*mPaint.setStyle(Paint.Style.STROKE);
        mPath.moveTo(100, 500);
        mPath.cubicTo(100, 500, 300, 100, 600, 500);
        canvas.drawPath(mPath, mPaint);*/
       /* mPaint.setStyle(Paint.Style.STROKE);
        mPath.close();
        canvas.drawPath(mPath, mPaint);*/
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
        canvas.drawBitmap(bitmap, 100, 100, mPaint);
        mPaint.setTextSize(30);
        canvas.drawText("guyulei-顾雨磊",200,200,mPaint);
    }
}
