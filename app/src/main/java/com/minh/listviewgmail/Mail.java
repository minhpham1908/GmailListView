package com.minh.listviewgmail;

import java.util.Date;

public class Mail {

    public String sender;
    public String subject;
    public String content;
    public Date date;

    public Mail(String sender, String subject, String content, Date date) {
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.date = date;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
