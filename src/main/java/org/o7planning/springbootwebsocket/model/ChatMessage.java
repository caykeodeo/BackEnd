package org.o7planning.springbootwebsocket.model;

public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;
    private String hour,minutes,second;
    public String getsecond()
    {
        return second;
    }
    public void setsecond(String second)
    {
        this.second= second;
    }
    public String gethour()
    {
        return hour;
    }
    public void sethour(String hour)
    {
        this.hour= hour;
    }
    public String getminutes()
    {
        return minutes;
    }
    public void setminutes(String minutes)
    {
        this.minutes= minutes;
    }
    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

}