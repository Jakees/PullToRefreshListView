package com.widget.sql.pulltorefreshlistview.commom.listener;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 要传入当前点击的Button，用于设置ListView每个Item中currentBtn为当前点击的Button，这样点击后的setText就不会错位了。
 * Created by SQL on 2016/6/22.
 */
public class ButtonListener implements View.OnClickListener {

    private int mCurrentPosition;
    private Context context;


    public ButtonListener(Context context, int mCurrentPosition) {
        this.context = context;
        this.mCurrentPosition = mCurrentPosition;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "您点击了第" + (mCurrentPosition + 1) +"个按钮",Toast.LENGTH_SHORT).show();
    }
}
