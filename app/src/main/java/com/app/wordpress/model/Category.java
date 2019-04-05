package com.app.wordpress.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.app.wordpress.realm.table.CategoryRealm;

public class Category implements Serializable {

    public int id = -1;
    public String slug = "";
    public String title = "";
    public String description = "";
    public String thumbnail = "";
    public int parent = -1;
    public int post_count = -1;

    public List<Attachment> attachments = new ArrayList<>();
    public Author author;


    public CategoryRealm getObjectRealm(){
        CategoryRealm c = new CategoryRealm();
        c.id = id;
        c.slug = slug;
        c.thumbnail = thumbnail;
        c.title = title;
        c.description = description;
        c.parent = parent;
        c.post_count = post_count;

        return c;
    }
}
