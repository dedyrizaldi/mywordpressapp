package io.realm;


public interface PostRealmRealmProxyInterface {
    public int realmGet$id();
    public void realmSet$id(int value);
    public String realmGet$type();
    public void realmSet$type(String value);
    public String realmGet$slug();
    public void realmSet$slug(String value);
    public String realmGet$url();
    public void realmSet$url(String value);
    public String realmGet$status();
    public void realmSet$status(String value);
    public String realmGet$title();
    public void realmSet$title(String value);
    public String realmGet$title_plain();
    public void realmSet$title_plain(String value);
    public String realmGet$content();
    public void realmSet$content(String value);
    public String realmGet$excerpt();
    public void realmSet$excerpt(String value);
    public String realmGet$date();
    public void realmSet$date(String value);
    public String realmGet$modified();
    public void realmSet$modified(String value);
    public String realmGet$thumbnail();
    public void realmSet$thumbnail(String value);
    public int realmGet$comment_count();
    public void realmSet$comment_count(int value);
    public long realmGet$added_date();
    public void realmSet$added_date(long value);
    public RealmList<com.app.wordpress.realm.table.CategoryRealm> realmGet$categories();
    public void realmSet$categories(RealmList<com.app.wordpress.realm.table.CategoryRealm> value);
    public com.app.wordpress.realm.table.AuthorRealm realmGet$author();
    public void realmSet$author(com.app.wordpress.realm.table.AuthorRealm value);
    public RealmList<com.app.wordpress.realm.table.CommentRealm> realmGet$comments();
    public void realmSet$comments(RealmList<com.app.wordpress.realm.table.CommentRealm> value);
    public RealmList<com.app.wordpress.realm.table.AttachmentRealm> realmGet$attachments();
    public void realmSet$attachments(RealmList<com.app.wordpress.realm.table.AttachmentRealm> value);
}
