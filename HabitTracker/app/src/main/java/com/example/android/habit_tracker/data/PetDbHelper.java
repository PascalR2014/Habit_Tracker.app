package com.example.android.habit_tracker.data;

/**
 * Created by PB on 04/07/2017.
 * Habit Tracker app, for dog walkers, business
 * Udacity, inc !
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.habit_tracker.data.PetContract.FeedEntry;

/**
 * Database helper for Pets app. Manages database creation and version management.
 */
public class PetDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "TakeCareOfPETS.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructor - - Constructs a new instance of {@link PetDbHelper}.
     *
     * @param context of the app
     */
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the TCoPETS table
        String SQL_CREATE_TCoPETS_TABLE =  "CREATE TABLE " + FeedEntry.TABLE_NAME + " ("
                + FeedEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FeedEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + FeedEntry.COLUMN_PET_SPECIES + " INTEGER, "
                + FeedEntry.COLUMN_PET_HAIR_COLOR + " TEXT, "
                + FeedEntry.COLUMN_PET_BREED + " TEXT, "
                + FeedEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + FeedEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_TCoPETS_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do here now.
    }
}
