package com.marshall.irvine.mybulletjournal.data.repository

import com.marshall.irvine.mybulletjournal.data.room.BulletJournalDatabase
import com.marshall.irvine.mybulletjournal.data.room.entity.Task
import com.marshall.irvine.mybulletjournal.domain.task.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(database: BulletJournalDatabase) : TaskRepository {
    private val taskDao = database.taskDAO()

    override fun getAllTasks(): Flow<List<Task>> = taskDao.getAllTasks()

    override fun addTask(task: Task) = taskDao.insertTask(task = task)

    override fun updateTask(task: Task) = taskDao.updateTask(task = task)

    override fun deleteTask(task: Task) = taskDao.deleteTask(task = task)
}