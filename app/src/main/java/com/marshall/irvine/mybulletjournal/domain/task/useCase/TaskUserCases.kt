package com.marshall.irvine.mybulletjournal.domain.task.useCase

data class TaskUserCases(
    val addTaskUseCase: AddTaskUseCase,
    val deleteUseCase: DeleteUseCase,
    val updateTaskUseCase: UpdateTaskUseCase,
    val getAllTaskUseCase: GetAllTaskUseCase
)
