package com.mumu.mmtoast;

import android.os.Bundle;
import android.view.View;

import com.mumu.mmtoast.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
    }

    @OnClick({R.id.button3, R.id.button4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button3:
                showToastSuccess("加载成功");
                break;
            case R.id.button4:
                showToastFailure("加载失败");
                break;
        }
    }
}
