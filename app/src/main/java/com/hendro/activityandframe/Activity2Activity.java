package com.hendro.activityandframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Activity2Activity extends AppCompatActivity {
    @Bind(R.id.btn_goto)
    Button btn_goto;
    @Bind(R.id.tv_dataView)
    TextView tv_dataView;

    private String dataText = "Hendro Eko Prabowo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        ButterKnife.bind(this);
        setTitle("Activity to Activity");

        tv_dataView.setText("Activity akan mengirim data : " + dataText);

        btn_goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("data", dataText);
                startActivity(intent);
            }
        });
    }

//    private void gotoIntent(int id){
//        Intent intent = null;
//        switch(id){
//            case R.id.btn_activity:
//                intent = new Intent(getApplicationContext(), Activity2Activity.class);
//                intent.putExtra("kunci", dataYgDikirim);
//        }
//        if(intent != null){
//            startActivity(intent);
//        } else {
//            Log.i("intent", "Intent null");
//        }
//    }
}
