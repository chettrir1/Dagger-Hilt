package com.raju.daggerhilt.data.repository

import com.raju.daggerhilt.data.remote.MyApi
import com.raju.daggerhilt.domain.repository.MyRepository

class MyRepositoryClassImpl(
    private val api: MyApi
) : MyRepository {

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}