package com.raju.daggerhilt.data.repository

import android.app.Application
import com.raju.daggerhilt.R
import com.raju.daggerhilt.data.remote.MyApi
import com.raju.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val application: Application
) : MyRepository {

    init {
        val appName = application.getString(R.string.app_name)
        print("App Name : $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}