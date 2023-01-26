package com.marshall.irvine.mybulletjournal.domain.task.useCase

import com.marshall.irvine.mybulletjournal.data.repository.TaskRepositoryImpl
import com.marshall.irvine.mybulletjournal.data.room.entity.Task
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepositoryImpl) {
    fun invoke(task: Task) {
        taskRepository.updateTask(task = task)
    }
}