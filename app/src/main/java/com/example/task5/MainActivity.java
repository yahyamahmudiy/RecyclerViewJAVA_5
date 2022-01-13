package com.example.task5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import com.example.task5.Adapter.RecyclerAdapter;
import com.example.task5.Model.Member;
import com.example.task5.Model.MemberSub;
import com.example.task5.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

        ArrayList<Member> members = new ArrayList<>();

        members.add(new Member());
        for (int i=0;i<=20;i++){
            if(i == 1 ||i == 10) {
                members.add(new Member(R.mipmap.ic_profile, "Yahya " + i, "Mahmudiy " + i, prepareMemberSub()));
            }else {
                members.add(new Member(R.mipmap.ic_profile, "Yahya " + i, "Mahmudiy " + i, null));
            }
        }
        members.add(new Member());

        refreshAdapter(members);
    }

    private List<MemberSub> prepareMemberSub(){
        List<MemberSub> members = new ArrayList<>();
        for (int i=0;i<5;i++){
            members.add(new MemberSub());

        }
        return members;
    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter adapter = new RecyclerAdapter(context,members);
        recyclerView.setAdapter(adapter);
    }
}