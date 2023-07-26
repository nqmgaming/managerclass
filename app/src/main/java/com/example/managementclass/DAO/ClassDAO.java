package com.example.managementclass.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.managementclass.DataBase.ManagerDataBaseHelper;

public class ClassDAO {
    ManagerDataBaseHelper managerDataBaseHelper;
    SQLiteDatabase sqLiteDatabase;

    public ClassDAO(Context context) {
        managerDataBaseHelper = new ManagerDataBaseHelper(context);
        sqLiteDatabase = managerDataBaseHelper.getWritableDatabase();
    }
}
