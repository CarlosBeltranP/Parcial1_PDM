package com.example.parcial1pdm

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.parcial1pdm.Database.Entity.BkTeam
import com.example.parcial1pdm.Database.Entity.Dao.BkTeamDAo


@Database(entities = [BkTeam::class], version = 1, exportSchema = false)
abstract class BkRoomDatabase : RoomDatabase() {

    abstract fun BkTeamDAo() : BkTeamDAo

    companion object {
        @Volatile
        private  var INSTANCE : BkRoomDatabase? = null

        fun getInstance(
            context: Context
        ): BkRoomDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room
                    .databaseBuilder(context.applicationContext, BkRoomDatabase::class.java, "Teams")
                    .build()
                INSTANCE =instance
                return instance
            }
        }
    }
}