package com.example.android.habit_tracker.data;

import android.provider.BaseColumns;

/**
 * Created by PB on 04/07/2017.
 * Habit Tracker app, for dog walkers, business
 * Udacity, inc !
 */


// To prevent someone from accidentally instantiating the contract class,
public final class PetContract {
    // give it an empty constructor.
    private PetContract() {
    }
    public static final String PATH_PETS = "pets";

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class FeedEntry implements BaseColumns {

        /**
         * Name of database table for pets
         */
        public final static String TABLE_NAME = "TCoPETS";

        /**
         * Unique ID number for the pet (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PET_NAME = "name";

        /**
         * Type of species for the pet.
         * The only possible values are {@link #CAT}, {@link #DOG},
         * or {@link #OTHER}.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PET_SPECIES = "species";

        /**
         * Hair color for the pet.
         * Brief description of hair color, dominant color only.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PET_HAIR_COLOR = "hair_color";

        /**
         * Breed of the pet.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet.
         * <p>
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for species of the pets.
         */
        public static final int CAT = 0;
        public static final int DOG = 1;
        public static final int OTHER = 3;

        /**
         * Possible values for the gender of the pets.
         */
        public static final int GENDER_MALE = 4;
        public static final int GENDER_FEMALE = 5;
        public static final int GENDER_UNKNOWN = 6;

    }

}


