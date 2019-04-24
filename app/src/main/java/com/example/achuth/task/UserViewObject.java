package com.example.achuth.task;

public class UserViewObject {
    String name, comment_text,comment_date;

    public String getName() {
        return name;
    }

    public String getComment_date() {
        return comment_date;
    }

    public String getComment_text() {
        return comment_text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment_date(String comment_date) {
        this.comment_date = comment_date;
    }

    public void setComment_text(String comment_text) {
        this.comment_text = comment_text;
    }
}
