package com.damla.recyclerviewsongsandlyric;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final LinkedList<String> listSingerName;
    private final LinkedList<String> listSongName;
    private LayoutInflater layoutInflater;


    public RecyclerViewAdapter(Context context, LinkedList<String> listSingerName, LinkedList<String> listSongName){
        layoutInflater = LayoutInflater.from(context);
        this.listSingerName = listSingerName;
        this.listSongName = listSongName;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mViewItem = layoutInflater.inflate(R.layout.recycler_view_content,parent,false);
        return new ViewHolder(mViewItem,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String mCurrentSinger = listSingerName.get(position);
        holder.singerName.setText(mCurrentSinger);
        String mCurrentSong = listSongName.get(position);
        holder.songName.setText(mCurrentSong);
    }

    @Override
    public int getItemCount() {
        return listSingerName.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView singerName ;
        public final TextView songName;
        final RecyclerViewAdapter mAdaptor;
        private final Context context;
        private final String POSITION = "song_position";
        public ViewHolder(@NonNull View itemView,RecyclerViewAdapter adapter) {
            super(itemView);
            singerName = itemView.findViewById(R.id.singerName);
            songName = itemView.findViewById(R.id.songName);
            this.mAdaptor = adapter;
            context = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

           Intent intent = new Intent(context,LyricActivity.class);
            int mPosition = getLayoutPosition();
            intent.putExtra(POSITION,mPosition);
            context.startActivity(intent);
            mAdaptor.notifyDataSetChanged();

        }
    }
}
