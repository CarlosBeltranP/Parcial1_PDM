package com.example.parcial1pdm.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.parcial1pdm.Database.Entity.BkTeam
import com.example.parcial1pdm.Database.Entity.Dao.BkTeamDAo

class BkRepository (val BkTeamDAo : BkTeamDAo) {

    val allTeams : LiveData<List<BkTeam>> = BkTeamDAo.getAll()

    fun getAll() : LiveData<List<BkTeam>>{
        return BkTeamDAo.getAll()
    }

    @WorkerThread
    fun insert(team: BkTeam){
        BkTeamDAo.insert(team)
    }
}