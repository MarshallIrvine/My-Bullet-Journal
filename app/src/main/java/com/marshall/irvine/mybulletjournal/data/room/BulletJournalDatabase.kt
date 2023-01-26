package com.marshall.irvine.mybulletjournal.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.marshall.irvine.mybulletjournal.data.room.dao.EventDao
import com.marshall.irvine.mybulletjournal.data.room.dao.NoteDao
import com.marshall.irvine.mybulletjournal.data.room.dao.TaskDao
import com.marshall.irvine.mybulletjournal.data.room.entity.Event
import com.marshall.irvine.mybulletjournal.data.room.entity.Note
import com.marshall.irvine.mybulletjournal.data.room.entity.Task

@Database(entities = [Note::class, Event::class, Task::class], version = 1)
abstract class BulletJournalDatabase: RoomDatabase() {
    abstract fun taskDAO(): TaskDao
    abstract fun noteDAO(): NoteDao
    abstract fun eventDAO(): EventDao

    companion object {

        @Volatile
        private var INSTANCE: BulletJournalDatabase? = null
        private const val DB_NAME = "bullet_journal_db"
        fun getInstance(context: Context): BulletJournalDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room
                    .databaseBuilder(context = context, BulletJournalDatabase::class.java, name = DB_NAME)
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}