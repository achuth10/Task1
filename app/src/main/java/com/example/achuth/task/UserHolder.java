package com.example.achuth.task;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class UserHolder extends RecyclerView.ViewHolder {
    private TextView name,comment,commentdate;
    public UserHolder(View itemView) {
        super(itemView);
        name=(TextView)itemView.findViewById(R.id.name);
        comment=(TextView)itemView.findViewById(R.id.comment);
        commentdate=(TextView)itemView.findViewById(R.id.commentdate);
    }
    public void setDetails(UserViewObject userViewObject)
    {
        name.setText(userViewObject.getName());
        comment.setText(userViewObject.getComment_text());
        commentdate.setText(userViewObject.getComment_date());

    }

}
