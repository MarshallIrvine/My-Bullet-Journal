package com.marshall.irvine.mybulletjournal.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class Event(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_event")
    val idEvent: Int,
    @ColumnInfo(name = "name_event")
    val nameEvent: Int,
    @ColumnInfo(name = "address_event")
    val addressEvent: String,
    @ColumnInfo(name = "date_event")
    val dateEvent: String
)
