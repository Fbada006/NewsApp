package com.example.android.newsapp;

public class News {

    private String mTitle;

    private String mSection;

    private String mDate;

    private String mAuthor;

    private String mUrl;

    public News(String title, String section, String author, String date, String url) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getAuthor() { return mAuthor; }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
