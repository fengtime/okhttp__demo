package comokhttpdemo.cn.okhttp_demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by orange on 2018/5/16.
 */

public abstract class BaseActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract int getLayoutid();

    public <T extends View> T findViewByIds(int res) {
        View view = findViewById(res);
        return (T) view;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
