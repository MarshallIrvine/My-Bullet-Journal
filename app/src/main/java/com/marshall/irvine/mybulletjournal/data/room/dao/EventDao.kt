package com.marshall.irvine.mybulletjournal.data.room.dao

import androidx.room.*
import com.marshall.irvine.mybulletjournal.data.room.entity.Event
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {
    @Query("SELECT * FROM events")
    fun getAllEvents(): Flow<List<Event>>

    @Insert
    fun insertEvent(event: Event)

    @Update
    fun updateEvent(event: Event)

    @Delete
    fun deleteEvent(event: Event)
}