package com.example.loginpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHandler extends SQLiteOpenHelper {
    //information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "StudentDB.db";
    private static final String TABLE_STUDENT = "Student";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_STUDENTNAME = "Studentname";
    public static final String COLUMN_DEP = "Dep";

    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " +
                TABLE_STUDENT + "("
                + COLUMN_ID + " TEXT PRIMARY KEY," + COLUMN_STUDENTNAME
                + " TEXT," + COLUMN_DEP + " TEXT" + ")";
        db.execSQL(CREATE_PRODUCTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT);
        onCreate(db);
    }


    public void addStudent(Student student) {

        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, student.getID());
        values.put(COLUMN_STUDENTNAME, student.get_StudentName());
        values.put(COLUMN_DEP, student.get_Dep());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_STUDENT, null, values);
        db.close();
    }




    public Student findStudent(String _id) {
        String query = "Select * FROM " + TABLE_STUDENT + " WHERE " + COLUMN_ID + " =  \"" + _id + "\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Student student = new Student();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            student.setID(cursor.getString(0));
            student.set_StudentName(cursor.getString(1));
            student.set_Dep(cursor.getString(2));
            cursor.close();
        } else {
            student = null;
        }
        db.close();
        return student;
    }





}


