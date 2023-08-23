package com.kernalPanic.security;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("news")
public class NewsArticle {

    @Id
    private ObjectId id;
    private String title;
    private String articleLink;
    private String pubDate;
    private String publisher;
    private String country;
    private String category;
    private String Description;
    private String imgUrl;

    public NewsArticle(ObjectId id, String title, String articleLink, String pubDate, String publisher, String country, String category, String description, String imgUrl) {
        this.id = id;
        this.title = title;
        this.articleLink = articleLink;
        this.pubDate = pubDate;
        this.publisher = publisher;
        this.country = country;
        this.category = category;
        Description = description;
        this.imgUrl = imgUrl;
    }

    public NewsArticle(){

    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
