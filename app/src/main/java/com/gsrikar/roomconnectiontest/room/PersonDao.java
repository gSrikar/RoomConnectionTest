package com.gsrikar.roomconnectiontest.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import java.util.List;

@Dao
public interface PersonDao {

    @Insert()
    void insert(List<PersonEntity> personEntity);
}
