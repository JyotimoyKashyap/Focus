package com.jyotimoykashyap.focus.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usage_stats_table")
data class UsageStatEntity(
    @PrimaryKey
    @ColumnInfo(name = "package_name")
    val packageName: String,
    @ColumnInfo(name = "timestamp")
    val timestamp: Long,
    @ColumnInfo(name = "app_name")
    val appName: String,
    @ColumnInfo(name = "last_time_used")
    val lastTimeUsed: Long,
    @ColumnInfo(name = "total_time_foreground")
    val totalTimeForeground: Long,
    @ColumnInfo(name = "total_time_visible")
    val totalTimeVisible: Long
)