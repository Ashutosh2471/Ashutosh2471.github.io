/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.security.Timestamp;

/**
 *
 * @author ashu
 */
public class Test {
//    step3= yaha par DB ka sabhi entities ka ek User Defined data type bana lege.Jo prgram me kaam ayega Db wale kaam ko karne me
    private int id;
    private String name;
    private String profile;
    private Timestamp time;

    public Test(int id, String name, String profile) {
        this.id = id;
        this.name = name;
        this.profile = profile;
    }

    public Test(String name, String profile) {
        this.name = name;
        this.profile = profile;
    }

    public Test(String name, String profile, Timestamp time) {
        this.name = name;
        this.profile = profile;
        this.time = time;
    }
    
    

    public Test() {
    }

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    
}
