package kangkan.developer.dynamicbinding;


import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kangkan.developer.dynamicbinding.databinding.MovieItemBinding;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    List<Movie>movies;
    public MovieAdapter(List<Movie>movies){
        this.movies=movies;
    }


    @Override
    public MovieViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        MovieItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.movie_item,
                viewGroup,
                false);
        return new MovieViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int i) {

        Movie aMovie = movies.get(i);
        MovieItemBinding binding = DataBindingUtil.bind(movieViewHolder.itemView);
        binding.setMovie(aMovie);
        binding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
