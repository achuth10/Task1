package com.example.achuth.task;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private ArrayList <UserComment> UserCommentArrayList;
    private UserAdapter adapter;
    private ValueEventListener usercommentlistener;
    private DatabaseReference UserDatabaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        progressBar=(ProgressBar)findViewById(R.id.progress);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        UserDatabaseReference = FirebaseDatabase.getInstance().getReference().child("Comments");
        attachusercommentlistener();




        UserCommentArrayList =new ArrayList<>();
        adapter= new UserAdapter(this,UserCommentArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void attachusercommentlistener() {
        if(usercommentlistener == null) {
            usercommentlistener = new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(UserCommentArrayList!=null)
                        UserCommentArrayList.clear();
                    DataSnapshot contactSnapshot = dataSnapshot.child("ID");
                    Iterable<DataSnapshot> contactChildren = contactSnapshot.getChildren();
                    for (DataSnapshot contact : contactChildren) {
                        UserCommentArrayList.add(contact.getValue(UserComment.class));
                        System.out.println(contact.getValue(UserComment.class).getName());
                    }
                    createListData();
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            };
            progressBar.setVisibility(View.GONE);
                UserDatabaseReference.addValueEventListener(usercommentlistener);

        }
            //progressBar.setVisibility(View.GONE);
    }

    private void createListData() {
            adapter.notifyDataSetChanged();
    }



    public void onStop() {
        super.onStop();
        detachAllListener();
    }
    private void detachAllListener() {
        if(usercommentlistener!=null)
            usercommentlistener=null;
    }
}
