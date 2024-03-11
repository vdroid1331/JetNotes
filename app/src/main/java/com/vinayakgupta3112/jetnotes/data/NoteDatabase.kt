package com.vinayakgupta3112.jetnotes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vinayakgupta3112.jetnotes.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}