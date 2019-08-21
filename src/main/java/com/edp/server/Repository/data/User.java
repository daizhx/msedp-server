package com.edp.server.Repository.data;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * edp用户
 * Created by daizhx on 2017/9/26.
 */
@Entity
@Table(name="edp_user")
public class User {

    @Id
    private Long id;
    //用户名
    private String userName;
    private String pwd;//密码
    //手机号
    private Long tel;
    private Date birthday;
    private byte gender;//0-女，1-男

    @Column(name="idcardnumbers")
    private String idcardnumbers;
    @Column(name="wechatname")
    private String wechatname;
    private String homeAddr;
    @Column(name="medicareNumbers")
    private String medicarenumbers;
    @Column(name="visitingHospital")
    private String visitinghospital;//就诊医院
    @Column(name="issmoking")
    private boolean issmoking;//是否吸烟
    private int smokingYear;//烟龄


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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getIdcardnumbers() {
        return idcardnumbers;
    }

    @Column(name = "idcardnumbers")
    public void setIdcardnumbers(String idcardnumbers) {
        this.idcardnumbers = idcardnumbers;
    }

    public String getWechatname() {
        return wechatname;
    }

    public void setWechatname(String wechatname) {
        this.wechatname = wechatname;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getMedicarenumbers() {
        return medicarenumbers;
    }

    public void setMedicarenumbers(String medicarenumbers) {
        this.medicarenumbers = medicarenumbers;
    }

    public String getVisitinghospital() {
        return visitinghospital;
    }

    public void setVisitinghospital(String visitinghospital) {
        this.visitinghospital = visitinghospital;
    }

    public boolean isIssmoking() {
        return issmoking;
    }

    public void setIssmoking(boolean issmoking) {
        this.issmoking = issmoking;
    }

    public int getSmokingYear() {
        return smokingYear;
    }

    public void setSmokingYear(int smokingYear) {
        this.smokingYear = smokingYear;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", tel=" + tel +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", idcardnumbers='" + idcardnumbers + '\'' +
                ", wechatname='" + wechatname + '\'' +
                ", homeAddr='" + homeAddr + '\'' +
                ", medicarenumbers='" + medicarenumbers + '\'' +
                ", visitinghospital='" + visitinghospital + '\'' +
                ", issmoking=" + issmoking +
                ", smokingYear=" + smokingYear +
                '}';
    }
}
