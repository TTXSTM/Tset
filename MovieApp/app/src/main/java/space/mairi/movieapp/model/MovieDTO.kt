package space.mairi.movieapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class MovieDTO(
    val items: List<ItemDTO> = ArrayList<ItemDTO>()
        .apply {
        add(
            ItemDTO(
                title = "Emma",
                fullTitle = "Emma 2020",
                releaseState = "19 june 2020",
                year = "2020",
                runtimeStr = "120 min",
                plot = "plot",
                imDbRating = "6.9"
            )
        )
    }
): Parcelable

fun getMovieFromServer() : List<MovieDTO> {
    return listOf(MovieDTO())
}
