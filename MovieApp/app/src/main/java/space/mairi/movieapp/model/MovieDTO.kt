package space.mairi.movieapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class MovieDTO(
    val items: List<ItemDTO?> = ArrayList<ItemDTO?>()

): Parcelable

fun getMovieFromServer() : List<MovieDTO?> {
    val items : List<MovieDTO> = ArrayList()
    return items
}

