package com.example.parcial1pdm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.parcial1pdm.Database.Entity.BkTeam
import com.example.parcial1pdm.Repository.BkRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BkViewModel (private val app : Application) : AndroidViewModel(app){

    private val repository : BkRepository
    val allTeams : LiveData<List<BkTeam>>

    init {
        val team = BkRoomDatabase.getInstance(app).BkTeamDAo()
        repository = BkRepository(team)
        allTeams = repository.getAll()
    }

    fun getAll() : LiveData<List<BkTeam>>{
        return repository.getAll()
    }

    fun insert(BkTeam : BkTeam) = viewModelScope.launch(Dispatchers.IO){

        repository.insert(BkTeam)



    }

}