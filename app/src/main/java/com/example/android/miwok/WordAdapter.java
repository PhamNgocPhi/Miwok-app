package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by phiph on 1/2/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> word, int colorResourceId) {
        super(context,0,word);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        TextView mDefaultTranslation = listItemView.findViewById(R.id.default_text_view);
        mDefaultTranslation.setText(word.getmDefaultTranlation());

        TextView mMiwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        mMiwokTranslation.setText(word.getmMiwokTranslation());

        ImageView img = listItemView.findViewById(R.id.img);
        if(word.hasImage()) {
            img.setImageResource(word.getResourceID());
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
