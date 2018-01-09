package com.hirayclay;

import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;

/**
 * Created by CJJ on 2017/6/20.
 *
 * @author CJJ
 */

public class Config {

    @IntRange(from = 2)
    public int space = 60;
    public int maxStackCount = 3;
    public int initialStackCount = 0;
    @FloatRange(from = 0f, to = 1f)
    public float secondaryScale;
    @FloatRange(from = 0f, to = 1f)
    public float scaleRatio;
    /**
     * the real scroll distance might can fit requirement,
     * so we multiply a factor
     */
    @FloatRange(from = 1f)
    public float parallex;
    Align align;

}
