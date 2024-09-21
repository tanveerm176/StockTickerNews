package com.example.stocktickernews.data.mapper

import com.example.stocktickernews.data.local.CompanyListingEntity
import com.example.stocktickernews.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        /*ID will be auto generated*/
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}