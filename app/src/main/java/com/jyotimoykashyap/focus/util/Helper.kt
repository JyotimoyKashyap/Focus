package com.jyotimoykashyap.focus.util

import java.util.*


// base class for deciding the interval
enum class TimeInterval {
    DAY, WEEK, MONTH, SIX_MONTHS
}

const val DAY = -1
const val WEEK = -7
const val MONTH = -1
const val SIX_MONTHS = -6

// this function will return the time in milliseconds from
// current time till a time in past based on interval
fun getMilliSeconds(interval: TimeInterval): Long{
    when(interval) {
        TimeInterval.DAY -> {
            Calendar.getInstance(TimeZone.getTimeZone("UTC")).apply {
                add(Calendar.DAY_OF_MONTH, DAY)
                return timeInMillis
            }
        }
        TimeInterval.WEEK -> {
            Calendar.getInstance(TimeZone.getTimeZone("UTC")).apply {
                add(Calendar.DAY_OF_YEAR, WEEK)
                return timeInMillis
            }
        }
        TimeInterval.MONTH -> {
            Calendar.getInstance(TimeZone.getTimeZone("UTC")).apply {
                add(Calendar.MONTH, MONTH)
                return timeInMillis
            }
        }
        TimeInterval.SIX_MONTHS -> {
            Calendar.getInstance(TimeZone.getTimeZone("UTC")).apply {
                add(Calendar.MONTH, SIX_MONTHS)
                return timeInMillis
            }
        }
    }
}

