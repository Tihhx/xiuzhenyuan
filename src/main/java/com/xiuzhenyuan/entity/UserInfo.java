package com.xiuzhenyuan.entity;

import java.util.Date;


public class UserInfo {
    private String name;

    private Long qq;

    private String type;

    private Date join_time;

    private String school;

    private String number;

    private String url;

    private String des;

    private String referee;

    private Date create_at;

    private String updata_at;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getJoin_time() {
        return join_time;
    }

    public void setJoin_time(Date join_time) {
        this.join_time = join_time;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public String getUpdata_at() {
        return updata_at;
    }

    public void setUpdata_at(String updata_at) {
        this.updata_at = updata_at;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", qq=" + qq +
                ", type='" + type + '\'' +
                ", join_time=" + join_time +
                ", school='" + school + '\'' +
                ", number='" + number + '\'' +
                ", url='" + url + '\'' +
                ", des='" + des + '\'' +
                ", referee='" + referee + '\'' +
                ", create_at=" + create_at +
                ", updata_at='" + updata_at + '\'' +
                '}';
    }
}
