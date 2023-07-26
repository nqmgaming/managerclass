package com.example.managementclass.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ManagerDataBaseHelper extends SQLiteOpenHelper {
    private static final String NAME_DATABASE = "mana.db";
    private static final Integer VERSION_APP = 1;

    public ManagerDataBaseHelper(Context context){
        super(context, NAME_DATABASE, null, VERSION_APP);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String faculty_table = "CREATE TABLE faculty_tbl(" +
                "id_faculty INTEGER PRIMARY KEY AUTOINCREMENT," +
                " name_faculty TEXT(100) UNIQUE NOT NULL" +
                ")";
        db.execSQL(faculty_table);

        String class_table = "CREATE TABLE class_tbl(" +
                "id_class INTEGER PRIMARY KEY AUTOINCREMENT," +
                " name_class TEXT(100) UNIQUE NOT NULL, " +
                "number_student INTEGER NOT NULL DEFAULT 0," +
                " id_faculty INTEGER NOT NULL," +
                " FOREIGN KEY (id_faculty) REFERENCES faculty_tbl (id_faculty)" +
                ")";
        db.execSQL(class_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
