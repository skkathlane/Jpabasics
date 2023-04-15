package com.jpatesting.jpabasics;

import javax.persistence.*;

@Entity
@Table(name="user_info")
public class User {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String mobNo;
    @OneToOne(mappedBy ="user")
    Card card;

    public User(){

    }

    public User(String name, int rollNo, String mobNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
