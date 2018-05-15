package comokhttpdemo.cn.okhttp_demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comokhttpdemo.cn.okhttp_demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
