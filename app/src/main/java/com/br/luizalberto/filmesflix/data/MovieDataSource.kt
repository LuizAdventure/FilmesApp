package com.br.luizalberto.filmesflix.data

interface MovieDataSource {

    fun getAllMovies(): List<Movie>

}