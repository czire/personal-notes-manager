package com.example.personalnotesmanager.data.models;

public class BaseModel {
    protected int id;

    public BaseModel() {
        id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
