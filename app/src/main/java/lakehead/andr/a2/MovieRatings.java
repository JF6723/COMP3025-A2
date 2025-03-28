package lakehead.andr.a2;

import com.google.gson.annotations.SerializedName;

public class MovieRatings
{
    @SerializedName("Source")
    private String source;
    @SerializedName("Value")
    private String value;

    public String getSource()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }
}
