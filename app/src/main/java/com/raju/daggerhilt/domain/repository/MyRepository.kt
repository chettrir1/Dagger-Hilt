package com.raju.daggerhilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}