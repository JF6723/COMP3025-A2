package lakehead.andr.a2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListHolder>
{
    Context context;
    List<MovieItem> movieItems;
    public MovieListAdapter (Context context, List<MovieItem> movieItems)
    {
        this.context = context;
        this.movieItems = movieItems;
    }

    @NonNull
    @Override
    public MovieListHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MovieListHolder (itemView);
    }

    @Override
    public void onBindViewHolder (@NonNull MovieListHolder holder, int position)
    {
        MovieItem movieItem = movieItems.get (position);

        holder.titleView.setText(movieItem.getTitle());
        holder.studioView.setText(movieItem.getStudio());
        holder.ratingView.setText(movieItem.getRating());
        holder.yearView.setText(movieItem.getYear());
    }

    @Override
    public int getItemCount ()
    {
        return movieItems.size ();
    }
}
