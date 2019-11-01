package com.zzulfiqor.mylistview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zzulfiqor.mylistview.R;

public class CustomListAdapter extends BaseAdapter {
    private final String[] playerName;
    private final String[] playerPosition;
    private final String[] playerNumber;

    private Context c;

    public CustomListAdapter(Context context,String[] playerName,String[] playerPosition,String[] playerNumber) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerNumber = playerNumber;
        this.c = context;
    }


    @Override
    public int getCount() {
        return playerName.length;
    }

    @Override
    public Object getItem(int i) {
        return playerName[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(c).
                    inflate(R.layout.custom_item,viewGroup, false);
        }

        TextView tvName = view.findViewById(R.id.playerName);
        TextView tvPosition = view.findViewById(R.id.playerPosition);
        TextView tvNumber = view.findViewById(R.id.playerNumber);

        tvName.setText(playerName[i]);
        tvNumber.setText(playerNumber[i]);
        tvPosition.setText(playerPosition[i]);

        return view;
    }
}
