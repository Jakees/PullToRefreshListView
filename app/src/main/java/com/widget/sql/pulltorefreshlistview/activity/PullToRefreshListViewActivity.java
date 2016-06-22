package com.widget.sql.pulltorefreshlistview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.widget.sql.pulltorefreshlistview.R;
import com.widget.sql.pulltorefreshlistview.commom.adapter.MyAdapter;
import com.widget.sql.pulltorefreshlistview.commom.layout.PullToRefreshLayout;
import com.widget.sql.pulltorefreshlistview.commom.listener.MyPullListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SQL on 2016/6/22.
 */
public class PullToRefreshListViewActivity extends AppCompatActivity{

    private ListView listView;
    private PullToRefreshLayout ptrl;
    private boolean isFirstIn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listview);

        ptrl = ((PullToRefreshLayout) findViewById(R.id.refresh_view));
        ptrl.setOnPullListener(new MyPullListener());
        listView = (ListView) ptrl.getPullableView();

        initListView();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        // 第一次进入自动刷新
//        if (isFirstIn) {
//            isFirstIn = false;
//            ptrl.autoRefresh();
//        }
    }

    /**
     * ListView初始化方法
     */
    private void initListView() {

        List<String> items = new ArrayList<String>();

        for (int i = 0; i < 30; i++) {
            items.add("这里是item " + i);
        }

        MyAdapter adapter = new MyAdapter(this, items);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                Toast.makeText(PullToRefreshListViewActivity.this,
                        "LongClick on " + parent.getAdapter().getItemId(position),
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(PullToRefreshListViewActivity.this,
                        " Click on " + parent.getAdapter().getItemId(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
