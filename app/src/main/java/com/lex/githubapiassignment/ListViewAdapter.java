package com.lex.githubapiassignment;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lex.githubapiassignment.models.Gist;

import java.util.ArrayList;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.MyViewHolder> {

    private ArrayList<Gist> items = new ArrayList<>();
    MainActivity mainActivity;

    public ListViewAdapter(MainActivity mainActivity, ArrayList<Gist> items) {
        this.items=items;
        this.mainActivity=mainActivity;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tvTitle.setText(items.get(i).getTitle());
        myViewHolder.tvBody.setText(items.get(i).getBody());
        mainActivity.setClickListnere(myViewHolder.tvTitle,items,i);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public final TextView tvTitle;
        public final TextView tvBody;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = (TextView)itemView.findViewById(R.id.tv_title);
            tvBody = (TextView)itemView.findViewById(R.id.tv_body);
        }
    }
}

