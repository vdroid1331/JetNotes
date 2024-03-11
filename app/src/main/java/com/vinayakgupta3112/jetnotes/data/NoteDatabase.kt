package com.vinayakgupta3112.jetnotes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.vinayakgupta3112.jetnotes.model.Note
import com.vinayakgupta3112.jetnotes.util.DateConverter
import com.vinayakgupta3112.jetnotes.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}