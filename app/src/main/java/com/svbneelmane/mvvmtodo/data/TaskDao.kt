package com.svbneelmane.mvvmtodo.data

import androidx.room.Dao

@Dao
interface TaskDao {
    suspend fun insert(task: Task)
}