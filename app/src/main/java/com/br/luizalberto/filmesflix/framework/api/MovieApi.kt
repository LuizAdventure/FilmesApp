package com.br.luizalberto.filmesflix.framework.api

import com.br.luizalberto.filmesflix.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    @GET("natanfelipe/FilmesFlixJson/master/moviesList")
    fun getAllMovies(): Call<List<Movie>>

}