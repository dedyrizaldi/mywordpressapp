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

public class CategoryRealmRealmProxy extends com.app.wordpress.realm.table.CategoryRealm
    implements RealmObjectProxy, CategoryRealmRealmProxyInterface {

    static final class CategoryRealmColumnInfo extends ColumnInfo {

        public final long idIndex;
        public final long slugIndex;
        public final long titleIndex;
        public final long descriptionIndex;
        public final long thumbnailIndex;
        public final long parentIndex;
        public final long post_countIndex;

        CategoryRealmColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(7);
            this.idIndex = getValidColumnIndex(path, table, "CategoryRealm", "id");
            indicesMap.put("id", this.idIndex);

            this.slugIndex = getValidColumnIndex(path, table, "CategoryRealm", "slug");
            indicesMap.put("slug", this.slugIndex);

            this.titleIndex = getValidColumnIndex(path, table, "CategoryRealm", "title");
            indicesMap.put("title", this.titleIndex);

            this.descriptionIndex = getValidColumnIndex(path, table, "CategoryRealm", "description");
            indicesMap.put("description", this.descriptionIndex);

            this.thumbnailIndex = getValidColumnIndex(path, table, "CategoryRealm", "thumbnail");
            indicesMap.put("thumbnail", this.thumbnailIndex);

            this.parentIndex = getValidColumnIndex(path, table, "CategoryRealm", "parent");
            indicesMap.put("parent", this.parentIndex);

            this.post_countIndex = getValidColumnIndex(path, table, "CategoryRealm", "post_count");
            indicesMap.put("post_count", this.post_countIndex);

            setIndicesMap(indicesMap);
        }
    }

    private final CategoryRealmColumnInfo columnInfo;
    private final ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("slug");
        fieldNames.add("title");
        fieldNames.add("description");
        fieldNames.add("thumbnail");
        fieldNames.add("parent");
        fieldNames.add("post_count");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    CategoryRealmRealmProxy(ColumnInfo columnInfo) {
        this.columnInfo = (CategoryRealmColumnInfo) columnInfo;
        this.proxyState = new ProxyState(com.app.wordpress.realm.table.CategoryRealm.class, this);
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
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionIndex);
    }

    public void realmSet$description(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionIndex, value);
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
    public int realmGet$parent() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.parentIndex);
    }

    public void realmSet$parent(int value) {
        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.parentIndex, value);
    }

    @SuppressWarnings("cast")
    public int realmGet$post_count() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.post_countIndex);
    }

    public void realmSet$post_count(int value) {
        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.post_countIndex, value);
    }

    public static Table initTable(ImplicitTransaction transaction) {
        if (!transaction.hasTable("class_CategoryRealm")) {
            Table table = transaction.getTable("class_CategoryRealm");
            table.addColumn(RealmFieldType.INTEGER, "id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "slug", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "title", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "description", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "thumbnail", Table.NULLABLE);
            table.addColumn(RealmFieldType.INTEGER, "parent", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.INTEGER, "post_count", Table.NOT_NULLABLE);
            table.addSearchIndex(table.getColumnIndex("id"));
            table.setPrimaryKey("id");
            return table;
        }
        return transaction.getTable("class_CategoryRealm");
    }

    public static CategoryRealmColumnInfo validateTable(ImplicitTransaction transaction) {
        if (transaction.hasTable("class_CategoryRealm")) {
            Table table = transaction.getTable("class_CategoryRealm");
            if (table.getColumnCount() != 7) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field count does not match - expected 7 but was " + table.getColumnCount());
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < 7; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final CategoryRealmColumnInfo columnInfo = new CategoryRealmColumnInfo(transaction.getPath(), table);

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
            if (!columnTypes.containsKey("slug")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'slug' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("slug") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'slug' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.slugIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'slug' is required. Either set @Required to field 'slug' or migrate using RealmObjectSchema.setNullable().");
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
            if (!columnTypes.containsKey("description")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'description' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("description") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'description' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.descriptionIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'description' is required. Either set @Required to field 'description' or migrate using RealmObjectSchema.setNullable().");
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
            if (!columnTypes.containsKey("parent")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'parent' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("parent") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'parent' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.parentIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'parent' does support null values in the existing Realm file. Use corresponding boxed type for field 'parent' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("post_count")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'post_count' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("post_count") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'post_count' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.post_countIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'post_count' does support null values in the existing Realm file. Use corresponding boxed type for field 'post_count' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(transaction.getPath(), "The 'CategoryRealm' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_CategoryRealm";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.CategoryRealm createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        com.app.wordpress.realm.table.CategoryRealm obj = null;
        if (update) {
            Table table = realm.getTable(com.app.wordpress.realm.table.CategoryRealm.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                obj = new io.realm.CategoryRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.CategoryRealm.class));
                ((RealmObjectProxy)obj).realmGet$proxyState().setRealm$realm(realm);
                ((RealmObjectProxy)obj).realmGet$proxyState().setRow$realm(table.getUncheckedRow(rowIndex));
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.CategoryRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.CategoryRealm.class, null);
                } else {
                    obj = (io.realm.CategoryRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.CategoryRealm.class, json.getInt("id"));
                }
            } else {
                obj = (io.realm.CategoryRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.CategoryRealm.class);
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("slug")) {
            if (json.isNull("slug")) {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$slug(null);
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$slug((String) json.getString("slug"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$description(null);
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("thumbnail")) {
            if (json.isNull("thumbnail")) {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$thumbnail(null);
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$thumbnail((String) json.getString("thumbnail"));
            }
        }
        if (json.has("parent")) {
            if (json.isNull("parent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'parent' to null.");
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$parent((int) json.getInt("parent"));
            }
        }
        if (json.has("post_count")) {
            if (json.isNull("post_count")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'post_count' to null.");
            } else {
                ((CategoryRealmRealmProxyInterface) obj).realmSet$post_count((int) json.getInt("post_count"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.CategoryRealm createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.app.wordpress.realm.table.CategoryRealm obj = realm.createObject(com.app.wordpress.realm.table.CategoryRealm.class);
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("slug")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$slug(null);
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$slug((String) reader.nextString());
                }
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("description")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$description(null);
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$description((String) reader.nextString());
                }
            } else if (name.equals("thumbnail")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$thumbnail(null);
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$thumbnail((String) reader.nextString());
                }
            } else if (name.equals("parent")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'parent' to null.");
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$parent((int) reader.nextInt());
                }
            } else if (name.equals("post_count")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'post_count' to null.");
                } else {
                    ((CategoryRealmRealmProxyInterface) obj).realmSet$post_count((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    public static com.app.wordpress.realm.table.CategoryRealm copyOrUpdate(Realm realm, com.app.wordpress.realm.table.CategoryRealm object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.CategoryRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.CategoryRealm realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.app.wordpress.realm.table.CategoryRealm.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    realmObject = new io.realm.CategoryRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.CategoryRealm.class));
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

    public static com.app.wordpress.realm.table.CategoryRealm copy(Realm realm, com.app.wordpress.realm.table.CategoryRealm newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.CategoryRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.CategoryRealm realmObject = realm.createObject(com.app.wordpress.realm.table.CategoryRealm.class, ((CategoryRealmRealmProxyInterface) newObject).realmGet$id());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$id(((CategoryRealmRealmProxyInterface) newObject).realmGet$id());
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$slug(((CategoryRealmRealmProxyInterface) newObject).realmGet$slug());
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$title(((CategoryRealmRealmProxyInterface) newObject).realmGet$title());
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$description(((CategoryRealmRealmProxyInterface) newObject).realmGet$description());
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$thumbnail(((CategoryRealmRealmProxyInterface) newObject).realmGet$thumbnail());
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$parent(((CategoryRealmRealmProxyInterface) newObject).realmGet$parent());
            ((CategoryRealmRealmProxyInterface) realmObject).realmSet$post_count(((CategoryRealmRealmProxyInterface) newObject).realmGet$post_count());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.app.wordpress.realm.table.CategoryRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CategoryRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CategoryRealmColumnInfo columnInfo = (CategoryRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CategoryRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((CategoryRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
            }
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$slug = ((CategoryRealmRealmProxyInterface)object).realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
        }
        String realmGet$title = ((CategoryRealmRealmProxyInterface)object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
        }
        String realmGet$description = ((CategoryRealmRealmProxyInterface)object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
        }
        String realmGet$thumbnail = ((CategoryRealmRealmProxyInterface)object).realmGet$thumbnail();
        if (realmGet$thumbnail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$parent());
        Table.nativeSetLong(tableNativePtr, columnInfo.post_countIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$post_count());
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CategoryRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CategoryRealmColumnInfo columnInfo = (CategoryRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CategoryRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.CategoryRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.CategoryRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((CategoryRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
                    }
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$slug = ((CategoryRealmRealmProxyInterface)object).realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
                }
                String realmGet$title = ((CategoryRealmRealmProxyInterface)object).realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
                }
                String realmGet$description = ((CategoryRealmRealmProxyInterface)object).realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
                }
                String realmGet$thumbnail = ((CategoryRealmRealmProxyInterface)object).realmGet$thumbnail();
                if (realmGet$thumbnail != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$parent());
                Table.nativeSetLong(tableNativePtr, columnInfo.post_countIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$post_count());
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.app.wordpress.realm.table.CategoryRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CategoryRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CategoryRealmColumnInfo columnInfo = (CategoryRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CategoryRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((CategoryRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
            }
        }
        cache.put(object, rowIndex);
        String realmGet$slug = ((CategoryRealmRealmProxyInterface)object).realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.slugIndex, rowIndex);
        }
        String realmGet$title = ((CategoryRealmRealmProxyInterface)object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex);
        }
        String realmGet$description = ((CategoryRealmRealmProxyInterface)object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex);
        }
        String realmGet$thumbnail = ((CategoryRealmRealmProxyInterface)object).realmGet$thumbnail();
        if (realmGet$thumbnail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbnailIndex, rowIndex);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$parent());
        Table.nativeSetLong(tableNativePtr, columnInfo.post_countIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$post_count());
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CategoryRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CategoryRealmColumnInfo columnInfo = (CategoryRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CategoryRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.CategoryRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.CategoryRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((CategoryRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CategoryRealmRealmProxyInterface) object).realmGet$id());
                    }
                }
                cache.put(object, rowIndex);
                String realmGet$slug = ((CategoryRealmRealmProxyInterface)object).realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.slugIndex, rowIndex);
                }
                String realmGet$title = ((CategoryRealmRealmProxyInterface)object).realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex);
                }
                String realmGet$description = ((CategoryRealmRealmProxyInterface)object).realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex);
                }
                String realmGet$thumbnail = ((CategoryRealmRealmProxyInterface)object).realmGet$thumbnail();
                if (realmGet$thumbnail != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.thumbnailIndex, rowIndex, realmGet$thumbnail);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.thumbnailIndex, rowIndex);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$parent());
                Table.nativeSetLong(tableNativePtr, columnInfo.post_countIndex, rowIndex, ((CategoryRealmRealmProxyInterface)object).realmGet$post_count());
            }
        }
    }

    public static com.app.wordpress.realm.table.CategoryRealm createDetachedCopy(com.app.wordpress.realm.table.CategoryRealm realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.app.wordpress.realm.table.CategoryRealm unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.app.wordpress.realm.table.CategoryRealm)cachedObject.object;
            } else {
                unmanagedObject = (com.app.wordpress.realm.table.CategoryRealm)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.app.wordpress.realm.table.CategoryRealm();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$id(((CategoryRealmRealmProxyInterface) realmObject).realmGet$id());
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$slug(((CategoryRealmRealmProxyInterface) realmObject).realmGet$slug());
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$title(((CategoryRealmRealmProxyInterface) realmObject).realmGet$title());
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$description(((CategoryRealmRealmProxyInterface) realmObject).realmGet$description());
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$thumbnail(((CategoryRealmRealmProxyInterface) realmObject).realmGet$thumbnail());
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$parent(((CategoryRealmRealmProxyInterface) realmObject).realmGet$parent());
        ((CategoryRealmRealmProxyInterface) unmanagedObject).realmSet$post_count(((CategoryRealmRealmProxyInterface) realmObject).realmGet$post_count());
        return unmanagedObject;
    }

    static com.app.wordpress.realm.table.CategoryRealm update(Realm realm, com.app.wordpress.realm.table.CategoryRealm realmObject, com.app.wordpress.realm.table.CategoryRealm newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((CategoryRealmRealmProxyInterface) realmObject).realmSet$slug(((CategoryRealmRealmProxyInterface) newObject).realmGet$slug());
        ((CategoryRealmRealmProxyInterface) realmObject).realmSet$title(((CategoryRealmRealmProxyInterface) newObject).realmGet$title());
        ((CategoryRealmRealmProxyInterface) realmObject).realmSet$description(((CategoryRealmRealmProxyInterface) newObject).realmGet$description());
        ((CategoryRealmRealmProxyInterface) realmObject).realmSet$thumbnail(((CategoryRealmRealmProxyInterface) newObject).realmGet$thumbnail());
        ((CategoryRealmRealmProxyInterface) realmObject).realmSet$parent(((CategoryRealmRealmProxyInterface) newObject).realmGet$parent());
        ((CategoryRealmRealmProxyInterface) realmObject).realmSet$post_count(((CategoryRealmRealmProxyInterface) newObject).realmGet$post_count());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CategoryRealm = [");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{slug:");
        stringBuilder.append(realmGet$slug() != null ? realmGet$slug() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thumbnail:");
        stringBuilder.append(realmGet$thumbnail() != null ? realmGet$thumbnail() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parent:");
        stringBuilder.append(realmGet$parent());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{post_count:");
        stringBuilder.append(realmGet$post_count());
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
        CategoryRealmRealmProxy aCategoryRealm = (CategoryRealmRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCategoryRealm.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCategoryRealm.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCategoryRealm.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
