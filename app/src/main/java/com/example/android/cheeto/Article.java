package com.example.android.cheeto;

public class Article {

    private String headline;
    private String thumbnail;
    private String webUrl;
    private String category;
    private String webPublicationDate;
    private String author;

    public Article (String headline, String thumbnail, String webUrl,
                    String category, String author, String webPublicationDate) {
        this.headline = headline;
        this.thumbnail = thumbnail;
        this.webUrl = webUrl;
        this.category = category;
        this.webPublicationDate = webPublicationDate;
        this.author = author;
    }

    public String getHeadline() {
        return headline;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getCategory() {
        return category;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getAuthor() {
        return author;
    }
}
