package com.moringaschool.alphabetgrid;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    private Context mcontext;
    private String[] mLetter;
    private Typeface mTypeface;
    public AlphabetAdapter(Context context, String[] letters, Typeface typeface){
        this.mcontext =context;
        this.mLetter = letters;
        this.mTypeface = typeface;

    }

    @Override
    public int getCount() {
        return mLetter.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mcontext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
            // pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);
            // set values into views
            letterView.setText(mLetter[position]);
            letterView.setTypeface(mTypeface);// using dummy data for now
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}


