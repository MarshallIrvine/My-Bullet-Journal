package com.marshall.irvine.mybulletjournal.domain.task.useCase

import com.marshall.irvine.mybulletjournal.data.repository.TaskRepositoryImpl
import com.marshall.irvine.mybulletjournal.data.room.entity.Task
import javax.inject.Inject

class DeleteUseCase @Inject constructor(private val taskRepositoryImpl: TaskRepositoryImpl) {
    fun invoke(task: Task) {
        taskRepositoryImpl.deleteTask(task = task)
    }
}