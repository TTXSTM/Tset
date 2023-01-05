package space.mairi.movieapp.model

interface Repository {

    fun getMovieFromServer(): List<MovieDTO>
    fun getMovieFromLocalStorageNowPlaying(): List<Movie>
}