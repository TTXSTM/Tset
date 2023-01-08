package space.mairi.movieapp.model

interface Repository {

    fun getMovieFromServerStorageNowPlaying(): List<MovieDTO?>
    fun getMovieFromLocalStorageNowPlaying(): List<Movie>
}