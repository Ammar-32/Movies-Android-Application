package com.ammar.teamandroidaholicsmovieapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ammar.teamandroidaholicsmovieapp.data.vo.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(movie : Movie)

    @Query("select * from movies_table where id = id")
    fun getMovie(): LiveData<Movie>
}
