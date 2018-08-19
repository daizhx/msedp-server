package com.edp.server.Repository.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EdpUseRecord {

    @Id
    private long id;

    //times per minutes
    private int tpm;

    private int treatTime;

    private int frequency;

    private int strength;

    private Date startTime;

    private User user;


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
}
