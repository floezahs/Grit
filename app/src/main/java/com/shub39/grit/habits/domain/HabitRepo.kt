package com.shub39.grit.habits.domain

import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface HabitRepo {
    suspend fun upsertHabit(habit: Habit)
    suspend fun deleteHabit(habitId: Long)

    suspend fun getHabits(): List<Habit>
    suspend fun getHabitStatuses(): List<HabitStatus>

    fun getHabitStatus(): Flow<Map<Habit, List<HabitStatus>>>
    suspend fun insertHabitStatus(habitStatus: HabitStatus)
    suspend fun deleteHabitStatus(id: Long, date: LocalDate)
}