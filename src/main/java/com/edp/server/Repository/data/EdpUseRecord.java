package com.edp.server.Repository.data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EdpUseRecord {
    @Id
    private int id;
    private byte freq;
    private byte duration;
    private byte times_per_min;
    private byte strength;
    private Date start_time;
    private int user_id;
    private String dev_uuid;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setFreq(byte freq){
        this.freq = freq;
    }
    public byte getFreq(){
        return freq;
    }
    public void setDuration(byte duration){
        this.duration = duration;
    }
    public byte getDuration(){
        return duration;
    }
    public void setTimes_per_min(byte times_per_min){
        this.times_per_min = times_per_min;
    }
    public byte getTimes_per_min(){
        return times_per_min;
    }
    public void setStrength(byte strength){
        this.strength = strength;
    }
    public byte getStrength(){
        return strength;
    }
    public void setStart_time(Date start_time){
        this.start_time = start_time;
    }
    public Date getStart_time(){
        return start_time;
    }
    public void setUser_id(int user_id){
        this.user_id = user_id;
    }
    public int getUser_id(){
        return user_id;
    }
    public void setDev_uuid(String dev_uuid){
        this.dev_uuid = dev_uuid;
    }
    public String getDev_uuid(){
        return dev_uuid;
    }
}
