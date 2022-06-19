package com.jyotimoykashyap.focus.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jyotimoykashyap.focus.data.entities.UsageStatEntity

@Dao
interface UsageStatDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUsageStat(usageStatEntity: UsageStatEntity)

    @Query("SELECT * FROM usage_stats_table " +
            "WHERE timestamp >= :timeStampBegin AND timestamp <= :timeStampEnd " +
            "ORDER BY total_time_foreground DESC")
    suspend fun readUsageStatAsPerDate(timeStampBegin: Long, timeStampEnd: Long): LiveData<List<UsageStatEntity>>

}