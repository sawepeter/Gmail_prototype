package com.example.sawepeter.recylerview.activity.model;

/**
 * Created by SAWE PETER on 3/20/2018.
 */

public class Message {
    private int id;
    private String from;
    private String subject;
    private String message;
    private String timestamp;
    private String picture;
    private boolean isImportant;
    private boolean isRead;
    private int color = -1;

    public Message() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
