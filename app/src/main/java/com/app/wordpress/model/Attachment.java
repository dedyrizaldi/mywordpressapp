package com.app.wordpress.model;

import com.app.wordpress.realm.table.AttachmentRealm;

import java.io.Serializable;

public class Attachment implements Serializable {
    public int id ;
    public String url;
    public String mime_type;

    public AttachmentRealm getObjectRealm() {
        AttachmentRealm a = new AttachmentRealm();
        a.id = id;
        a.url = url;
        a.mime_type = mime_type;
        return a;
    }
}
