package com.widget.sql.pulltorefreshlistview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.widget.sql.pulltorefreshlistview.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by SQL on 2016/6/22.
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btn_pull_to_refresh_list_view)
    Button btnPullToRefreshListView;

    @OnClick(R.id.btn_pull_to_refresh_list_view)
    public void onClick() {
        startActivity(new Intent(MainActivity.this, PullToRefreshListViewActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
