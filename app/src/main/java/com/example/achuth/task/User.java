package com.example.achuth.task;

public class User {
    private  String ID, Name, CommentCount;

    public String getCommentCount() {
        return CommentCount;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setCommentCount(String commentCount) {
        CommentCount = commentCount;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    User(String ID, String Name,String CommentCount)
    {
        this.ID=ID;
        this.CommentCount=CommentCount;
        this.Name=Name;
    }

}
