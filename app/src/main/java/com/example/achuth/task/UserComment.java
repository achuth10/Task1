package com.example.achuth.task;

public class UserComment {
    String commenttext ,name;
    Long date;
    UserComment()
    {

    }
    UserComment(String CommentText,String Name, Long Date)
    {
        this.commenttext=CommentText;
        this.date=Date;
        this.name=Name;
    }

    public String getName() {
        return name;
    }

    public Long getDate() {
        return date;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }
}
