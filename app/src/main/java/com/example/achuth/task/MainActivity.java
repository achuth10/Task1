package com.example.achuth.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList <UserViewObject> userViewObjectArrayList;
    private UserAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userViewObjectArrayList =new ArrayList<>();
        adapter= new UserAdapter(this,userViewObjectArrayList);
        recyclerView.setAdapter(adapter);
        createListData();
    }

    private void createListData() {
            UserViewObject UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            UserViewObject = new UserViewObject("Earth", "snnfsdkjfs", "10");
            userViewObjectArrayList.add(UserViewObject);
            adapter.notifyDataSetChanged();
    }
}
