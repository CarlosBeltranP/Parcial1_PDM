package com.example.parcial1pdm.Database.Entity.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parcial1pdm.Database.Entity.BkTeam


@Dao
    interface BkTeamDAo {
        @Query("SELECT * FROM BkTeam")
        fun getAll(): LiveData<List<BkTeam>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insert(equipo: BkTeam)
    }
