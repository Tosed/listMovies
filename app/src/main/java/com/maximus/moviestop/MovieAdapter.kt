package com.maximus.moviestop


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maximus.moviestop.model.Movies
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(
    private val movies: List<Movies>
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false))

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
       fun bindMovie(movie: Movies){
          itemView.tvTitle.text = movie.title
          itemView.tvData.text = movie.release
           itemView.tvSinopse.text = movie.overview
           Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.ivImagePoster)
       }
    }
}
