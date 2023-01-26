package com.marshall.irvine.mybulletjournal.di

import android.content.Context
import com.marshall.irvine.mybulletjournal.data.repository.TaskRepositoryImpl
import com.marshall.irvine.mybulletjournal.data.room.BulletJournalDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideBulletJournalDatabase(@ApplicationContext context: Context): BulletJournalDatabase {
        return BulletJournalDatabase.getInstance(context)
    }

    //Tasks
    @Provides
    @Singleton
    fun provideTaskRepositoryImpl(database: BulletJournalDatabase): TaskRepositoryImpl {
        return TaskRepositoryImpl(database = database)
    }
}