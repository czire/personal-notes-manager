package com.example.personalnotesmanager.data.models;

public class Note extends BaseModel {
    private int userId;
    private String title, content, category;
    private long dateCreated;
    private boolean isFavorite;

    public Note(int userId, String title, String content, String category, long dateCreated, boolean isFavorite) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.category = category;
        this.dateCreated = dateCreated;
        this.isFavorite = isFavorite;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
