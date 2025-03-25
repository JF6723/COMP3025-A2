package lakehead.andr.a2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import lakehead.andr.a2.databinding.ActivityMainBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    RecyclerView movieList;
    List<MovieItem> movieItems;
    MovieListAdapter movieListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.omdbapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIService apiService = retrofit.create(APIService.class);
        Call<List<MovieModel>> call = apiService.getMovies(); //"tt3896198","ccacae49"
        call.enqueue(new Callback<List<MovieModel>>() {
            @Override
            public void onResponse(@NonNull Call<List<MovieModel>> call, @NonNull Response<List<MovieModel>> response) {
                /*assert response.body() != null;
                for (MovieModel movie : response.body())
                {
                    movieItems.add (new MovieItem (movie.getTitle(), movie.getDirector(), movie.getRatings().get(0).getSource() + ": " + movie.getRatings().get(0).getValue(), movie.getYear()));
                }*/
                Toast.makeText(MainActivity.this, response.body().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<List<MovieModel>> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, "Error fetching data", Toast.LENGTH_SHORT).show();
            }
        });

        //movieItems = new ArrayList<>();
        //movieItems.add (new MovieItem(R.drawable.ic_launcher_background, "Titles", "Studio", "8", "1987" ));

        /*LinearLayoutManager movieListLayoutManager = new LinearLayoutManager (this);
        binding.movieList.setLayoutManager(movieListLayoutManager);

        movieListAdapter = new MovieListAdapter(getApplicationContext(), movieItems);
        binding.movieList.setAdapter (movieListAdapter);*/
    }
}