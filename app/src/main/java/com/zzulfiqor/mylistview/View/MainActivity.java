package com.zzulfiqor.mylistview.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zzulfiqor.mylistview.R;

public class MainActivity extends AppCompatActivity {

    Button btnList, btnCustom, btnRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();


    }

    private void initComponent() {
        btnList = findViewById(R.id.btn_list);
        btnCustom = findViewById(R.id.btn_custom);
        btnRecycler = findViewById(R.id.btn_recycler);
    }

    public void btnListClick(View view) {
        Intent iList = new Intent(this,MyListActivity.class);
        startActivity(iList);
    }

    public void btnCustomClick(View view) {
        Intent iCustom = new Intent(this,MyCustomActivity.class);
        startActivity(iCustom);
    }

    public void btnRecyclerClick(View view) {
        Intent iRecycler = new Intent(this,MyRecyclerActivity.class);
        startActivity(iRecycler);
    }
}
