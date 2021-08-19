package com.example.diskone.frag;

import java.io.Serializable;

public class Receitas implements Serializable {
    private String title;
    private String imageURL;
    private String description;
    private String ingredients;
    private String preparationMode;
    private String preparationTime;
    private String rediment;
    private String kcal;

    public Receitas() {
    }

    public Receitas(String title, String imageURL, String description, String ingredients, String preparationMode, String preparationTime, String rediment, String kcal) {
        this.title = title;
        this.imageURL = imageURL;
        this.description = description;
        this.ingredients = ingredients;
        this.preparationMode = preparationMode;
        this.preparationTime = preparationTime;
        this.rediment = rediment;
        this.kcal = kcal;
    }

    public Receitas(String toString, String s, String toString1, String toString2, String toString3) {
        this.title = toString;
        this.imageURL = s;
        this.description = toString1;
        this.ingredients = toString2;
        this.preparationMode = toString3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparationMode() {
        return preparationMode;
    }

    public void setPreparationMode(String preparationMode) {
        this.preparationMode = preparationMode;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getRediment() {
        return rediment;
    }

    public void setRediment(String rediment) {
        this.rediment = rediment;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }
}
