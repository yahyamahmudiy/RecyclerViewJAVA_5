package com.example.task5.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.task5.Model.Member;
import com.example.task5.Model.MemberSub;
import com.example.task5.R;
import java.util.ArrayList;
import java.util.List;

public class RecyclerSubAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<MemberSub> memberSubs;

    public RecyclerSubAdapter(Context context, List<MemberSub> memberSubs) {
        this.context = context;
        this.memberSubs = memberSubs;
    }

    @Override
    public int getItemCount() {
        return memberSubs.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View footer = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_view_sub, parent, false);
        return new MemberSubViewHolder(footer);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MemberSub memberSub = memberSubs.get(position);

    }

    public class MemberSubViewHolder extends RecyclerView.ViewHolder{
        public View view;

        public MemberSubViewHolder(View v) {
            super(v);
            this.view = v;
        }

    }
}
