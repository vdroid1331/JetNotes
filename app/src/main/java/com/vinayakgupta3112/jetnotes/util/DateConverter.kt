package com.vinayakgupta3112.jetnotes.util

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun dateFromTimestamp(timestamp: Long?): Date? {
        return timestamp?.let { Date(it) }
    }

    @TypeConverter
    fun timeStampFromDate(date: Date?): Long? {
        return date?.time
    }
}
