package space.mairi.movieapp.model

class RepositoryImpl : Repository{

    override fun getMovieFromServer(): List<MovieDTO> {
        return listOf(MovieDTO())
    }

    override fun getMovieFromLocalStorageNowPlaying(): List<Movie> {
        return getNowPlaying()
    }


}