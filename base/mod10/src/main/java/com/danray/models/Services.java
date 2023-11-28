package com.danray.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Services {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long services_id;

    private String title, text;

    public Long getReview_id() {
        return services_id;
    }

    public void setReview_id(Long review_id) {
        this.services_id = review_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
