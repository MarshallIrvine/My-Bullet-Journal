package com.marshall.irvine.mybulletjournal.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_note")
    val idNote: Int,
    @ColumnInfo(name = "message")
    val message: String
)
