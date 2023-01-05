package space.mairi.movieapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.mairi.movieapp.model.Repository
import space.mairi.movieapp.model.RepositoryImpl
import space.mairi.movieapp.viewmodel.AppState
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserver : MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()) : ViewModel(){

        fun getLiveData() = liveDataToObserver

        fun getMovie() = getDataFromServerSource(true)


//        private val onLoaderListener : MovieLoader.MovieLoaderListener =
//            object : MovieLoader.MovieLoaderListener {
//                override fun onLoaded(movieDTO: MovieDTO) {
//                    movieDTO
//                }
//
//                override fun onFailed(throwable: Throwable) {
//
//                }
//            }

        fun getMovieFromServerStorageNowPlaying() = getDataFromServerSource(true)

        private fun getDataFromServerSource(isNowPlaying : Boolean){

            liveDataToObserver.value = AppState.Loading

            Thread{
                sleep(2000)

                liveDataToObserver.postValue(
                    AppState.Success(repositoryImpl.getMovieFromServer()))

            }.start()
        }
    }


