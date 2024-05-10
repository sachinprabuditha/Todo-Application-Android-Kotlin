package com.coding.meet.todo_app.converters

import androidx.room.TypeConverter
import java.util.Date

class TypeConverter {

    // Convert Date to Long
    @TypeConverter
    fun fromTimestamp(value:Long): Date {
        return Date(value)
    }

    // Convert Long to Date
    @TypeConverter
    fun dateToTimestamp(date:Date): Long {
        return date.time
    }
}