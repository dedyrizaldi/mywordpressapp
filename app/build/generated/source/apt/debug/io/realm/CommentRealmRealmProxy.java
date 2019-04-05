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

public class CommentRealmRealmProxy extends com.app.wordpress.realm.table.CommentRealm
    implements RealmObjectProxy, CommentRealmRealmProxyInterface {

    static final class CommentRealmColumnInfo extends ColumnInfo {

        public final long idIndex;
        public final long nameIndex;
        public final long urlIndex;
        public final long dateIndex;
        public final long contentIndex;
        public final long parentIndex;

        CommentRealmColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(6);
            this.idIndex = getValidColumnIndex(path, table, "CommentRealm", "id");
            indicesMap.put("id", this.idIndex);

            this.nameIndex = getValidColumnIndex(path, table, "CommentRealm", "name");
            indicesMap.put("name", this.nameIndex);

            this.urlIndex = getValidColumnIndex(path, table, "CommentRealm", "url");
            indicesMap.put("url", this.urlIndex);

            this.dateIndex = getValidColumnIndex(path, table, "CommentRealm", "date");
            indicesMap.put("date", this.dateIndex);

            this.contentIndex = getValidColumnIndex(path, table, "CommentRealm", "content");
            indicesMap.put("content", this.contentIndex);

            this.parentIndex = getValidColumnIndex(path, table, "CommentRealm", "parent");
            indicesMap.put("parent", this.parentIndex);

            setIndicesMap(indicesMap);
        }
    }

    private final CommentRealmColumnInfo columnInfo;
    private final ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("name");
        fieldNames.add("url");
        fieldNames.add("date");
        fieldNames.add("content");
        fieldNames.add("parent");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    CommentRealmRealmProxy(ColumnInfo columnInfo) {
        this.columnInfo = (CommentRealmColumnInfo) columnInfo;
        this.proxyState = new ProxyState(com.app.wordpress.realm.table.CommentRealm.class, this);
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
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    public void realmSet$name(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
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
    public int realmGet$parent() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.parentIndex);
    }

    public void realmSet$parent(int value) {
        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.parentIndex, value);
    }

    public static Table initTable(ImplicitTransaction transaction) {
        if (!transaction.hasTable("class_CommentRealm")) {
            Table table = transaction.getTable("class_CommentRealm");
            table.addColumn(RealmFieldType.INTEGER, "id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "name", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "url", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "date", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "content", Table.NULLABLE);
            table.addColumn(RealmFieldType.INTEGER, "parent", Table.NOT_NULLABLE);
            table.addSearchIndex(table.getColumnIndex("id"));
            table.setPrimaryKey("id");
            return table;
        }
        return transaction.getTable("class_CommentRealm");
    }

    public static CommentRealmColumnInfo validateTable(ImplicitTransaction transaction) {
        if (transaction.hasTable("class_CommentRealm")) {
            Table table = transaction.getTable("class_CommentRealm");
            if (table.getColumnCount() != 6) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field count does not match - expected 6 but was " + table.getColumnCount());
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < 6; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final CommentRealmColumnInfo columnInfo = new CommentRealmColumnInfo(transaction.getPath(), table);

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
            if (!columnTypes.containsKey("name")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("name") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'name' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.nameIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'name' is required. Either set @Required to field 'name' or migrate using RealmObjectSchema.setNullable().");
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
            if (!columnTypes.containsKey("date")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("date") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'date' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.dateIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'date' is required. Either set @Required to field 'date' or migrate using RealmObjectSchema.setNullable().");
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
            if (!columnTypes.containsKey("parent")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'parent' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("parent") != RealmFieldType.INTEGER) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'int' for field 'parent' in existing Realm file.");
            }
            if (table.isColumnNullable(columnInfo.parentIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'parent' does support null values in the existing Realm file. Use corresponding boxed type for field 'parent' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(transaction.getPath(), "The 'CommentRealm' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_CommentRealm";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.CommentRealm createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        com.app.wordpress.realm.table.CommentRealm obj = null;
        if (update) {
            Table table = realm.getTable(com.app.wordpress.realm.table.CommentRealm.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                obj = new io.realm.CommentRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.CommentRealm.class));
                ((RealmObjectProxy)obj).realmGet$proxyState().setRealm$realm(realm);
                ((RealmObjectProxy)obj).realmGet$proxyState().setRow$realm(table.getUncheckedRow(rowIndex));
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.CommentRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.CommentRealm.class, null);
                } else {
                    obj = (io.realm.CommentRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.CommentRealm.class, json.getInt("id"));
                }
            } else {
                obj = (io.realm.CommentRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.CommentRealm.class);
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((CommentRealmRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                ((CommentRealmRealmProxyInterface) obj).realmSet$name(null);
            } else {
                ((CommentRealmRealmProxyInterface) obj).realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((CommentRealmRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((CommentRealmRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                ((CommentRealmRealmProxyInterface) obj).realmSet$date(null);
            } else {
                ((CommentRealmRealmProxyInterface) obj).realmSet$date((String) json.getString("date"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                ((CommentRealmRealmProxyInterface) obj).realmSet$content(null);
            } else {
                ((CommentRealmRealmProxyInterface) obj).realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("parent")) {
            if (json.isNull("parent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'parent' to null.");
            } else {
                ((CommentRealmRealmProxyInterface) obj).realmSet$parent((int) json.getInt("parent"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.CommentRealm createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.app.wordpress.realm.table.CommentRealm obj = realm.createObject(com.app.wordpress.realm.table.CommentRealm.class);
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((CommentRealmRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentRealmRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((CommentRealmRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentRealmRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((CommentRealmRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentRealmRealmProxyInterface) obj).realmSet$date(null);
                } else {
                    ((CommentRealmRealmProxyInterface) obj).realmSet$date((String) reader.nextString());
                }
            } else if (name.equals("content")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentRealmRealmProxyInterface) obj).realmSet$content(null);
                } else {
                    ((CommentRealmRealmProxyInterface) obj).realmSet$content((String) reader.nextString());
                }
            } else if (name.equals("parent")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'parent' to null.");
                } else {
                    ((CommentRealmRealmProxyInterface) obj).realmSet$parent((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    public static com.app.wordpress.realm.table.CommentRealm copyOrUpdate(Realm realm, com.app.wordpress.realm.table.CommentRealm object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.CommentRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.CommentRealm realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.app.wordpress.realm.table.CommentRealm.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    realmObject = new io.realm.CommentRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.CommentRealm.class));
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

    public static com.app.wordpress.realm.table.CommentRealm copy(Realm realm, com.app.wordpress.realm.table.CommentRealm newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.CommentRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.CommentRealm realmObject = realm.createObject(com.app.wordpress.realm.table.CommentRealm.class, ((CommentRealmRealmProxyInterface) newObject).realmGet$id());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((CommentRealmRealmProxyInterface) realmObject).realmSet$id(((CommentRealmRealmProxyInterface) newObject).realmGet$id());
            ((CommentRealmRealmProxyInterface) realmObject).realmSet$name(((CommentRealmRealmProxyInterface) newObject).realmGet$name());
            ((CommentRealmRealmProxyInterface) realmObject).realmSet$url(((CommentRealmRealmProxyInterface) newObject).realmGet$url());
            ((CommentRealmRealmProxyInterface) realmObject).realmSet$date(((CommentRealmRealmProxyInterface) newObject).realmGet$date());
            ((CommentRealmRealmProxyInterface) realmObject).realmSet$content(((CommentRealmRealmProxyInterface) newObject).realmGet$content());
            ((CommentRealmRealmProxyInterface) realmObject).realmSet$parent(((CommentRealmRealmProxyInterface) newObject).realmGet$parent());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.app.wordpress.realm.table.CommentRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CommentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CommentRealmColumnInfo columnInfo = (CommentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CommentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((CommentRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
            }
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((CommentRealmRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
        }
        String realmGet$url = ((CommentRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        }
        String realmGet$date = ((CommentRealmRealmProxyInterface)object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
        }
        String realmGet$content = ((CommentRealmRealmProxyInterface)object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CommentRealmRealmProxyInterface)object).realmGet$parent());
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CommentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CommentRealmColumnInfo columnInfo = (CommentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CommentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.CommentRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.CommentRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((CommentRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
                    }
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$name = ((CommentRealmRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
                }
                String realmGet$url = ((CommentRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                }
                String realmGet$date = ((CommentRealmRealmProxyInterface)object).realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
                }
                String realmGet$content = ((CommentRealmRealmProxyInterface)object).realmGet$content();
                if (realmGet$content != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CommentRealmRealmProxyInterface)object).realmGet$parent());
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.app.wordpress.realm.table.CommentRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CommentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CommentRealmColumnInfo columnInfo = (CommentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CommentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((CommentRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
            }
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((CommentRealmRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex);
        }
        String realmGet$url = ((CommentRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
        }
        String realmGet$date = ((CommentRealmRealmProxyInterface)object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex);
        }
        String realmGet$content = ((CommentRealmRealmProxyInterface)object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CommentRealmRealmProxyInterface)object).realmGet$parent());
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.CommentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        CommentRealmColumnInfo columnInfo = (CommentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.CommentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.CommentRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.CommentRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((CommentRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((CommentRealmRealmProxyInterface) object).realmGet$id());
                    }
                }
                cache.put(object, rowIndex);
                String realmGet$name = ((CommentRealmRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex);
                }
                String realmGet$url = ((CommentRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
                }
                String realmGet$date = ((CommentRealmRealmProxyInterface)object).realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex);
                }
                String realmGet$content = ((CommentRealmRealmProxyInterface)object).realmGet$content();
                if (realmGet$content != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.parentIndex, rowIndex, ((CommentRealmRealmProxyInterface)object).realmGet$parent());
            }
        }
    }

    public static com.app.wordpress.realm.table.CommentRealm createDetachedCopy(com.app.wordpress.realm.table.CommentRealm realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.app.wordpress.realm.table.CommentRealm unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.app.wordpress.realm.table.CommentRealm)cachedObject.object;
            } else {
                unmanagedObject = (com.app.wordpress.realm.table.CommentRealm)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.app.wordpress.realm.table.CommentRealm();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((CommentRealmRealmProxyInterface) unmanagedObject).realmSet$id(((CommentRealmRealmProxyInterface) realmObject).realmGet$id());
        ((CommentRealmRealmProxyInterface) unmanagedObject).realmSet$name(((CommentRealmRealmProxyInterface) realmObject).realmGet$name());
        ((CommentRealmRealmProxyInterface) unmanagedObject).realmSet$url(((CommentRealmRealmProxyInterface) realmObject).realmGet$url());
        ((CommentRealmRealmProxyInterface) unmanagedObject).realmSet$date(((CommentRealmRealmProxyInterface) realmObject).realmGet$date());
        ((CommentRealmRealmProxyInterface) unmanagedObject).realmSet$content(((CommentRealmRealmProxyInterface) realmObject).realmGet$content());
        ((CommentRealmRealmProxyInterface) unmanagedObject).realmSet$parent(((CommentRealmRealmProxyInterface) realmObject).realmGet$parent());
        return unmanagedObject;
    }

    static com.app.wordpress.realm.table.CommentRealm update(Realm realm, com.app.wordpress.realm.table.CommentRealm realmObject, com.app.wordpress.realm.table.CommentRealm newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((CommentRealmRealmProxyInterface) realmObject).realmSet$name(((CommentRealmRealmProxyInterface) newObject).realmGet$name());
        ((CommentRealmRealmProxyInterface) realmObject).realmSet$url(((CommentRealmRealmProxyInterface) newObject).realmGet$url());
        ((CommentRealmRealmProxyInterface) realmObject).realmSet$date(((CommentRealmRealmProxyInterface) newObject).realmGet$date());
        ((CommentRealmRealmProxyInterface) realmObject).realmSet$content(((CommentRealmRealmProxyInterface) newObject).realmGet$content());
        ((CommentRealmRealmProxyInterface) realmObject).realmSet$parent(((CommentRealmRealmProxyInterface) newObject).realmGet$parent());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CommentRealm = [");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{content:");
        stringBuilder.append(realmGet$content() != null ? realmGet$content() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parent:");
        stringBuilder.append(realmGet$parent());
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
        CommentRealmRealmProxy aCommentRealm = (CommentRealmRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCommentRealm.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCommentRealm.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCommentRealm.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
