package io.realm;


import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.ImplicitTransaction;
import io.realm.internal.LinkView;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Table;
import io.realm.internal.TableOrView;
import io.realm.internal.android.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PostRealmRealmProxy extends com.app.wordpress.realm.table.PostRealm
    implements RealmObjectProxy, PostRealmRealmProxyInterface {

    static final class PostRealmColumnInfo extends ColumnInfo {

        public final long idIndex;
        public final long typeIndex;
        public final long slugIndex;
        public final long urlIndex;
        public final long statusIndex;
        public final long titleIndex;
        public final long title_plainIndex;
        public final long contentIndex;
        public final long excerptIndex;
        public final long dateIndex;
        public final long modifiedIndex;
        public final long thumbnailIndex;
        public final long comment_countIndex;
        public final long added_dateIndex;
        public final long categoriesIndex;
        public final long authorIndex;
        public final long commentsIndex;
        public final long attachmentsIndex;

        PostRealmColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(18);
            this.idIndex = getValidColumnIndex(path, table, "PostRealm", "id");
            indicesMap.put("id", this.idIndex);

            this.typeIndex = getValidColumnIndex(path, table, "PostRealm", "type");
            indicesMap.put("type", this.typeIndex);

            this.slugIndex = getValidColumnIndex(path, table, "PostRealm", "slug");
            indicesMap.put("slug", this.slugIndex);

            this.urlIndex = getValidColumnIndex(path, table, "PostRealm", "url");
            indicesMap.put("url", this.urlIndex);

            this.statusIndex = getValidColumnIndex(path, table, "PostRealm", "status");
            indicesMap.put("status", this.statusIndex);

            this.titleIndex = getValidColumnIndex(path, table, "PostRealm", "title");
            indicesMap.put("title", this.titleIndex);

            this.title_plainIndex = getValidColumnIndex(path, table, "PostRealm", "title_plain");
            indicesMap.put("title_plain", this.title_plainIndex);

            this.contentIndex = getValidColumnIndex(path, table, "PostRealm", "content");
            indicesMap.put("content", this.contentIndex);

            this.excerptIndex = getValidColumnIndex(path, table, "PostRealm", "excerpt");
            indicesMap.put("excerpt", this.excerptIndex);

            this.dateIndex = getValidColumnIndex(path, table, "PostRealm", "date");
            indicesMap.put("date", this.dateIndex);

            this.modifiedIndex = getValidColumnIndex(path, table, "PostRealm", "modified");
            indicesMap.put("modified", this.modifiedIndex);

            this.thumbnailIndex = getValidColumnIndex(path, table, "PostRealm", "thumbnail");
            indicesMap.put("thumbnail", this.thumbnailIndex);

            this.comment_countIndex = getValidColumnIndex(path, table, "PostRealm", "comment_count");
            indicesMap.put("comment_count", this.comment_countIndex);

            this.added_dateIndex = getValidColumnIndex(path, table, "PostRealm", "added_date");
            indicesMap.put("added_date", this.added_dateIndex);

            this.categoriesIndex = getValidColumnIndex(path, table, "PostRealm", "categories");
            indicesMap.put("categories", this.categoriesIndex);

            this.authorIndex = getValidColumnIndex(path, table, "PostRealm", "author");
            indicesMap.put("author", this.authorIndex);

            this.commentsIndex = getValidColumnIndex(path, table, "PostRealm", "comments");
            indicesMap.put("comments", this.commentsIndex);

            this.attachmentsIndex = getValidColumnIndex(path, table, "PostRealm", "attachments");
            indicesMap.put("attachments", this.attachmentsIndex);

            setIndicesMap(indicesMap);
        }
    }

    private final PostRealmColumnInfo columnInfo;
    private final ProxyState proxyState;
    private RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesRealmList;
    private RealmList<com.app.wordpress.realm.table.CommentRealm> commentsRealmList;
    private RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("type");
        fieldNames.add("slug");
        fieldNames.add("url");
        fieldNames.add("status");
        fieldNames.add("title");
        fieldNames.add("title_plain");
        fieldNames.add("content");
        fieldNames.add("excerpt");
        fieldNames.add("date");
        fieldNames.add("modified");
        fieldNames.add("thumbnail");
        fieldNames.add("comment_count");
        fieldNames.add("added_date");
        fieldNames.add("categories");
        fieldNames.add("author");
        fieldNames.add("comments");
        fieldNames.add("attachments");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    PostRealmRealmProxy(ColumnInfo columnInfo) {
        this.columnInfo = (PostRealmColumnInfo) columnInfo;
        this.proxyState = new ProxyState(com.app.wordpress.realm.table.PostRealm.class, this);
    }

    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    public void realmSet$id(int value) {
        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeIndex);
    }

    public void realmSet$type(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$slug() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.slugIndex);
    }

    public void realmSet$slug(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.slugIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.slugIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlIndex);
    }

    public void realmSet$url(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urlIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    public void realmSet$status(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleIndex);
    }

    public void realmSet$title(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.titleIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.titleIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$title_plain() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.title_plainIndex);
    }

    public void realmSet$title_plain(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.title_plainIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.title_plainIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$content() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentIndex);
    }

    public void realmSet$content(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contentIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$excerpt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.excerptIndex);
    }

    public void realmSet$excerpt(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.excerptIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.excerptIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dateIndex);
    }

    public void realmSet$date(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dateIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$modified() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.modifiedIndex);
    }

    public void realmSet$modified(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.modifiedIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.modifiedIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$thumbnail() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thumbnailIndex);
    }

    public void realmSet$thumbnail(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thumbnailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thumbnailIndex, value);
    }

    @SuppressWarnings("cast")
    public int realmGet$comment_count() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.comment_countIndex);
    }

    public void realmSet$comment_count(int value) {
        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.comment_countIndex, value);
    }

    @SuppressWarnings("cast")
    public long realmGet$added_date() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.added_dateIndex);
    }

    public void realmSet$added_date(long value) {
        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.added_dateIndex, value);
    }

    public RealmList<com.app.wordpress.realm.table.CategoryRealm> realmGet$categories() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (categoriesRealmList != null) {
            return categoriesRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.categoriesIndex);
            categoriesRealmList = new RealmList<com.app.wordpress.realm.table.CategoryRealm>(com.app.wordpress.realm.table.CategoryRealm.class, linkView, proxyState.getRealm$realm());
            return categoriesRealmList;
        }
    }

    public void realmSet$categories(RealmList<com.app.wordpress.realm.table.CategoryRealm> value) {
        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.categoriesIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!RealmObject.isValid(linkedObject)) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy)linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy)linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    public com.app.wordpress.realm.table.AuthorRealm realmGet$author() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.authorIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.app.wordpress.realm.table.AuthorRealm.class, proxyState.getRow$realm().getLink(columnInfo.authorIndex));
    }

    public void realmSet$author(com.app.wordpress.realm.table.AuthorRealm value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.authorIndex);
            return;
        }
        if (!RealmObject.isValid(value)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy)value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.authorIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    public RealmList<com.app.wordpress.realm.table.CommentRealm> realmGet$comments() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (commentsRealmList != null) {
            return commentsRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.commentsIndex);
            commentsRealmList = new RealmList<com.app.wordpress.realm.table.CommentRealm>(com.app.wordpress.realm.table.CommentRealm.class, linkView, proxyState.getRealm$realm());
            return commentsRealmList;
        }
    }

    public void realmSet$comments(RealmList<com.app.wordpress.realm.table.CommentRealm> value) {
        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.commentsIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!RealmObject.isValid(linkedObject)) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy)linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy)linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    public RealmList<com.app.wordpress.realm.table.AttachmentRealm> realmGet$attachments() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (attachmentsRealmList != null) {
            return attachmentsRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.attachmentsIndex);
            attachmentsRealmList = new RealmList<com.app.wordpress.realm.table.AttachmentRealm>(com.app.wordpress.realm.table.AttachmentRealm.class, linkView, proxyState.getRealm$realm());
            return attachmentsRealmList;
        }
    }

    public void realmSet$attachments(RealmList<com.app.wordpress.realm.table.AttachmentRealm> value) {
        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.attachmentsIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!RealmObject.isValid(linkedObject)) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy)linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy)linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    public static Table initTable(ImplicitTransaction transaction) {
        if (!transaction.hasTable("class_PostRealm")) {
            Table table = transaction.getTable("class_PostRealm");
            table.addColumn(RealmFieldType.INTEGER, "id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "type", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "slug", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "url", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "status", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "title", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "title_plain", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "content", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "excerpt", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "date", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "modified", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "thumbnail", Table.NULLABLE);
            table.addColumn(RealmFieldType.INTEGER, "comment_count", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.INTEGER, "added_date", Table.NOT_NULLABLE);
            if (!transaction.hasTable("class_CategoryRealm")) {
                CategoryRealmRealmProxy.initTable(transaction);
            }
            table.addColumnLink(RealmFieldType.LIST, "categories", transaction.getTable("class_CategoryRealm"));
            if (!transaction.hasTable("class_AuthorRealm")) {
                AuthorRealmRealmProxy.initTable(transaction);
            }
            table.addColumnLink(RealmFieldType.OBJECT, "author", transaction.getTable("class_AuthorRealm"));
            if (!transaction.hasTable("class_CommentRealm")) {
                CommentRealmRealmProxy.initTable(transaction);
            }
            table.addColumnLink(RealmFieldType.LIST, "comments", transaction.getTable("class_CommentRealm"));
            if (!transaction.hasTable("class_AttachmentRealm")) {
                AttachmentRealmRealmProxy.initTable(transaction);
            }
            table.addColumnLink(RealmFieldType.LIST, "attachments", transaction.getTable("class_AttachmentRealm"));
            table.addSearchIndex(table.getColumnIndex("id"));
            table.setPrimaryKey("id");
            return table;
        }
        return transaction.getTable("class_PostRealm");
    }

    public static PostRealmColumnInfo validateTable(ImplicitTransaction transaction) {
        if (transaction.hasTable("class_PostRealm")) {
            Table table = transaction.getTable("class_PostRealm");
            if (table.getColumnCount() != 18) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field count does not match - expected 18 but was " + table.getColumnCount());
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < 18; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final PostRealmColumnInfo columnInfo = new PostRealmColumnInfo(transaction.getPath(), table);

            if (!columnTypes.containsKey("id")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("id") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'id' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.idIndex) && table.findFirstNull(columnInfo.idIndex) != TableOrView.NO_MATCH) {
                throw new IllegalStateException("Cannot migrate an object with null value in field 'id'. Either maintain the same type for primary key field 'id', or remove the object with null value before migration.");
            }
            if (table.getPrimaryKey() != table.getColumnIndex("id")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Primary key not defined for field 'id' in existing Realm file. Add @PrimaryKey.");
            }
            if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
            }
            if (!columnTypes.containsKey("type")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'type' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("type") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'type' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.typeIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'type' is required. Either set @Required to field 'type' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("slug")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'slug' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("slug") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'slug' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.slugIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'slug' is required. Either set @Required to field 'slug' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("url")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'url' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("url") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'url' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.urlIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'url' is required. Either set @Required to field 'url' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("status")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'status' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("status") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'status' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.statusIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'status' is required. Either set @Required to field 'status' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("title")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'title' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("title") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'title' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.titleIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'title' is required. Either set @Required to field 'title' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("title_plain")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'title_plain' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("title_plain") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'title_plain' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.title_plainIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'title_plain' is required. Either set @Required to field 'title_plain' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("content")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'content' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("content") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'content' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.contentIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'content' is required. Either set @Required to field 'content' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("excerpt")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'excerpt' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("excerpt") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'excerpt' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.excerptIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'excerpt' is required. Either set @Required to field 'excerpt' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("date")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("date") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'date' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.dateIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'date' is required. Either set @Required to field 'date' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("modified")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'modified' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("modified") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'modified' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.modifiedIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'modified' is required. Either set @Required to field 'modified' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("thumbnail")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'thumbnail' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("thumbnail") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'thumbnail' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.thumbnailIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'thumbnail' is required. Either set @Required to field 'thumbnail' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("comment_count")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'comment_count' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("comment_count") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'comment_count' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.comment_countIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'comment_count' does support null values in the existing Realm file. Use corresponding boxed type for field 'comment_count' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("added_date")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'added_date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("added_date") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'long' for field 'added_date' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.added_dateIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'added_date' does support null values in the existing Realm file. Use corresponding boxed type for field 'added_date' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("categories")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'categories'");
            }
            if (columnTypes.get("categories") != RealmFieldType.LIST) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'CategoryRealm' for field 'categories'");
            }
            if (!transaction.hasTable("class_CategoryRealm")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing class 'class_CategoryRealm' for field 'categories'");
            }
            Table table_14 = transaction.getTable("class_CategoryRealm");
            if (!table.getLinkTarget(columnInfo.categoriesIndex).hasSameSchema(table_14)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid RealmList type for field 'categories': '" + table.getLinkTarget(columnInfo.categoriesIndex).getName() + "' expected - was '" + table_14.getName() + "'");
            }
            if (!columnTypes.containsKey("author")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'author' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("author") != RealmFieldType.OBJECT) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'AuthorRealm' for field 'author'");
            }
            if (!transaction.hasTable("class_AuthorRealm")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing class 'class_AuthorRealm' for field 'author'");
            }
            Table table_15 = transaction.getTable("class_AuthorRealm");
            if (!table.getLinkTarget(columnInfo.authorIndex).hasSameSchema(table_15)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid RealmObject for field 'author': '" + table.getLinkTarget(columnInfo.authorIndex).getName() + "' expected - was '" + table_15.getName() + "'");
            }
            if (!columnTypes.containsKey("comments")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'comments'");
            }
            if (columnTypes.get("comments") != RealmFieldType.LIST) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'CommentRealm' for field 'comments'");
            }
            if (!transaction.hasTable("class_CommentRealm")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing class 'class_CommentRealm' for field 'comments'");
            }
            Table table_16 = transaction.getTable("class_CommentRealm");
            if (!table.getLinkTarget(columnInfo.commentsIndex).hasSameSchema(table_16)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid RealmList type for field 'comments': '" + table.getLinkTarget(columnInfo.commentsIndex).getName() + "' expected - was '" + table_16.getName() + "'");
            }
            if (!columnTypes.containsKey("attachments")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'attachments'");
            }
            if (columnTypes.get("attachments") != RealmFieldType.LIST) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'AttachmentRealm' for field 'attachments'");
            }
            if (!transaction.hasTable("class_AttachmentRealm")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing class 'class_AttachmentRealm' for field 'attachments'");
            }
            Table table_17 = transaction.getTable("class_AttachmentRealm");
            if (!table.getLinkTarget(columnInfo.attachmentsIndex).hasSameSchema(table_17)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid RealmList type for field 'attachments': '" + table.getLinkTarget(columnInfo.attachmentsIndex).getName() + "' expected - was '" + table_17.getName() + "'");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(transaction.getPath(), "The 'PostRealm' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_PostRealm";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.PostRealm createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        com.app.wordpress.realm.table.PostRealm obj = null;
        if (update) {
            Table table = realm.getTable(com.app.wordpress.realm.table.PostRealm.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                obj = new io.realm.PostRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.PostRealm.class));
                ((RealmObjectProxy)obj).realmGet$proxyState().setRealm$realm(realm);
                ((RealmObjectProxy)obj).realmGet$proxyState().setRow$realm(table.getUncheckedRow(rowIndex));
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.PostRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.PostRealm.class, null);
                } else {
                    obj = (io.realm.PostRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.PostRealm.class, json.getInt("id"));
                }
            } else {
                obj = (io.realm.PostRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.PostRealm.class);
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$type(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("slug")) {
            if (json.isNull("slug")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$slug(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$slug((String) json.getString("slug"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$status(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("title_plain")) {
            if (json.isNull("title_plain")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$title_plain(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$title_plain((String) json.getString("title_plain"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$content(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("excerpt")) {
            if (json.isNull("excerpt")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$excerpt(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$excerpt((String) json.getString("excerpt"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$date(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$date((String) json.getString("date"));
            }
        }
        if (json.has("modified")) {
            if (json.isNull("modified")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$modified(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$modified((String) json.getString("modified"));
            }
        }
        if (json.has("thumbnail")) {
            if (json.isNull("thumbnail")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$thumbnail(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$thumbnail((String) json.getString("thumbnail"));
            }
        }
        if (json.has("comment_count")) {
            if (json.isNull("comment_count")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'comment_count' to null.");
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$comment_count((int) json.getInt("comment_count"));
            }
        }
        if (json.has("added_date")) {
            if (json.isNull("added_date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'added_date' to null.");
            } else {
                ((PostRealmRealmProxyInterface) obj).realmSet$added_date((long) json.getLong("added_date"));
            }
        }
        if (json.has("categories")) {
            if (json.isNull("categories")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$categories(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmGet$categories().clear();
                JSONArray array = json.getJSONArray("categories");
                for (int i = 0; i < array.length(); i++) {
                    com.app.wordpress.realm.table.CategoryRealm item = CategoryRealmRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((PostRealmRealmProxyInterface) obj).realmGet$categories().add(item);
                }
            }
        }
        if (json.has("author")) {
            if (json.isNull("author")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$author(null);
            } else {
                com.app.wordpress.realm.table.AuthorRealm authorObj = AuthorRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("author"), update);
                ((PostRealmRealmProxyInterface) obj).realmSet$author(authorObj);
            }
        }
        if (json.has("comments")) {
            if (json.isNull("comments")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$comments(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmGet$comments().clear();
                JSONArray array = json.getJSONArray("comments");
                for (int i = 0; i < array.length(); i++) {
                    com.app.wordpress.realm.table.CommentRealm item = CommentRealmRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((PostRealmRealmProxyInterface) obj).realmGet$comments().add(item);
                }
            }
        }
        if (json.has("attachments")) {
            if (json.isNull("attachments")) {
                ((PostRealmRealmProxyInterface) obj).realmSet$attachments(null);
            } else {
                ((PostRealmRealmProxyInterface) obj).realmGet$attachments().clear();
                JSONArray array = json.getJSONArray("attachments");
                for (int i = 0; i < array.length(); i++) {
                    com.app.wordpress.realm.table.AttachmentRealm item = AttachmentRealmRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((PostRealmRealmProxyInterface) obj).realmGet$attachments().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.PostRealm createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.app.wordpress.realm.table.PostRealm obj = realm.createObject(com.app.wordpress.realm.table.PostRealm.class);
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("type")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$type(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$type((String) reader.nextString());
                }
            } else if (name.equals("slug")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$slug(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$slug((String) reader.nextString());
                }
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("status")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$status(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$status((String) reader.nextString());
                }
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("title_plain")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$title_plain(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$title_plain((String) reader.nextString());
                }
            } else if (name.equals("content")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$content(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$content((String) reader.nextString());
                }
            } else if (name.equals("excerpt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$excerpt(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$excerpt((String) reader.nextString());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$date(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$date((String) reader.nextString());
                }
            } else if (name.equals("modified")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$modified(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$modified((String) reader.nextString());
                }
            } else if (name.equals("thumbnail")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$thumbnail(null);
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$thumbnail((String) reader.nextString());
                }
            } else if (name.equals("comment_count")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'comment_count' to null.");
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$comment_count((int) reader.nextInt());
                }
            } else if (name.equals("added_date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'added_date' to null.");
                } else {
                    ((PostRealmRealmProxyInterface) obj).realmSet$added_date((long) reader.nextLong());
                }
            } else if (name.equals("categories")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$categories(null);
                } else {
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.app.wordpress.realm.table.CategoryRealm item = CategoryRealmRealmProxy.createUsingJsonStream(realm, reader);
                        ((PostRealmRealmProxyInterface) obj).realmGet$categories().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("author")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$author(null);
                } else {
                    com.app.wordpress.realm.table.AuthorRealm authorObj = AuthorRealmRealmProxy.createUsingJsonStream(realm, reader);
                    ((PostRealmRealmProxyInterface) obj).realmSet$author(authorObj);
                }
            } else if (name.equals("comments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$comments(null);
                } else {
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.app.wordpress.realm.table.CommentRealm item = CommentRealmRealmProxy.createUsingJsonStream(realm, reader);
                        ((PostRealmRealmProxyInterface) obj).realmGet$comments().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("attachments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PostRealmRealmProxyInterface) obj).realmSet$attachments(null);
                } else {
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.app.wordpress.realm.table.AttachmentRealm item = AttachmentRealmRealmProxy.createUsingJsonStream(realm, reader);
                        ((PostRealmRealmProxyInterface) obj).realmGet$attachments().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    public static com.app.wordpress.realm.table.PostRealm copyOrUpdate(Realm realm, com.app.wordpress.realm.table.PostRealm object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.PostRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.PostRealm realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.app.wordpress.realm.table.PostRealm.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    realmObject = new io.realm.PostRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.PostRealm.class));
                    ((RealmObjectProxy)realmObject).realmGet$proxyState().setRealm$realm(realm);
                    ((RealmObjectProxy)realmObject).realmGet$proxyState().setRow$realm(table.getUncheckedRow(rowIndex));
                    cache.put(object, (RealmObjectProxy) realmObject);
                } else {
                    canUpdate = false;
                }
            }

            if (canUpdate) {
                return update(realm, realmObject, object, cache);
            } else {
                return copy(realm, object, update, cache);
            }
        }
    }

    public static com.app.wordpress.realm.table.PostRealm copy(Realm realm, com.app.wordpress.realm.table.PostRealm newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.PostRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.PostRealm realmObject = realm.createObject(com.app.wordpress.realm.table.PostRealm.class, ((PostRealmRealmProxyInterface) newObject).realmGet$id());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((PostRealmRealmProxyInterface) realmObject).realmSet$id(((PostRealmRealmProxyInterface) newObject).realmGet$id());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$type(((PostRealmRealmProxyInterface) newObject).realmGet$type());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$slug(((PostRealmRealmProxyInterface) newObject).realmGet$slug());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$url(((PostRealmRealmProxyInterface) newObject).realmGet$url());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$status(((PostRealmRealmProxyInterface) newObject).realmGet$status());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$title(((PostRealmRealmProxyInterface) newObject).realmGet$title());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$title_plain(((PostRealmRealmProxyInterface) newObject).realmGet$title_plain());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$content(((PostRealmRealmProxyInterface) newObject).realmGet$content());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$excerpt(((PostRealmRealmProxyInterface) newObject).realmGet$excerpt());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$date(((PostRealmRealmProxyInterface) newObject).realmGet$date());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$modified(((PostRealmRealmProxyInterface) newObject).realmGet$modified());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$thumbnail(((PostRealmRealmProxyInterface) newObject).realmGet$thumbnail());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$comment_count(((PostRealmRealmProxyInterface) newObject).realmGet$comment_count());
            ((PostRealmRealmProxyInterface) realmObject).realmSet$added_date(((PostRealmRealmProxyInterface) newObject).realmGet$added_date());

            RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesList = ((PostRealmRealmProxyInterface) newObject).realmGet$categories();
            if (categoriesList != null) {
                RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesRealmList = ((PostRealmRealmProxyInterface) realmObject).realmGet$categories();
                for (int i = 0; i < categoriesList.size(); i++) {
                    com.app.wordpress.realm.table.CategoryRealm categoriesItem = categoriesList.get(i);
                    com.app.wordpress.realm.table.CategoryRealm cachecategories = (com.app.wordpress.realm.table.CategoryRealm) cache.get(categoriesItem);
                    if (cachecategories != null) {
                        categoriesRealmList.add(cachecategories);
                    } else {
                        categoriesRealmList.add(CategoryRealmRealmProxy.copyOrUpdate(realm, categoriesList.get(i), update, cache));
                    }
                }
            }


            com.app.wordpress.realm.table.AuthorRealm authorObj = ((PostRealmRealmProxyInterface) newObject).realmGet$author();
            if (authorObj != null) {
                com.app.wordpress.realm.table.AuthorRealm cacheauthor = (com.app.wordpress.realm.table.AuthorRealm) cache.get(authorObj);
                if (cacheauthor != null) {
                    ((PostRealmRealmProxyInterface) realmObject).realmSet$author(cacheauthor);
                } else {
                    ((PostRealmRealmProxyInterface) realmObject).realmSet$author(AuthorRealmRealmProxy.copyOrUpdate(realm, authorObj, update, cache));
                }
            } else {
                ((PostRealmRealmProxyInterface) realmObject).realmSet$author(null);
            }

            RealmList<com.app.wordpress.realm.table.CommentRealm> commentsList = ((PostRealmRealmProxyInterface) newObject).realmGet$comments();
            if (commentsList != null) {
                RealmList<com.app.wordpress.realm.table.CommentRealm> commentsRealmList = ((PostRealmRealmProxyInterface) realmObject).realmGet$comments();
                for (int i = 0; i < commentsList.size(); i++) {
                    com.app.wordpress.realm.table.CommentRealm commentsItem = commentsList.get(i);
                    com.app.wordpress.realm.table.CommentRealm cachecomments = (com.app.wordpress.realm.table.CommentRealm) cache.get(commentsItem);
                    if (cachecomments != null) {
                        commentsRealmList.add(cachecomments);
                    } else {
                        commentsRealmList.add(CommentRealmRealmProxy.copyOrUpdate(realm, commentsList.get(i), update, cache));
                    }
                }
            }


            RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsList = ((PostRealmRealmProxyInterface) newObject).realmGet$attachments();
            if (attachmentsList != null) {
                RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsRealmList = ((PostRealmRealmProxyInterface) realmObject).realmGet$attachments();
                for (int i = 0; i < attachmentsList.size(); i++) {
                    com.app.wordpress.realm.table.AttachmentRealm attachmentsItem = attachmentsList.get(i);
                    com.app.wordpress.realm.table.AttachmentRealm cacheattachments = (com.app.wordpress.realm.table.AttachmentRealm) cache.get(attachmentsItem);
                    if (cacheattachments != null) {
                        attachmentsRealmList.add(cacheattachments);
                    } else {
                        attachmentsRealmList.add(AttachmentRealmRealmProxy.copyOrUpdate(realm, attachmentsList.get(i), update, cache));
                    }
                }
            }

            return realmObject;
        }
    }

    public static long insert(Realm realm, com.app.wordpress.realm.table.PostRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.PostRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        PostRealmColumnInfo columnInfo = (PostRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.PostRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((PostRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
            }
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$type = ((PostRealmRealmProxyInterface)object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type);
        }
        String realmGet$slug = ((PostRealmRealmProxyInterface)object).realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
        }
        String realmGet$url = ((PostRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        }
        String realmGet$status = ((PostRealmRealmProxyInterface)object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status);
        }
        String realmGet$title = ((PostRealmRealmProxyInterface)object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
        }
        String realmGet$title_plain = ((PostRealmRealmProxyInterface)object).realmGet$title_plain();
        if (realmGet$title_plain != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.title_plainIndex, rowIndex, realmGet$title_plain);
        }
        String realmGet$content = ((PostRealmRealmProxyInterface)object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
        }
        String realmGet$excerpt = ((PostRealmRealmProxyInterface)object).realmGet$excerpt();
        if (realmGet$excerpt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.excerptIndex, rowIndex, realmGet$excerpt);
        }
        String realmGet$date = ((PostRealmRealmProxyInterface)object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
        }
        String realmGet$modified = ((PostRealmRealmProxyInterface)object).realmGet$modified();
        if (realmGet$modified != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modifiedIndex, rowIndex, realmGet$modified);
        }
        String realmGet$thumbnail = ((PostRealmRealmProxyInterface)object).realmGet$thumbnail();
        if (realmGet$thumbnail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.comment_countIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$comment_count());
        Table.nativeSetLong(tableNativePtr, columnInfo.added_dateIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$added_date());

        RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesList = ((PostRealmRealmProxyInterface) object).realmGet$categories();
        if (categoriesList != null) {
            long categoriesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.categoriesIndex, rowIndex);
            for (com.app.wordpress.realm.table.CategoryRealm categoriesItem : categoriesList) {
                Long cacheItemIndexcategories = cache.get(categoriesItem);
                if (cacheItemIndexcategories == null) {
                    cacheItemIndexcategories = CategoryRealmRealmProxy.insert(realm, categoriesItem, cache);
                }
                LinkView.nativeAdd(categoriesNativeLinkViewPtr, cacheItemIndexcategories);
            }
            LinkView.nativeClose(categoriesNativeLinkViewPtr);
        }


        com.app.wordpress.realm.table.AuthorRealm authorObj = ((PostRealmRealmProxyInterface) object).realmGet$author();
        if (authorObj != null) {
            Long cacheauthor = cache.get(authorObj);
            if (cacheauthor == null) {
                cacheauthor = AuthorRealmRealmProxy.insert(realm, authorObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.authorIndex, rowIndex, cacheauthor);
        }

        RealmList<com.app.wordpress.realm.table.CommentRealm> commentsList = ((PostRealmRealmProxyInterface) object).realmGet$comments();
        if (commentsList != null) {
            long commentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.commentsIndex, rowIndex);
            for (com.app.wordpress.realm.table.CommentRealm commentsItem : commentsList) {
                Long cacheItemIndexcomments = cache.get(commentsItem);
                if (cacheItemIndexcomments == null) {
                    cacheItemIndexcomments = CommentRealmRealmProxy.insert(realm, commentsItem, cache);
                }
                LinkView.nativeAdd(commentsNativeLinkViewPtr, cacheItemIndexcomments);
            }
            LinkView.nativeClose(commentsNativeLinkViewPtr);
        }


        RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsList = ((PostRealmRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
            for (com.app.wordpress.realm.table.AttachmentRealm attachmentsItem : attachmentsList) {
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = AttachmentRealmRealmProxy.insert(realm, attachmentsItem, cache);
                }
                LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
            }
            LinkView.nativeClose(attachmentsNativeLinkViewPtr);
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.PostRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        PostRealmColumnInfo columnInfo = (PostRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.PostRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.PostRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.PostRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((PostRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
                    }
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$type = ((PostRealmRealmProxyInterface)object).realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type);
                }
                String realmGet$slug = ((PostRealmRealmProxyInterface)object).realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
                }
                String realmGet$url = ((PostRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                }
                String realmGet$status = ((PostRealmRealmProxyInterface)object).realmGet$status();
                if (realmGet$status != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status);
                }
                String realmGet$title = ((PostRealmRealmProxyInterface)object).realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
                }
                String realmGet$title_plain = ((PostRealmRealmProxyInterface)object).realmGet$title_plain();
                if (realmGet$title_plain != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.title_plainIndex, rowIndex, realmGet$title_plain);
                }
                String realmGet$content = ((PostRealmRealmProxyInterface)object).realmGet$content();
                if (realmGet$content != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
                }
                String realmGet$excerpt = ((PostRealmRealmProxyInterface)object).realmGet$excerpt();
                if (realmGet$excerpt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.excerptIndex, rowIndex, realmGet$excerpt);
                }
                String realmGet$date = ((PostRealmRealmProxyInterface)object).realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
                }
                String realmGet$modified = ((PostRealmRealmProxyInterface)object).realmGet$modified();
                if (realmGet$modified != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.modifiedIndex, rowIndex, realmGet$modified);
                }
                String realmGet$thumbnail = ((PostRealmRealmProxyInterface)object).realmGet$thumbnail();
                if (realmGet$thumbnail != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.comment_countIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$comment_count());
                Table.nativeSetLong(tableNativePtr, columnInfo.added_dateIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$added_date());

                RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesList = ((PostRealmRealmProxyInterface) object).realmGet$categories();
                if (categoriesList != null) {
                    long categoriesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.categoriesIndex, rowIndex);
                    for (com.app.wordpress.realm.table.CategoryRealm categoriesItem : categoriesList) {
                        Long cacheItemIndexcategories = cache.get(categoriesItem);
                        if (cacheItemIndexcategories == null) {
                            cacheItemIndexcategories = CategoryRealmRealmProxy.insert(realm, categoriesItem, cache);
                        }
                        LinkView.nativeAdd(categoriesNativeLinkViewPtr, cacheItemIndexcategories);
                    }
                    LinkView.nativeClose(categoriesNativeLinkViewPtr);
                }


                com.app.wordpress.realm.table.AuthorRealm authorObj = ((PostRealmRealmProxyInterface) object).realmGet$author();
                if (authorObj != null) {
                    Long cacheauthor = cache.get(authorObj);
                    if (cacheauthor == null) {
                        cacheauthor = AuthorRealmRealmProxy.insert(realm, authorObj, cache);
                    }
                    table.setLink(columnInfo.authorIndex, rowIndex, cacheauthor);
                }

                RealmList<com.app.wordpress.realm.table.CommentRealm> commentsList = ((PostRealmRealmProxyInterface) object).realmGet$comments();
                if (commentsList != null) {
                    long commentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.commentsIndex, rowIndex);
                    for (com.app.wordpress.realm.table.CommentRealm commentsItem : commentsList) {
                        Long cacheItemIndexcomments = cache.get(commentsItem);
                        if (cacheItemIndexcomments == null) {
                            cacheItemIndexcomments = CommentRealmRealmProxy.insert(realm, commentsItem, cache);
                        }
                        LinkView.nativeAdd(commentsNativeLinkViewPtr, cacheItemIndexcomments);
                    }
                    LinkView.nativeClose(commentsNativeLinkViewPtr);
                }


                RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsList = ((PostRealmRealmProxyInterface) object).realmGet$attachments();
                if (attachmentsList != null) {
                    long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
                    for (com.app.wordpress.realm.table.AttachmentRealm attachmentsItem : attachmentsList) {
                        Long cacheItemIndexattachments = cache.get(attachmentsItem);
                        if (cacheItemIndexattachments == null) {
                            cacheItemIndexattachments = AttachmentRealmRealmProxy.insert(realm, attachmentsItem, cache);
                        }
                        LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
                    }
                    LinkView.nativeClose(attachmentsNativeLinkViewPtr);
                }

            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.app.wordpress.realm.table.PostRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.PostRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        PostRealmColumnInfo columnInfo = (PostRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.PostRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((PostRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
            }
        }
        cache.put(object, rowIndex);
        String realmGet$type = ((PostRealmRealmProxyInterface)object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex);
        }
        String realmGet$slug = ((PostRealmRealmProxyInterface)object).realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.slugIndex, rowIndex);
        }
        String realmGet$url = ((PostRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
        }
        String realmGet$status = ((PostRealmRealmProxyInterface)object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex);
        }
        String realmGet$title = ((PostRealmRealmProxyInterface)object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex);
        }
        String realmGet$title_plain = ((PostRealmRealmProxyInterface)object).realmGet$title_plain();
        if (realmGet$title_plain != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.title_plainIndex, rowIndex, realmGet$title_plain);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.title_plainIndex, rowIndex);
        }
        String realmGet$content = ((PostRealmRealmProxyInterface)object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex);
        }
        String realmGet$excerpt = ((PostRealmRealmProxyInterface)object).realmGet$excerpt();
        if (realmGet$excerpt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.excerptIndex, rowIndex, realmGet$excerpt);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.excerptIndex, rowIndex);
        }
        String realmGet$date = ((PostRealmRealmProxyInterface)object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex);
        }
        String realmGet$modified = ((PostRealmRealmProxyInterface)object).realmGet$modified();
        if (realmGet$modified != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modifiedIndex, rowIndex, realmGet$modified);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedIndex, rowIndex);
        }
        String realmGet$thumbnail = ((PostRealmRealmProxyInterface)object).realmGet$thumbnail();
        if (realmGet$thumbnail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbnailIndex, rowIndex);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.comment_countIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$comment_count());
        Table.nativeSetLong(tableNativePtr, columnInfo.added_dateIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$added_date());

        long categoriesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.categoriesIndex, rowIndex);
        LinkView.nativeClear(categoriesNativeLinkViewPtr);
        RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesList = ((PostRealmRealmProxyInterface) object).realmGet$categories();
        if (categoriesList != null) {
            for (com.app.wordpress.realm.table.CategoryRealm categoriesItem : categoriesList) {
                Long cacheItemIndexcategories = cache.get(categoriesItem);
                if (cacheItemIndexcategories == null) {
                    cacheItemIndexcategories = CategoryRealmRealmProxy.insertOrUpdate(realm, categoriesItem, cache);
                }
                LinkView.nativeAdd(categoriesNativeLinkViewPtr, cacheItemIndexcategories);
            }
        }
        LinkView.nativeClose(categoriesNativeLinkViewPtr);


        com.app.wordpress.realm.table.AuthorRealm authorObj = ((PostRealmRealmProxyInterface) object).realmGet$author();
        if (authorObj != null) {
            Long cacheauthor = cache.get(authorObj);
            if (cacheauthor == null) {
                cacheauthor = AuthorRealmRealmProxy.insertOrUpdate(realm, authorObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.authorIndex, rowIndex, cacheauthor);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.authorIndex, rowIndex);
        }

        long commentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.commentsIndex, rowIndex);
        LinkView.nativeClear(commentsNativeLinkViewPtr);
        RealmList<com.app.wordpress.realm.table.CommentRealm> commentsList = ((PostRealmRealmProxyInterface) object).realmGet$comments();
        if (commentsList != null) {
            for (com.app.wordpress.realm.table.CommentRealm commentsItem : commentsList) {
                Long cacheItemIndexcomments = cache.get(commentsItem);
                if (cacheItemIndexcomments == null) {
                    cacheItemIndexcomments = CommentRealmRealmProxy.insertOrUpdate(realm, commentsItem, cache);
                }
                LinkView.nativeAdd(commentsNativeLinkViewPtr, cacheItemIndexcomments);
            }
        }
        LinkView.nativeClose(commentsNativeLinkViewPtr);


        long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
        LinkView.nativeClear(attachmentsNativeLinkViewPtr);
        RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsList = ((PostRealmRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            for (com.app.wordpress.realm.table.AttachmentRealm attachmentsItem : attachmentsList) {
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = AttachmentRealmRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                }
                LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
            }
        }
        LinkView.nativeClose(attachmentsNativeLinkViewPtr);

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.PostRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        PostRealmColumnInfo columnInfo = (PostRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.PostRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.PostRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.PostRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((PostRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((PostRealmRealmProxyInterface) object).realmGet$id());
                    }
                }
                cache.put(object, rowIndex);
                String realmGet$type = ((PostRealmRealmProxyInterface)object).realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex);
                }
                String realmGet$slug = ((PostRealmRealmProxyInterface)object).realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.slugIndex, rowIndex);
                }
                String realmGet$url = ((PostRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
                }
                String realmGet$status = ((PostRealmRealmProxyInterface)object).realmGet$status();
                if (realmGet$status != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex);
                }
                String realmGet$title = ((PostRealmRealmProxyInterface)object).realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex);
                }
                String realmGet$title_plain = ((PostRealmRealmProxyInterface)object).realmGet$title_plain();
                if (realmGet$title_plain != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.title_plainIndex, rowIndex, realmGet$title_plain);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.title_plainIndex, rowIndex);
                }
                String realmGet$content = ((PostRealmRealmProxyInterface)object).realmGet$content();
                if (realmGet$content != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex);
                }
                String realmGet$excerpt = ((PostRealmRealmProxyInterface)object).realmGet$excerpt();
                if (realmGet$excerpt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.excerptIndex, rowIndex, realmGet$excerpt);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.excerptIndex, rowIndex);
                }
                String realmGet$date = ((PostRealmRealmProxyInterface)object).realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex);
                }
                String realmGet$modified = ((PostRealmRealmProxyInterface)object).realmGet$modified();
                if (realmGet$modified != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.modifiedIndex, rowIndex, realmGet$modified);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.modifiedIndex, rowIndex);
                }
                String realmGet$thumbnail = ((PostRealmRealmProxyInterface)object).realmGet$thumbnail();
                if (realmGet$thumbnail != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.thumbnailIndex, rowIndex);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.comment_countIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$comment_count());
                Table.nativeSetLong(tableNativePtr, columnInfo.added_dateIndex, rowIndex, ((PostRealmRealmProxyInterface)object).realmGet$added_date());

                long categoriesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.categoriesIndex, rowIndex);
                LinkView.nativeClear(categoriesNativeLinkViewPtr);
                RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesList = ((PostRealmRealmProxyInterface) object).realmGet$categories();
                if (categoriesList != null) {
                    for (com.app.wordpress.realm.table.CategoryRealm categoriesItem : categoriesList) {
                        Long cacheItemIndexcategories = cache.get(categoriesItem);
                        if (cacheItemIndexcategories == null) {
                            cacheItemIndexcategories = CategoryRealmRealmProxy.insertOrUpdate(realm, categoriesItem, cache);
                        }
                        LinkView.nativeAdd(categoriesNativeLinkViewPtr, cacheItemIndexcategories);
                    }
                }
                LinkView.nativeClose(categoriesNativeLinkViewPtr);


                com.app.wordpress.realm.table.AuthorRealm authorObj = ((PostRealmRealmProxyInterface) object).realmGet$author();
                if (authorObj != null) {
                    Long cacheauthor = cache.get(authorObj);
                    if (cacheauthor == null) {
                        cacheauthor = AuthorRealmRealmProxy.insertOrUpdate(realm, authorObj, cache);
                    }
                    Table.nativeSetLink(tableNativePtr, columnInfo.authorIndex, rowIndex, cacheauthor);
                } else {
                    Table.nativeNullifyLink(tableNativePtr, columnInfo.authorIndex, rowIndex);
                }

                long commentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.commentsIndex, rowIndex);
                LinkView.nativeClear(commentsNativeLinkViewPtr);
                RealmList<com.app.wordpress.realm.table.CommentRealm> commentsList = ((PostRealmRealmProxyInterface) object).realmGet$comments();
                if (commentsList != null) {
                    for (com.app.wordpress.realm.table.CommentRealm commentsItem : commentsList) {
                        Long cacheItemIndexcomments = cache.get(commentsItem);
                        if (cacheItemIndexcomments == null) {
                            cacheItemIndexcomments = CommentRealmRealmProxy.insertOrUpdate(realm, commentsItem, cache);
                        }
                        LinkView.nativeAdd(commentsNativeLinkViewPtr, cacheItemIndexcomments);
                    }
                }
                LinkView.nativeClose(commentsNativeLinkViewPtr);


                long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
                LinkView.nativeClear(attachmentsNativeLinkViewPtr);
                RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsList = ((PostRealmRealmProxyInterface) object).realmGet$attachments();
                if (attachmentsList != null) {
                    for (com.app.wordpress.realm.table.AttachmentRealm attachmentsItem : attachmentsList) {
                        Long cacheItemIndexattachments = cache.get(attachmentsItem);
                        if (cacheItemIndexattachments == null) {
                            cacheItemIndexattachments = AttachmentRealmRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                        }
                        LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
                    }
                }
                LinkView.nativeClose(attachmentsNativeLinkViewPtr);

            }
        }
    }

    public static com.app.wordpress.realm.table.PostRealm createDetachedCopy(com.app.wordpress.realm.table.PostRealm realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.app.wordpress.realm.table.PostRealm unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.app.wordpress.realm.table.PostRealm)cachedObject.object;
            } else {
                unmanagedObject = (com.app.wordpress.realm.table.PostRealm)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.app.wordpress.realm.table.PostRealm();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$id(((PostRealmRealmProxyInterface) realmObject).realmGet$id());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$type(((PostRealmRealmProxyInterface) realmObject).realmGet$type());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$slug(((PostRealmRealmProxyInterface) realmObject).realmGet$slug());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$url(((PostRealmRealmProxyInterface) realmObject).realmGet$url());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$status(((PostRealmRealmProxyInterface) realmObject).realmGet$status());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$title(((PostRealmRealmProxyInterface) realmObject).realmGet$title());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$title_plain(((PostRealmRealmProxyInterface) realmObject).realmGet$title_plain());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$content(((PostRealmRealmProxyInterface) realmObject).realmGet$content());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$excerpt(((PostRealmRealmProxyInterface) realmObject).realmGet$excerpt());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$date(((PostRealmRealmProxyInterface) realmObject).realmGet$date());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$modified(((PostRealmRealmProxyInterface) realmObject).realmGet$modified());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$thumbnail(((PostRealmRealmProxyInterface) realmObject).realmGet$thumbnail());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$comment_count(((PostRealmRealmProxyInterface) realmObject).realmGet$comment_count());
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$added_date(((PostRealmRealmProxyInterface) realmObject).realmGet$added_date());

        // Deep copy of categories
        if (currentDepth == maxDepth) {
            ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$categories(null);
        } else {
            RealmList<com.app.wordpress.realm.table.CategoryRealm> managedcategoriesList = ((PostRealmRealmProxyInterface) realmObject).realmGet$categories();
            RealmList<com.app.wordpress.realm.table.CategoryRealm> unmanagedcategoriesList = new RealmList<com.app.wordpress.realm.table.CategoryRealm>();
            ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$categories(unmanagedcategoriesList);
            int nextDepth = currentDepth + 1;
            int size = managedcategoriesList.size();
            for (int i = 0; i < size; i++) {
                com.app.wordpress.realm.table.CategoryRealm item = CategoryRealmRealmProxy.createDetachedCopy(managedcategoriesList.get(i), nextDepth, maxDepth, cache);
                unmanagedcategoriesList.add(item);
            }
        }

        // Deep copy of author
        ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$author(AuthorRealmRealmProxy.createDetachedCopy(((PostRealmRealmProxyInterface) realmObject).realmGet$author(), currentDepth + 1, maxDepth, cache));

        // Deep copy of comments
        if (currentDepth == maxDepth) {
            ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$comments(null);
        } else {
            RealmList<com.app.wordpress.realm.table.CommentRealm> managedcommentsList = ((PostRealmRealmProxyInterface) realmObject).realmGet$comments();
            RealmList<com.app.wordpress.realm.table.CommentRealm> unmanagedcommentsList = new RealmList<com.app.wordpress.realm.table.CommentRealm>();
            ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$comments(unmanagedcommentsList);
            int nextDepth = currentDepth + 1;
            int size = managedcommentsList.size();
            for (int i = 0; i < size; i++) {
                com.app.wordpress.realm.table.CommentRealm item = CommentRealmRealmProxy.createDetachedCopy(managedcommentsList.get(i), nextDepth, maxDepth, cache);
                unmanagedcommentsList.add(item);
            }
        }

        // Deep copy of attachments
        if (currentDepth == maxDepth) {
            ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$attachments(null);
        } else {
            RealmList<com.app.wordpress.realm.table.AttachmentRealm> managedattachmentsList = ((PostRealmRealmProxyInterface) realmObject).realmGet$attachments();
            RealmList<com.app.wordpress.realm.table.AttachmentRealm> unmanagedattachmentsList = new RealmList<com.app.wordpress.realm.table.AttachmentRealm>();
            ((PostRealmRealmProxyInterface) unmanagedObject).realmSet$attachments(unmanagedattachmentsList);
            int nextDepth = currentDepth + 1;
            int size = managedattachmentsList.size();
            for (int i = 0; i < size; i++) {
                com.app.wordpress.realm.table.AttachmentRealm item = AttachmentRealmRealmProxy.createDetachedCopy(managedattachmentsList.get(i), nextDepth, maxDepth, cache);
                unmanagedattachmentsList.add(item);
            }
        }
        return unmanagedObject;
    }

    static com.app.wordpress.realm.table.PostRealm update(Realm realm, com.app.wordpress.realm.table.PostRealm realmObject, com.app.wordpress.realm.table.PostRealm newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((PostRealmRealmProxyInterface) realmObject).realmSet$type(((PostRealmRealmProxyInterface) newObject).realmGet$type());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$slug(((PostRealmRealmProxyInterface) newObject).realmGet$slug());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$url(((PostRealmRealmProxyInterface) newObject).realmGet$url());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$status(((PostRealmRealmProxyInterface) newObject).realmGet$status());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$title(((PostRealmRealmProxyInterface) newObject).realmGet$title());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$title_plain(((PostRealmRealmProxyInterface) newObject).realmGet$title_plain());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$content(((PostRealmRealmProxyInterface) newObject).realmGet$content());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$excerpt(((PostRealmRealmProxyInterface) newObject).realmGet$excerpt());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$date(((PostRealmRealmProxyInterface) newObject).realmGet$date());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$modified(((PostRealmRealmProxyInterface) newObject).realmGet$modified());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$thumbnail(((PostRealmRealmProxyInterface) newObject).realmGet$thumbnail());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$comment_count(((PostRealmRealmProxyInterface) newObject).realmGet$comment_count());
        ((PostRealmRealmProxyInterface) realmObject).realmSet$added_date(((PostRealmRealmProxyInterface) newObject).realmGet$added_date());
        RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesList = ((PostRealmRealmProxyInterface) newObject).realmGet$categories();
        RealmList<com.app.wordpress.realm.table.CategoryRealm> categoriesRealmList = ((PostRealmRealmProxyInterface) realmObject).realmGet$categories();
        categoriesRealmList.clear();
        if (categoriesList != null) {
            for (int i = 0; i < categoriesList.size(); i++) {
                com.app.wordpress.realm.table.CategoryRealm categoriesItem = categoriesList.get(i);
                com.app.wordpress.realm.table.CategoryRealm cachecategories = (com.app.wordpress.realm.table.CategoryRealm) cache.get(categoriesItem);
                if (cachecategories != null) {
                    categoriesRealmList.add(cachecategories);
                } else {
                    categoriesRealmList.add(CategoryRealmRealmProxy.copyOrUpdate(realm, categoriesList.get(i), true, cache));
                }
            }
        }
        com.app.wordpress.realm.table.AuthorRealm authorObj = ((PostRealmRealmProxyInterface) newObject).realmGet$author();
        if (authorObj != null) {
            com.app.wordpress.realm.table.AuthorRealm cacheauthor = (com.app.wordpress.realm.table.AuthorRealm) cache.get(authorObj);
            if (cacheauthor != null) {
                ((PostRealmRealmProxyInterface) realmObject).realmSet$author(cacheauthor);
            } else {
                ((PostRealmRealmProxyInterface) realmObject).realmSet$author(AuthorRealmRealmProxy.copyOrUpdate(realm, authorObj, true, cache));
            }
        } else {
            ((PostRealmRealmProxyInterface) realmObject).realmSet$author(null);
        }
        RealmList<com.app.wordpress.realm.table.CommentRealm> commentsList = ((PostRealmRealmProxyInterface) newObject).realmGet$comments();
        RealmList<com.app.wordpress.realm.table.CommentRealm> commentsRealmList = ((PostRealmRealmProxyInterface) realmObject).realmGet$comments();
        commentsRealmList.clear();
        if (commentsList != null) {
            for (int i = 0; i < commentsList.size(); i++) {
                com.app.wordpress.realm.table.CommentRealm commentsItem = commentsList.get(i);
                com.app.wordpress.realm.table.CommentRealm cachecomments = (com.app.wordpress.realm.table.CommentRealm) cache.get(commentsItem);
                if (cachecomments != null) {
                    commentsRealmList.add(cachecomments);
                } else {
                    commentsRealmList.add(CommentRealmRealmProxy.copyOrUpdate(realm, commentsList.get(i), true, cache));
                }
            }
        }
        RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsList = ((PostRealmRealmProxyInterface) newObject).realmGet$attachments();
        RealmList<com.app.wordpress.realm.table.AttachmentRealm> attachmentsRealmList = ((PostRealmRealmProxyInterface) realmObject).realmGet$attachments();
        attachmentsRealmList.clear();
        if (attachmentsList != null) {
            for (int i = 0; i < attachmentsList.size(); i++) {
                com.app.wordpress.realm.table.AttachmentRealm attachmentsItem = attachmentsList.get(i);
                com.app.wordpress.realm.table.AttachmentRealm cacheattachments = (com.app.wordpress.realm.table.AttachmentRealm) cache.get(attachmentsItem);
                if (cacheattachments != null) {
                    attachmentsRealmList.add(cacheattachments);
                } else {
                    attachmentsRealmList.add(AttachmentRealmRealmProxy.copyOrUpdate(realm, attachmentsList.get(i), true, cache));
                }
            }
        }
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PostRealm = [");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{slug:");
        stringBuilder.append(realmGet$slug() != null ? realmGet$slug() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title_plain:");
        stringBuilder.append(realmGet$title_plain() != null ? realmGet$title_plain() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{content:");
        stringBuilder.append(realmGet$content() != null ? realmGet$content() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{excerpt:");
        stringBuilder.append(realmGet$excerpt() != null ? realmGet$excerpt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modified:");
        stringBuilder.append(realmGet$modified() != null ? realmGet$modified() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thumbnail:");
        stringBuilder.append(realmGet$thumbnail() != null ? realmGet$thumbnail() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{comment_count:");
        stringBuilder.append(realmGet$comment_count());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{added_date:");
        stringBuilder.append(realmGet$added_date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{categories:");
        stringBuilder.append("RealmList<CategoryRealm>[").append(realmGet$categories().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{author:");
        stringBuilder.append(realmGet$author() != null ? "AuthorRealm" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{comments:");
        stringBuilder.append("RealmList<CommentRealm>[").append(realmGet$comments().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachments:");
        stringBuilder.append("RealmList<AttachmentRealm>[").append(realmGet$attachments().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostRealmRealmProxy aPostRealm = (PostRealmRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPostRealm.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPostRealm.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPostRealm.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
