package com.cbt.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class RobotoThin extends android.support.v7.widget.AppCompatTextView {

	public RobotoThin(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public RobotoThin(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoThin(Context context) {
        super(context);
        init();
    }

    private void init() {
    	if( !isInEditMode())
    	{
		Typeface face=Typeface.createFromAsset(getContext().getAssets(),"Roboto-Thin.ttf"); 
        setTypeface(face);
    	}
    }
}