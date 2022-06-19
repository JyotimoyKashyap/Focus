package com.jyotimoykashyap.focus.data.typeconverters

import androidx.room.TypeConverter
import java.util.*

class Converters {

    @TypeConverter
    fun timeStampToDate(value: Long): Calendar {
        return value.let { Calendar.getInstance().apply { timeInMillis = it } }
    }

    @TypeConverter
    fun dateToTimeStamp(calendar: Calendar): Long {
        return calendar.timeInMillis
    }
}