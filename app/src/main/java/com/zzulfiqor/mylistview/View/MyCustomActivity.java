package com.zzulfiqor.mylistview.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zzulfiqor.mylistview.Adapter.CustomListAdapter;
import com.zzulfiqor.mylistview.R;

public class MyCustomActivity extends AppCompatActivity {
    ListView lvCustom;
    CustomListAdapter adapter;

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

    private final String[] playerPosition = {
            "Goalkeeper",
            "Goalkeeper",
            "Goalkeeper",
            "Goalkeeper",
            "Centre-Back",
            "Centre-Back",
            "Centre-Back",
            "Centre-Back",
            "Centre-Back",
            "Left-Back",
            "Right-Back",
            "Right-Back",
            "Defensive Midfield",
            "Center Midfield",
            "Center Midfield",
            "Center Midfield",
            "Center Midfield",
            "Left Winger",
            "Left Winger",
            "Right Winger",
            "Right Winger",
    };

    private final String[] playerNumber = {
            "1",
            "37",
            "77",
            "31",
            "4",
            "19",
            "24",
            "28",
            "3",
            "12",
            "13",
            "2",
            "23",
            "5",
            "8",
            "25",
            "30",
            "7",
            "15",
            "33",
            "11",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom);

        lvCustom = findViewById(R.id.lvCustom);

        setListView();
    }

    private void setListView() {
        adapter = new CustomListAdapter(this,playerName,playerPosition,playerNumber);
        lvCustom.setAdapter(adapter);
    }
}
