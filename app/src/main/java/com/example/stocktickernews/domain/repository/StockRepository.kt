package com.example.stocktickernews.domain.repository

import com.example.stocktickernews.domain.model.CompanyListing
import com.example.stocktickernews.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String

    ): Flow<Resource<List<CompanyListing>>> //emits multiple vals over time
}