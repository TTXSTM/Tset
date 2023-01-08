package space.mairi.movieapp.model

class RepositoryImpl : Repository{

    override fun getMovieFromServerStorageNowPlaying(): List<MovieDTO?> {
        return getMovieFromServer()
    }

    override fun getMovieFromLocalStorageNowPlaying(): List<Movie> {
        return getNowPlaying()
    }


}