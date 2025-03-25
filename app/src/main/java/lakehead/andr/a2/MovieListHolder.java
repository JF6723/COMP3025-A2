package lakehead.andr.a2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieListHolder extends RecyclerView.ViewHolder
{
    TextView titleView;
    TextView studioView;
    TextView ratingView;
    TextView yearView;
    public MovieListHolder (@NonNull View movieItemView)
    {
        super (movieItemView);

        titleView = movieItemView.findViewById(R.id.movieTitle);
        studioView = movieItemView.findViewById(R.id.movieStudio);
        ratingView = movieItemView.findViewById(R.id.movieRating);
        yearView = movieItemView.findViewById(R.id.movieYear);
    }
}
