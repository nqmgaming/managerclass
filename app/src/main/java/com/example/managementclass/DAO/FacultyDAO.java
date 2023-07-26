package com.example.managementclass.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.managementclass.DataBase.ManagerDataBaseHelper;

public class FacultyDAO {
    ManagerDataBaseHelper managerDataBaseHelper;
    SQLiteDatabase sqLiteDatabase;

    public FacultyDAO(Context context) {
        managerDataBaseHelper = new ManagerDataBaseHelper(context);
        sqLiteDatabase = managerDataBaseHelper.getWritableDatabase();
    }
}
