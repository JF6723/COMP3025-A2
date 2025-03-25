package lakehead.andr.a2;

public class MovieItem
{
    int poster;
    String title;
    String studio;
    String rating;
    String year;

    public MovieItem (String title, String studio, String rating, String year)
    {
        this.setTitle (title);
        this.setStudio (studio);
        this.setRating (rating);
        this.setYear (year);
    }

    public String getTitle ()
    {
        return this.title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getStudio ()
    {
        return this.studio;
    }
    public void setStudio (String studio)
    {
        this.studio = studio;
    }

    public String getRating ()
    {
        return this.rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getYear ()
    {
        return this.year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }
}
