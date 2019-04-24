package com.example.achuth.task;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter <UserHolder> {
    private Context context;
    private ArrayList <UserViewObject> userViewObjects;
    public UserAdapter(Context context, ArrayList<UserViewObject> userViewObjects)
    {
        this.context=context;
        this.userViewObjects=userViewObjects;
    }


    public UserHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.userlayout, viewGroup, false);
        return new UserHolder(view);
    }


    public void onBindViewHolder( UserHolder userHolder, int i) {
        UserViewObject userViewObject=userViewObjects.get(i);
        userHolder.setDetails(userViewObject);
    }

    public int getItemCount() {
        return userViewObjects.size();
    }
}
