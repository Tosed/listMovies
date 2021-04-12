package com.maximus.moviestop.services

import com.maximus.moviestop.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=$KEY_API")
    fun getMovieList(): Call<MovieResponse>
}


// Coloque sua chave de api aqui
const val KEY_API = "382cc7578dcfea0321950771dc28d678"