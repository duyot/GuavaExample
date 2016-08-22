package com.vivas.dto;

/**
 * Created by duyot on 8/22/2016.
 */
public class TVODItemDTO {
    private String video_id;
    private String video_english_title;
    private String video_vietnamese_title;
    private String video_price;
    private String video_number_views;
    private String video_duration;
    private String video_director;
    private String video_actor;
    private String category_list;
    private String video_description;
    private String video_picture_path;


    public TVODItemDTO(String video_id, String video_english_title, String video_vietnamese_title, String video_price, String video_number_views, String video_duration, String video_director, String video_actor, String category_list, String video_description, String video_picture_path) {
        this.video_id = video_id;
        this.video_english_title = video_english_title;
        this.video_vietnamese_title = video_vietnamese_title;
        this.video_price = video_price;
        this.video_number_views = video_number_views;
        this.video_duration = video_duration;
        this.video_director = video_director;
        this.video_actor = video_actor;
        this.category_list = category_list;
        this.video_description = video_description;
        this.video_picture_path = video_picture_path;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getVideo_english_title() {
        return video_english_title;
    }

    public void setVideo_english_title(String video_english_title) {
        this.video_english_title = video_english_title;
    }

    public String getVideo_vietnamese_title() {
        return video_vietnamese_title;
    }

    public void setVideo_vietnamese_title(String video_vietnamese_title) {
        this.video_vietnamese_title = video_vietnamese_title;
    }

    public String getVideo_price() {
        return video_price;
    }

    public void setVideo_price(String video_price) {
        this.video_price = video_price;
    }

    public String getVideo_number_views() {
        return video_number_views;
    }

    public void setVideo_number_views(String video_number_views) {
        this.video_number_views = video_number_views;
    }

    public String getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(String video_duration) {
        this.video_duration = video_duration;
    }

    public String getVideo_director() {
        return video_director;
    }

    public void setVideo_director(String video_director) {
        this.video_director = video_director;
    }

    public String getVideo_actor() {
        return video_actor;
    }

    public void setVideo_actor(String video_actor) {
        this.video_actor = video_actor;
    }

    public String getCategory_list() {
        return category_list;
    }

    public void setCategory_list(String category_list) {
        this.category_list = category_list;
    }

    public String getVideo_description() {
        return video_description;
    }

    public void setVideo_description(String video_description) {
        this.video_description = video_description;
    }

    public String getVideo_picture_path() {
        return video_picture_path;
    }

    public void setVideo_picture_path(String video_picture_path) {
        this.video_picture_path = video_picture_path;
    }
}
