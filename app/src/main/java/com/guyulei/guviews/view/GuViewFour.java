package com.guyulei.guviews.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.guyulei.guviews.R;

/**
 * Created by A on 2017/11/13.
 */

public class GuViewFour extends View {

    Paint paint = new Paint();
    Bitmap bitmap;
    Path   path   = new Path();
    Matrix matrix = new Matrix();
    Camera camera = new Camera();
    int width;
    int height;
    float x = 100;
    float y = 100;


    float[] pointsSrc = new float[]{100, 100, 300, 100, 100, 400, 300, 400};
    float[] pointsDst = new float[]{100 - 10, 100 + 50, 300 + 120, 100 - 90, 100 + 20, 400 + 30, 300 + 20, 400 + 60};


    public GuViewFour(Context context) {
        super(context);
    }

    public GuViewFour(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GuViewFour(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.maps);
        width = bitmap.getWidth();
        height = bitmap.getHeight();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //clipRect()
        /*canvas.save();
        canvas.clipRect(100, 0, 200, 100);
        canvas.drawBitmap(bitmap, 0, 0, paint);
        canvas.restore();*/

        //clipPath()
        /*canvas.save();
        path.addCircle(100, 100, 100, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, 0, 0, paint);
        canvas.restore();*/

        //几何变换
        /*使用 Canvas 来做常见的二维变换；
        使用 Matrix 来做常见和不常见的二维变换；
        使用 Camera 来做三维变换。*/

        //Canvas.translate(float dx, float dy) 平移
        /*canvas.save();
        canvas.translate(200, 0);
        canvas.drawBitmap(bitmap,  0, 0, paint);
        canvas.restore();*/

        //Canvas.rotate(float degrees, float px, float py) 旋转  px 和 py 是轴心的位置。
        /*canvas.save();
        canvas.rotate(60,100, 200);
        canvas.drawBitmap(bitmap,  0, 0, paint);
        canvas.restore();*/

        //Canvas.scale(float sx, float sy, float px, float py) 放缩
        //sx sy 是横向和纵向的放缩倍数； px py 是放缩的轴心
        /*canvas.save();
        canvas.scale(0.5f, 0.9f, x + width / 2, y + height / 2);
        canvas.drawBitmap(bitmap, x, y, paint);
        canvas.restore();*/

        //skew(float sx, float sy) 错切  sx 和 sy 是 x 方向和 y 方向的错切系数
        /*canvas.save();
        canvas.skew(-0.5f, 0);
        canvas.drawBitmap(bitmap, x+width, y, paint);
        canvas.restore();*/

        //使用 Matrix 来做常见变换
        /*Canvas.setMatrix(matrix)：用 Matrix 直接替换 Canvas 当前的变换矩阵，即抛弃 Canvas 当前的变换，
        改用 Matrix 的变换（注：不同的系统中 setMatrix(matrix) 的行为可能不一致，所以还是尽量用 concat(matrix) 吧）；
        Canvas.concat(matrix)：用 Canvas 当前的变换矩阵和 Matrix 相乘，即基于 Canvas 当前的变换，叠加上 Matrix 中的变换。*/

       /* matrix.reset();
        matrix.postRotate(60, 100, 0);
        matrix.postTranslate(100, 0);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, 100, 0, paint);
        canvas.restore();*/

        //使用 Matrix 来做自定义变换
        /*Matrix.setPolyToPoly(float[] src, int srcIndex, float[] dst, int dstIndex, int pointCount)
        用点对点映射的方式设置变换*/

        /*poly 就是「多」的意思。setPolyToPoly() 的作用是通过多点的映射的方式来直接设置变换。
        「多点映射」的意思就是把指定的点移动到给出的位置，从而发生形变。
        例如：(0, 0) -> (100, 100) 表示把 (0, 0) 位置的像素移动到 (100, 100) 的位置，
        这个是单点的映射，单点映射可以实现平移。而多点的映射，就可以让绘制内容任意地扭曲。*/

        /*src 和 dst 是源点集合目标点集；srcIndex 和 dstIndex 是第一个点的偏移；
        pointCount 是采集的点的个数（个数不能大于 4，因为大于 4 个点就无法计算变换了）。*/
        /*matrix.reset();
        matrix.setPolyToPoly(pointsSrc, 0, pointsDst, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, x, y, paint);
        canvas.restore();*/
        //使用 Camera 来做三维变换
        //Camera.rotate*() 三维旋转
       /* canvas.save();
        camera.save(); // 保存 Camera 的状态
        camera.rotateX(30); // 旋转 Camera 的三维空间
        camera.applyToCanvas(canvas); // 把旋转投影到 Canvas
        camera.restore(); // 恢复 Camera 的状态
        canvas.drawBitmap(bitmap, x, y, paint);
        canvas.restore();*/

        // 对称操作 （顺序问题）
        canvas.save();
        camera.save(); // 保存 Camera 的状态
        camera.setLocation(0, 0, -8);
        //后旋转
        camera.rotateX(30); // 旋转 Camera 的三维空间
        canvas.translate(100, 100); // 旋转之后把投影移动回来
        camera.applyToCanvas(canvas); // 把旋转投影到 Canvas
        //先移动
        canvas.translate(-100, -100); // 旋转之前把绘制内容移动到轴心（原点）
        camera.restore(); // 恢复 Camera 的状态
        canvas.drawBitmap(bitmap, x, y, paint);
        canvas.restore();




    }
}
