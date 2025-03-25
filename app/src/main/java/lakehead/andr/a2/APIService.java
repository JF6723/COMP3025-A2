package lakehead.andr.a2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("?i=tt3896198&apikey=ccacae49")
    Call<List<MovieModel>> getMovies();
}
