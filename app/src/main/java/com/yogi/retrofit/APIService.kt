package com.yogi.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET ("character")
    fun getRick(): Call<ResponseRick>
}