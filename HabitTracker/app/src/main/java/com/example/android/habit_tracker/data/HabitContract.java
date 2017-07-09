package com.example.android.habit_tracker.data;

import android.provider.BaseColumns;

/**
 * Created by PB on 04/07/2017.
 * Habit Tracker app for patient.
 * For Udacity, school !
 */


// To prevent someone from accidentally instantiating the contract class,
public final class HabitContract {
    // give it an empty constructor.
    private HabitContract() {}

    /**
     * Inner class that defines constant values for the Medication, database table.
     * Each entry in the table represents a single treatment.
     */
    public static final class FeedEntry implements BaseColumns {

        /**
         * Name of database table
         */
        public final static String TABLE_NAME = "Habits";

        /**
         * Unique ID number for the patient (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Patient Complete name.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PATIENT_NAME = "name";

        /**
         * Patient gender.
         * <p>
         * Type: INT
         */
        public final static String COLUMN_PATIENT_GENDER = "gender";

        /**
         * Weight of the patient.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PATIENT_WEIGHT = "weight";

        /**
         * Patient referent name doctor.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PATIENT_DOCTOR = "doctor";

        /**
         * Name of medication.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PATIENT_MEDICATION_NAME = "medication_name";

        /**
         * Type of disease .
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PATIENT_TYPE_OF_DISEASE = "disease";

        /**
         * Dosage prescription.
         * <p>
         * Type: INT
         */
        public final static String COLUMN_PATIENT_DAILY_DOSAGE = "dosage";

        /**
         * Length of treatment.
         * <p>
         * Type: INT
         */
        public final static String COLUMN_PATIENT_LENGTH_OF_TREATMENT = "treatment";

        /**
         * Possible values for the patient gender.
         */
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        /**
         * Possible values for daily dosage.
         * TODO: implement values
         */


    }

}


