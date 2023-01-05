package space.mairi.movieapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class MovieDTO(
    val items: ArrayList<ItemDTO> = ArrayList()
): Parcelable

fun getMovieFromServer() : List<MovieDTO> {
    return listOf(MovieDTO())
}
