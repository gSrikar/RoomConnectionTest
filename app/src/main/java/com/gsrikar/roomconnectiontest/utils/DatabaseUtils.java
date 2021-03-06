package com.gsrikar.roomconnectiontest.utils;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.gsrikar.roomconnectiontest.room.AppDatabase;
import com.gsrikar.roomconnectiontest.room.PersonDao;
import com.gsrikar.roomconnectiontest.room.PersonEntity;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DatabaseUtils {

    public static void insertPersonData(final Context context) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                AppDatabase appDatabase = Room.databaseBuilder(context, AppDatabase.class,
                        "multi-process-app-database")
                        .fallbackToDestructiveMigration()
                        .build();
                PersonDao personDao = appDatabase.getPersonDao();
                personDao.insert(getPersonEntities());
                appDatabase.close();
            }
        });
    }

    @NonNull
    private static List<PersonEntity> getPersonEntities() {
        return Arrays.asList(
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 0),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 1),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 2),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 3),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 4),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 5),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 6),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 7),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 8),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 9),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 10),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 11),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 12),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 13),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 14),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 15),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 16),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 17),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 18),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 19),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 20),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 21),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 22),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 23),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 24),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 25),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 26),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 27),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 28),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 29),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 30),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 31),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 32),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 33),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 34),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 35),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 36),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 37),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 38),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 39),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 40),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 41),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 42),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 43),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 44),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 45),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 46),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 47),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 48),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 49),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 50),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 51),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 52),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 53),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 54),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 55),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 56),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 57),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 58),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 59),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 60),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 61),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 62),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 63),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 64),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 65),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 66),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 67),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 68),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 69),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 70),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 71),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 72),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 73),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 74),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 75),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 76),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 77),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 78),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 79),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 80),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 81),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 82),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 83),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 84),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 85),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 86),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 87),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 88),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 89),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 90),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 91),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 92),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 93),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 94),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 95),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 96),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 97),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 98),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 99),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 100),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 101),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 102),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 103),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 104),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 105),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 106),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 107),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 108),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 109),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 110),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 111),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 112),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 113),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 114),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 115),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 116),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 117),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 118),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 119),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 120),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 121),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 122),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 123),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 124),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 125),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 126),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 127),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 128),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 129),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 130),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 131),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 132),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 133),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 134),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 135),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 136),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 137),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 138),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 139),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 140),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 141),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 142),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 143),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 144),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 145),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 146),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 147),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 148),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 149),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 150),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 151),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 152),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 153),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 154),
                new PersonEntity(UUID.randomUUID().toString(), "Srikar", 155));
    }
}
