package com.tecksky.justreminder.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.tecksky.justreminder.model.ReminderModel;

import java.util.ArrayList;

public class SQLiteHelper {
    SQLiteDatabase database;
    SQLiteHandler dbHandler;

    public SQLiteHelper(Context context) {
        dbHandler = new SQLiteHandler(context);
    }

    public void open() {
        database = dbHandler.getWritableDatabase();
    }

    public void close() {
        dbHandler.close();
    }

    //Define Custom Methods for implement Database Operation
	/*
	public void insertData(<Required Parameter>){
		ContentValues cv = new ContentValues();
		cv.put("<TableField Name", <Value>);

        if (database.insert("<TableName>", null, cv) > 0) {
            return 1;
        } else {
            return 0;
        }
	}
	
	public int updateData(<Required Parameter>) {
        ContentValues cv = new ContentValues();
		cv.put("<TableField Name", <Value>);

        if (database.update("<TableName>", cv, "Id=?", new String[]{String.valueOf(<ID for update>)}) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
	
	public int deleteData(int ID) {
        if (database.delete("<TableName>", "Id=?", new String[]{String.valueOf(ID)}) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
	
	public MyModel getData(int ID) {
        MyModel myModel = new MyModel();
        String query = "SELECT * FROM <TABLE_NAME> WHERE Id=" + ID;
        Cursor c = database.rawQuery(query, null);
        while (c.moveToNext()) {
            myModel.setId(c.getInt(0));
            myModel.setName(c.getString(1));
        }
        return myModel;
    }
	*/
}
