package com.zhangzhaoru.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @BelongsProject: MyBatisAndSpring
 * @BelongsPackage: com.zhangzhaoru.pojo
 * @Author: ZhangZhaoru
 * @Date: 2021/4/29 9:04 上午
 * @Description:
 */

public class User {
    private int id;
    private String name;
    private String password;
    private String address;
    private String phone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(password, that.password) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, address, phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
