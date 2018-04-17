package com.gsrikar.roomconnectiontest.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "person")
public class PersonEntity {

    @PrimaryKey
    @NonNull
    private String pid;

    private String name;

    private int age;

    public PersonEntity(@NonNull String pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    @NonNull
    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
