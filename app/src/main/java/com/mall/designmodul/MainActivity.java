package com.mall.designmodul;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btFactory)
    Button btFactory1;
    @BindView(R.id.btFactory2)
    Button btFactory2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btFactory, R.id.btFactory2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btFactory:
//                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.btFactory2:
                break;
        }
    }
}
