package com.mumu.mmtoast.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mumu.toast.MMToast;


/**
 * @author : zlf
 * date    : 2019/4/17
 * github  : https://github.com/mamumu
 * blog    : https://www.jianshu.com/u/281e9668a5a6
 */
public class BaseActivity extends AppCompatActivity {

    private MMToast mmToast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    protected void showToastSuccess(String msg) {
        if (mmToast == null) {
            MMToast.Builder builder=new MMToast.Builder(this)
                    .setMessage(msg)
                    .setSuccess(true);
            mmToast=builder.create();
        }else {
            mmToast.cancel();
            MMToast.Builder builder=new MMToast.Builder(this)
                    .setMessage(msg)
                    .setSuccess(true);
            mmToast=builder.create();
        }
        mmToast.show();
    }

    protected void showToastFailure(String msg) {
        if (mmToast == null) {
            MMToast.Builder builder=new MMToast.Builder(this)
                    .setMessage(msg)
                    .setSuccess(false);
            mmToast=builder.create();
        }else {
            mmToast.cancel();
            MMToast.Builder builder=new MMToast.Builder(this)
                    .setMessage(msg)
                    .setSuccess(false);
            mmToast=builder.create();
        }
        mmToast.show();
    }
}
