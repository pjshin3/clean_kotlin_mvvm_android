package com.example.clean_kotlin_mvvm.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.clean_kotlin_mvvm.entity.SampleEntity

@Dao
interface SampleDao {
    @Query("SELECT * FROM SAMPLE_TABLE")
    fun getSampleData():LiveData<List<SampleEntity>>
}