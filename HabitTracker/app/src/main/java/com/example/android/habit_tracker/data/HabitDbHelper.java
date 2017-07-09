package com.example.android.habit_tracker.data;

/**
 * Created by PB on 04/07/2017.
 * Habit Tracker app for patient.
 * For Udacity, school !
 */


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.habit_tracker.data.HabitContract.FeedEntry;

import org.w3c.dom.Text;


/**
 * Database helper for Habit tracker app. Manages database creation and version management.
 */
public class HabitDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = HabitDbHelper.class.getSimpleName();

    /**
     * Name of the database file
     */
    private static final String DATABASE_NAME = "TakeCare.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /** Construct new instance */
    public HabitDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the new table
        String SQL_CREATE_TakeCare_TABLE = "CREATE TABLE "
                + FeedEntry.TABLE_NAME + " ("
                + FeedEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FeedEntry.COLUMN_PATIENT_NAME + " TEXT NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_GENDER + " INTEGER NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_WEIGHT + " INTEGER NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_DOCTOR + " TEXT NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_MEDICATION_NAME + " TEXT NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_TYPE_OF_DISEASE + " TEXT NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_DAILY_DOSAGE + " INTEGER NOT NULL, "
                + FeedEntry.COLUMN_PATIENT_LENGTH_OF_TREATMENT + " INTEGER NOT NULL);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_TakeCare_TABLE);
    }

    // Insert method db
    public void insertHabit(Text name, int gender, int weight, Text doctor, Text medication_name, Text disease, int dosage, int treatment) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedEntry.COLUMN_PATIENT_NAME, "name");
        values.put(FeedEntry.COLUMN_PATIENT_GENDER, "gender");
        values.put(FeedEntry.COLUMN_PATIENT_WEIGHT, "weight");
        values.put(FeedEntry.COLUMN_PATIENT_DOCTOR, "doctor");
        values.put(FeedEntry.COLUMN_PATIENT_MEDICATION_NAME, "medication_name");
        values.put(FeedEntry.COLUMN_PATIENT_TYPE_OF_DISEASE, "disease");
        values.put(FeedEntry.COLUMN_PATIENT_DAILY_DOSAGE, "dosage");
        values.put(FeedEntry.COLUMN_PATIENT_LENGTH_OF_TREATMENT, "treatment");
        db.insert(FeedEntry.TABLE_NAME, null, values);
        //db.close();
    }

    // Readable db()
    public Cursor readHabits() {
        SQLiteDatabase db = getReadableDatabase();
        String[] projection = {
                FeedEntry._ID,
                FeedEntry.COLUMN_PATIENT_NAME,
                FeedEntry.COLUMN_PATIENT_GENDER,
                FeedEntry.COLUMN_PATIENT_WEIGHT,
                FeedEntry.COLUMN_PATIENT_DOCTOR,
                FeedEntry.COLUMN_PATIENT_MEDICATION_NAME,
                FeedEntry.COLUMN_PATIENT_TYPE_OF_DISEASE,
                FeedEntry.COLUMN_PATIENT_DAILY_DOSAGE,
                FeedEntry.COLUMN_PATIENT_LENGTH_OF_TREATMENT
        };

        Cursor cursor = db.query(
                FeedEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
        return cursor;
        //TODO : releasing resources

    }
    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do here now.
    }
}
