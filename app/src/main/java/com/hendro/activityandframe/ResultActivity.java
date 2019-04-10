package com.hendro.activityandframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {
    @Bind(R.id.tv_data)
    TextView tv_data;

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
        preProcessing();

        tv_data.setText("Data dari activity lain adalah : " + data);
    }

    protected void preProcessing(){
        data = getIntent().getStringExtra("data");
        Log.i("intent", data);
    }
}
