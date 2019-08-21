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
    private int id;
    private String user_name;
    private String tel;
    private byte gender;
    private Date birthday;
    private String citizen_id;
    private String nick_name;
    private String email;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setUser_name(String user_name){
        this.user_name = user_name;
    }
    public String getUser_name(){
        return user_name;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getTel(){
        return tel;
    }
    public void setGender(byte gender){
        this.gender = gender;
    }
    public byte getGender(){
        return gender;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    public Date getBirthday(){
        return birthday;
    }
    public void setCitizen_id(String citizen_id){
        this.citizen_id = citizen_id;
    }
    public String getCitizen_id(){
        return citizen_id;
    }
    public void setNick_name(String nick_name){
        this.nick_name = nick_name;
    }
    public String getNick_name(){
        return nick_name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
