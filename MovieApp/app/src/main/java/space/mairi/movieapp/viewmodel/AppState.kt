package space.mairi.movieapp.viewmodel

import space.mairi.movieapp.model.MovieDTO

sealed class AppState {
    data class Success(val movieData: List<MovieDTO?>) : AppState()

    data class Error(val error : Throwable) : AppState()

    object Loading : AppState()
}