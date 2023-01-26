package com.marshall.irvine.mybulletjournal.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_task")
    val idTask: Int,
    @ColumnInfo(name = "name_task")
    val nameTask: String,
    @ColumnInfo(name = "is_done")
    val isDone: Boolean = false,
    @ColumnInfo(name = "is_important")
    val isImportant: Boolean = false
)
