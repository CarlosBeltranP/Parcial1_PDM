package com.example.parcial1pdm.Database.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "BkTeam")
data class BkTeam(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id:Int,

    @ColumnInfo(name = "TeamA") val TeamA : String,
    @ColumnInfo(name = "ScoreA") val ScoreA : String,

    @ColumnInfo(name = "TeamB") val TeamB : String,
    @ColumnInfo(name = "ScoreB") val ScoreB : String


)