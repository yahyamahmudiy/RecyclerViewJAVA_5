package com.example.task5.Model;

import androidx.annotation.NonNull;

import java.util.List;

public class Member {
    int profile;
    String name;
    String surname;
    private List<MemberSub> memberSubs;

    public Member(){

    }
    public Member(int profile, String name, String surname, List<MemberSub> memberSubs){
        this.profile = profile;
        this.name = name;
        this.surname = surname;
        this.memberSubs = memberSubs;
    }

    public List<MemberSub> getMemberSubs(){return memberSubs;}
    public int getProfile(){ return profile; }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    @NonNull
    public String toString(){
        return profile+" : "+name+" "+surname+" "+memberSubs;

    }

}

