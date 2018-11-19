package com.edp.server.Repository.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class EdpUseRecord {

    @Id
    private long id;

    //起搏次数
    private int tpm;

    //治疗时间
    private int treatTime;

    //脉冲频率
    private int frequency;

    //强度
    private int strength;

    //开始时间
    private Date startTime;

    @ManyToOne
    private User user;

    //设备ID
    private String devId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTpm() {
        return tpm;
    }

    public void setTpm(int tpm) {
        this.tpm = tpm;
    }

    public int getTreatTime() {
        return treatTime;
    }

    public void setTreatTime(int treatTime) {
        this.treatTime = treatTime;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }


    @Override
    public String toString() {
        return "EdpUseRecord{" +
                "id=" + id +
                ", tpm=" + tpm +
                ", treatTime=" + treatTime +
                ", frequency=" + frequency +
                ", strength=" + strength +
                ", startTime=" + startTime +
                ", user=" + user +
                '}';
    }
}
