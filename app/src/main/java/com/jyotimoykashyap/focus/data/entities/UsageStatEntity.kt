package com.jyotimoykashyap.focus.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UsageStatEntity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    @ColumnInfo(name = "app_name")
    val appName: String,
    @ColumnInfo(name = "package_name")
    val packageName: String,
    @ColumnInfo(name = "last_time_used")
    val lastTimeUsed: Long,
    @ColumnInfo(name = "total_time_foreground")
    val totalTimeForeground: Long,
    @ColumnInfo(name = "total_time_visible")
    val totalTimeVisible: Long,
    @ColumnInfo(name = "day_usage")
    val dayUsage: Long,
    @ColumnInfo(name = "week_usage")
    val weeklyUsage: Long,
    @ColumnInfo(name = "monthly_usage")
    val monthlyUsage: Long,
    @ColumnInfo(name = "six_month_usage")
    val sixMonthUsage: Long

)