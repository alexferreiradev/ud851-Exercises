package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "waitlist.db";
	public static final int DATABASE_VERSION = 1;

	public WaitlistDbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String createSql = "create table " +
				WaitlistContract.WaitlistEntry.TABLE_NAME + " (" +
				WaitlistContract.WaitlistEntry._ID + "integer primary key," +
				WaitlistContract.WaitlistEntry.COLUMN_GUEST_NAME + " text," +
				WaitlistContract.WaitlistEntry.COLUMN_PARTY_SIZE + " text," +
				WaitlistContract.WaitlistEntry.COLUMN_TIMESTAMP + " timestamp)";

		db.execSQL(createSql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int i, int i1) {
		String dropSql = "drop table if exists x";
		db.execSQL(dropSql);

		onCreate(db);
	}

	// (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"

    // (3) Create a static final int called DATABASE_VERSION and set it to 1

    // (4) Create a Constructor that takes a context and calls the parent constructor

    //  (5) Override the onCreate method

        // (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    //  (8) Override the onUpgrade method

        // (9) Inside, execute a drop table query, and then call onCreate to re-create it

}