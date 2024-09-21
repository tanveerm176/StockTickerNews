package com.example.stocktickernews.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
/*what is the difference between RoomDatabase and RoomDatabase()*/
abstract class StockDatabase: RoomDatabase() {
    abstract val dao: StockDao
}