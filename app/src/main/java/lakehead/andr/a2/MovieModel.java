package lakehead.andr.a2;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class MovieModel {
    @SerializedName("Title")
    private String title;
    @SerializedName("Year")
    private String year;
    @SerializedName("Released")
    private String released;
    @SerializedName("Runtime")
    private String runtime;
    @SerializedName("Genre")
    private String genre;
    @SerializedName("Director")
    private String director;
    @SerializedName("Writer")
    private String writer;
    @SerializedName("Actors")
    private String actors;
    @SerializedName("Plot")
    private String plot;
    @SerializedName("Language")
    private String language;
    @SerializedName("Country")
    private String country;
    @SerializedName("Awards")
    private String awards;
    @SerializedName("Poster")
    private String poster;
    @SerializedName("Ratings")
    private List<MovieRatings> ratings;
    @SerializedName("Metascore")
    private String metascore;
    @SerializedName("imdbRating")
    private String imdbRating;
    @SerializedName("imdbID")
    private String imdbID;
    @SerializedName("Type")
    private String type;
    @SerializedName("DVD")
    private String dvd;
    @SerializedName("BoxOffice")
    private String boxOffice;
    @SerializedName("Production")
    private String production;
    @SerializedName("Website")
    private String website;
    @SerializedName("Response")
    private String response;

    public MovieModel (String title,
                     String year,
                     String released,
                     String runtime,
                     String genre,
                     String director,
                     String writer,
                     String actors,
                     String plot,
                     String language,
                     String country,
                     String awards,
                     String poster,
                     List<MovieRatings> ratings,
                     String metascore,
                     String imdbRating,
                     String imdbID,
                     String type,
                     String dvd,
                     String boxOffice,
                     String production,
                     String website,
                     String response)
    {
        setTitle(title);
        setYear(year);
        setReleased(released);
        setRuntime(runtime);
        setGenre(genre);
        setDirector(director);
        setWriter(writer);
        setActors(actors);
        setPlot(plot);
        setLanguage(language);
        setCountry(country);
        setAwards(awards);
        setPoster(poster);
        setRatings(ratings);
        setMetascore(metascore);
        setImdbRating(imdbRating);
        setImdbID(imdbID);
        setType(type);
        setDvd(dvd);
        setBoxOffice(boxOffice);
        setProduction(production);
        setWebsite(website);
        setResponse(response);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReleased() {
        return this.released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return this.runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return this.actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return this.plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAwards() {
        return this.awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return this.poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<MovieRatings> getRatings() {
        return this.ratings;
    }

    public void setRatings(List<MovieRatings> ratings) {
        this.ratings = ratings;
    }

    public String getMetascore() {
        return this.metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public String getImdbRating() {
        return this.imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbID() {
        return this.imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDvd() {
        return this.dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getBoxOffice() {
        return this.boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduction() {
        return this.production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString ()
    {
        return this.title;
    }
}
