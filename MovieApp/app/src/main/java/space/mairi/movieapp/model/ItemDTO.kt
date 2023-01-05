package space.mairi.movieapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemDTO(
    val title : String?,
    val fullTitle : String?,
    val year : String?,
    val releaseState : String?,
    val runtimeStr : String?,
    val plot : String?,
    val imDbRating : String?
) : Parcelable