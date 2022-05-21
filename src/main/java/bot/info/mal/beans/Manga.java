package bot.info.mal.beans;

public class Manga {
    private int id;
    private String title;
    private String largeImage;
    private String synopsis;
    private Double mean;
    private int rank;
    private int popularity;
    private String mediaType;
    private int numChapters;

    public Manga(int id, String title, String largeImage, String synopsis, Double mean, int rank, int popularity, String mediaType, int numChapters) {
        this.id = id;
        this.title = title;
        this.largeImage = largeImage;
        this.synopsis = synopsis;
        this.mean = mean;
        this.rank = rank;
        this.popularity = popularity;
        this.mediaType = mediaType;
        this.numChapters = numChapters;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Double getMean() {
        return mean;
    }

    public int getRank() {
        return rank;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getMediaType() {
        return mediaType;
    }

    public int getNumChapters() {
        return numChapters;
    }
}
