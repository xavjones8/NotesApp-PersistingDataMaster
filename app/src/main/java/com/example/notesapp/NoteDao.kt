package com.example.notesapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAll(): List<Note>

    @Insert
    fun insertAll(vararg notes: Note)

    @Delete
    fun delete(note: Note)
}