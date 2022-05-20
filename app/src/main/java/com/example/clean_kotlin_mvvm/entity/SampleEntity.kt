package com.example.clean_kotlin_mvvm.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.clean_kotlin_mvvm.utill.Const

@Entity(tableName = Const.Table_Name.SAMPLE_TABLE)
data class SampleEntity(
    @PrimaryKey
    var Id : String = "",
    var name: String = "",
    var age: String = ""
)
