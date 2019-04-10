package com.hendro.activityandframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btn_activity)
    Button btn_activity;
    @Bind(R.id.btn_bottom_navigation)
    Button btn_bottom_nav;
    @Bind(R.id.btn_floating_button)
    Button btn_fab;
    @Bind(R.id.btn_burger_menu)
    Button btn_burger_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        buttonClickListener();
    }

    private void buttonClickListener(){
        btn_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntent(R.id.btn_activity);
            }
        });

        btn_bottom_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntent(R.id.btn_bottom_navigation);
            }
        });

        btn_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntent(R.id.btn_floating_button);
            }
        });

        btn_burger_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoIntent(R.id.btn_burger_menu);
            }
        });
    }

    private void gotoIntent(int id) {
        Intent intent = new Intent();
        switch (id) {
            case R.id.btn_activity:
                intent = new Intent(this, Activity2Activity.class);
                break;
            case R.id.btn_bottom_navigation:
                intent = new Intent(this, BottomNavActivity.class);
                break;
            case R.id.btn_floating_button:
                intent = new Intent(this, FABActivity.class);
                break;
            case R.id.btn_burger_menu:
                intent = new Intent(this, BurgerMenuActivity.class);
                break;
        }
        if (intent.getClass().getSimpleName().isEmpty()) {
            Toast toast = Toast.makeText(getApplicationContext(), "Intent Activity is Empty", Toast.LENGTH_LONG);
            toast.show();
        } else {
            startActivity(intent);
        }
    }
}
