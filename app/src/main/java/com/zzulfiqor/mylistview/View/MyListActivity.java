package com.zzulfiqor.mylistview.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zzulfiqor.mylistview.R;

public class MyListActivity extends AppCompatActivity {

    ListView lvList;
    private final String[] playerName = {
            "Wojciech Szczesny",
            "Mattia Perin",
            "Gianluigi Buffon",
            "Carlo Pinsoglio",
            "Matthijs de Ligt",
            "Leonardo Bonucci",
            "Daniele Rugani",
            "Merih Demiral",
            "Giorgio Chiellini",
            "Alex Sandro",
            "Mattia De Sciglio",
            "Emre Can",
            "Miralem Pjanic",
            "Aaron Ramsey",
            "Adrien Rabiot",
            "Rodrigo Bentancur",
            "Sami Khedira",
            "Cristiano Ronaldo",
            "Marko Pjaca",
            "Federico Bernardeschi",
            "Douglas Costa",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        initComponent();
        setListView(playerName);

    }

    private void setListView(String[] data) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, data);
        lvList.setAdapter(adapter);
    }

    private void initComponent() {
        lvList = findViewById(R.id.lvList);
    }
}
