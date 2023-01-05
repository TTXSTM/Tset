package space.mairi.movieapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import space.mairi.movieapp.R
import space.mairi.movieapp.model.MovieDTO


class MainFragmentAdapter(private val onItemClickListener: OnItemClickListener?) :
    RecyclerView.Adapter<MainFragmentAdapter.MainViewHolder>(){

    private var movieData : List<MovieDTO> = listOf()

    interface OnItemClickListener {
        fun onItemClick(movie: MovieDTO)
    }
    fun setMovie(data: List<MovieDTO>) {
        movieData = data
        notifyDataSetChanged()
    }

    inner class MainViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(movie: MovieDTO){
            itemView.apply {
                findViewById<TextView>(R.id.mainFragmentRecylerItemTextView).text =
                    movie.items[0].title

                findViewById<TextView>(R.id.movie_year).text =
                    movie.items[0].year

                findViewById<TextView>(R.id.movie_rating).text =
                    movie.items[0].imDbRating

                setOnClickListener{
                    onItemClickListener?.onItemClick(movie)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_main_recycle_item,
                                                        parent,
                                                        false) as View)

    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(movieData[position])
    }

    override fun getItemCount(): Int {
        return movieData.size
    }
}
