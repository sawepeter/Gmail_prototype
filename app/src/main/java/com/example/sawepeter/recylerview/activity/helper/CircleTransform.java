package com.example.sawepeter.recylerview.activity.helper;

import android.content.Context;
import android.graphics.Bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * Created by SAWE PETER on 3/20/2018.
 */

public class CircleTransform extends BitmapTransformation{
    public CircleTransform(Context context ) {
        super(context);
    }

    @Override
    protected Bitmap transform(BitmapPool pool,  Bitmap toTransform, int outWidth, int outHeight) {
        return circleCrop(pool, toTransform);
    }

    private static Bitmap circleCrop(BitmapPool pool, Bitmap source) {
        if (source == null) return null;

        int size = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - size) / 2;
        int y = (source.getHeight() -size) /2;

        //TODO this could be acquired from the pool too
        Bitmap squared = Bitmap.createBitmap(source, x, y, size, size);

        Bitmap result = pool.get(size, size, Bitmap.Config.ARGB_8888);
        if (result == null)
    }

    @Override
    public String getId() {
        return null;
    }
}
