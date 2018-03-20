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

    @Override
    public String getId() {
        return null;
    }
}
