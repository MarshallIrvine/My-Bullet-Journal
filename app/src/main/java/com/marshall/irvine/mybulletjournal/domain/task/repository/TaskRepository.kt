package com.marshall.irvine.mybulletjournal.domain.task.repository

import com.marshall.irvine.mybulletjournal.data.room.entity.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun getAllTasks(): Flow<List<Task>>
    fun addTask(task: Task)
    fun updateTask(task: Task)
    fun deleteTask(task: Task)
}