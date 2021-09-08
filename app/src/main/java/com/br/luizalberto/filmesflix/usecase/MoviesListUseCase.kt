package com.br.luizalberto.filmesflix.usecase

import com.br.luizalberto.filmesflix.data.MovieRepository

class MoviesListUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke() = movieRepository.getAllMoviesFromDataSource()

}