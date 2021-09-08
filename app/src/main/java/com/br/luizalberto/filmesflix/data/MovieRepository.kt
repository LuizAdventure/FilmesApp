package com.br.luizalberto.filmesflix.data

class MovieRepository(private val movieDataSource: MovieDataSource) {

    fun getAllMoviesFromDataSource() = movieDataSource.getAllMovies()

}