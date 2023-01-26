package com.marshall.irvine.mybulletjournal.domain.task.useCase

import com.marshall.irvine.mybulletjournal.data.repository.TaskRepositoryImpl
import com.marshall.irvine.mybulletjournal.data.room.entity.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllTaskUseCase @Inject constructor(private val taskRepository: TaskRepositoryImpl) {
    fun invoke(): Flow<List<Task>> = taskRepository.getAllTasks()
}