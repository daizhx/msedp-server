package com.edp.server.Repository.data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EdpUseRecord {


    /**
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * 频率
     */
    private Integer freq;
    /**
     * 时间
     */
    private Integer duration;
    /**
     * 起搏次数
     */
    private Integer timesPerMin;
    /**
     * 强度
     */
    private Integer strength;
    /**
     * 每次启动治疗时间
     */
    private Date startTime;
    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;
    /**
     * 设备id
     */
    @Column(name = "dev_uuid")
    private String devUuid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getTimesPerMin() {
        return timesPerMin;
    }

    public void setTimesPerMin(Integer timesPerMin) {
        this.timesPerMin = timesPerMin;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDevUuid() {
        return devUuid;
    }

    public void setDevUuid(String devUuid) {
        this.devUuid = devUuid;
    }


    @Override
    public String toString() {
        return "EdpUseRecord{" +
                "id=" + id +
                ", freq=" + freq +
                ", duration=" + duration +
                ", timesPerMin=" + timesPerMin +
                ", strength=" + strength +
                ", startTime=" + startTime +
                ", userId=" + userId +
                ", devUuid=" + devUuid +
                "}";
    }
}
