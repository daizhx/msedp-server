package com.edp.server.Repository.data;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *
 * Created by daizhx on 2017/9/26.
 */
@Entity
@Table(name="user")
public class User {

    private Long id;
    private Long tel;
    private Date birthdate;
    private byte gender;//0-女，1-男
    private String idCardNumbers;
    private String weChatName;
    private String homeAddr;
    private String medicareNumbers;
    private String visitingHospital;//就诊医院
    private boolean isSmoking;//是否吸烟
    private int smokingYear;//烟龄
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getIdCardNumbers() {
        return idCardNumbers;
    }

    public void setIdCardNumbers(String idCardNumbers) {
        this.idCardNumbers = idCardNumbers;
    }

    public String getWeChatName() {
        return weChatName;
    }

    public void setWeChatName(String weChatName) {
        this.weChatName = weChatName;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getMedicareNumbers() {
        return medicareNumbers;
    }

    public void setMedicareNumbers(String medicareNumbers) {
        this.medicareNumbers = medicareNumbers;
    }

    public String getVisitingHospital() {
        return visitingHospital;
    }

    public void setVisitingHospital(String visitingHospital) {
        this.visitingHospital = visitingHospital;
    }

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }

    public int getSmokingYear() {
        return smokingYear;
    }

    public void setSmokingYear(int smokingYear) {
        this.smokingYear = smokingYear;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tel=" + tel +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                ", idCardNumbers='" + idCardNumbers + '\'' +
                ", weChatName='" + weChatName + '\'' +
                ", homeAddr='" + homeAddr + '\'' +
                ", medicareNumbers='" + medicareNumbers + '\'' +
                ", visitingHospital='" + visitingHospital + '\'' +
                ", isSmoking=" + isSmoking +
                ", smokingYear=" + smokingYear +
                ", remark='" + remark + '\'' +
                '}';
    }
}