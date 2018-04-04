package com.bhadrasoft.trackmymusic.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bhadrasoft.trackmymusic.R;

import java.util.List;

/**
 * Created by riddhi on 30-Dec-17.
 */

public class MusicAdapter extends RecyclerView.Adapter {
    private List<String> items;

    public MusicAdapter(List<String> items) {
        this.items = items;
    }

    private MusicAdapter(){}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.music_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public View layout;

        public ViewHolder(View itemView) {
            super(itemView);
            layout = itemView;
        }
    }
}
