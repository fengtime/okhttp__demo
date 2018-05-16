package comokhttpdemo.cn.okhttp_demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by orange on 2018/5/16.
 */

public class BaseActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public int layoutid(){
        return 0;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
