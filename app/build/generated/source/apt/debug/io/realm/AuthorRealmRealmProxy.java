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

public class AuthorRealmRealmProxy extends com.app.wordpress.realm.table.AuthorRealm
    implements RealmObjectProxy, AuthorRealmRealmProxyInterface {

    static final class AuthorRealmColumnInfo extends ColumnInfo {

        public final long idIndex;
        public final long slugIndex;
        public final long nameIndex;
        public final long first_nameIndex;
        public final long last_nameIndex;
        public final long nicknameIndex;
        public final long urlIndex;
        public final long descriptionIndex;

        AuthorRealmColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(8);
            this.idIndex = getValidColumnIndex(path, table, "AuthorRealm", "id");
            indicesMap.put("id", this.idIndex);

            this.slugIndex = getValidColumnIndex(path, table, "AuthorRealm", "slug");
            indicesMap.put("slug", this.slugIndex);

            this.nameIndex = getValidColumnIndex(path, table, "AuthorRealm", "name");
            indicesMap.put("name", this.nameIndex);

            this.first_nameIndex = getValidColumnIndex(path, table, "AuthorRealm", "first_name");
            indicesMap.put("first_name", this.first_nameIndex);

            this.last_nameIndex = getValidColumnIndex(path, table, "AuthorRealm", "last_name");
            indicesMap.put("last_name", this.last_nameIndex);

            this.nicknameIndex = getValidColumnIndex(path, table, "AuthorRealm", "nickname");
            indicesMap.put("nickname", this.nicknameIndex);

            this.urlIndex = getValidColumnIndex(path, table, "AuthorRealm", "url");
            indicesMap.put("url", this.urlIndex);

            this.descriptionIndex = getValidColumnIndex(path, table, "AuthorRealm", "description");
            indicesMap.put("description", this.descriptionIndex);

            setIndicesMap(indicesMap);
        }
    }

    private final AuthorRealmColumnInfo columnInfo;
    private final ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("slug");
        fieldNames.add("name");
        fieldNames.add("first_name");
        fieldNames.add("last_name");
        fieldNames.add("nickname");
        fieldNames.add("url");
        fieldNames.add("description");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    AuthorRealmRealmProxy(ColumnInfo columnInfo) {
        this.columnInfo = (AuthorRealmColumnInfo) columnInfo;
        this.proxyState = new ProxyState(com.app.wordpress.realm.table.AuthorRealm.class, this);
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
    public String realmGet$first_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.first_nameIndex);
    }

    public void realmSet$first_name(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.first_nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.first_nameIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$last_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.last_nameIndex);
    }

    public void realmSet$last_name(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.last_nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.last_nameIndex, value);
    }

    @SuppressWarnings("cast")
    public String realmGet$nickname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nicknameIndex);
    }

    public void realmSet$nickname(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nicknameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nicknameIndex, value);
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

    public static Table initTable(ImplicitTransaction transaction) {
        if (!transaction.hasTable("class_AuthorRealm")) {
            Table table = transaction.getTable("class_AuthorRealm");
            table.addColumn(RealmFieldType.INTEGER, "id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "slug", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "name", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "first_name", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "last_name", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "nickname", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "url", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "description", Table.NULLABLE);
            table.addSearchIndex(table.getColumnIndex("id"));
            table.setPrimaryKey("id");
            return table;
        }
        return transaction.getTable("class_AuthorRealm");
    }

    public static AuthorRealmColumnInfo validateTable(ImplicitTransaction transaction) {
        if (transaction.hasTable("class_AuthorRealm")) {
            Table table = transaction.getTable("class_AuthorRealm");
            if (table.getColumnCount() != 8) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field count does not match - expected 8 but was " + table.getColumnCount());
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < 8; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final AuthorRealmColumnInfo columnInfo = new AuthorRealmColumnInfo(transaction.getPath(), table);

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
            if (!columnTypes.containsKey("name")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("name") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'name' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.nameIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'name' is required. Either set @Required to field 'name' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("first_name")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'first_name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("first_name") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'first_name' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.first_nameIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'first_name' is required. Either set @Required to field 'first_name' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("last_name")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'last_name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("last_name") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'last_name' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.last_nameIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'last_name' is required. Either set @Required to field 'last_name' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("nickname")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'nickname' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("nickname") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'nickname' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.nicknameIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'nickname' is required. Either set @Required to field 'nickname' or migrate using RealmObjectSchema.setNullable().");
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
            if (!columnTypes.containsKey("description")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'description' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("description") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'description' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.descriptionIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'description' is required. Either set @Required to field 'description' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(transaction.getPath(), "The 'AuthorRealm' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_AuthorRealm";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.AuthorRealm createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        com.app.wordpress.realm.table.AuthorRealm obj = null;
        if (update) {
            Table table = realm.getTable(com.app.wordpress.realm.table.AuthorRealm.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                obj = new io.realm.AuthorRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.AuthorRealm.class));
                ((RealmObjectProxy)obj).realmGet$proxyState().setRealm$realm(realm);
                ((RealmObjectProxy)obj).realmGet$proxyState().setRow$realm(table.getUncheckedRow(rowIndex));
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.AuthorRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.AuthorRealm.class, null);
                } else {
                    obj = (io.realm.AuthorRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.AuthorRealm.class, json.getInt("id"));
                }
            } else {
                obj = (io.realm.AuthorRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.AuthorRealm.class);
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("slug")) {
            if (json.isNull("slug")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$slug(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$slug((String) json.getString("slug"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$name(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("first_name")) {
            if (json.isNull("first_name")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$first_name(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$first_name((String) json.getString("first_name"));
            }
        }
        if (json.has("last_name")) {
            if (json.isNull("last_name")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$last_name(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$last_name((String) json.getString("last_name"));
            }
        }
        if (json.has("nickname")) {
            if (json.isNull("nickname")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$nickname(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$nickname((String) json.getString("nickname"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$description(null);
            } else {
                ((AuthorRealmRealmProxyInterface) obj).realmSet$description((String) json.getString("description"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.AuthorRealm createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.app.wordpress.realm.table.AuthorRealm obj = realm.createObject(com.app.wordpress.realm.table.AuthorRealm.class);
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("slug")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$slug(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$slug((String) reader.nextString());
                }
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
            } else if (name.equals("first_name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$first_name(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$first_name((String) reader.nextString());
                }
            } else if (name.equals("last_name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$last_name(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$last_name((String) reader.nextString());
                }
            } else if (name.equals("nickname")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$nickname(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$nickname((String) reader.nextString());
                }
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("description")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$description(null);
                } else {
                    ((AuthorRealmRealmProxyInterface) obj).realmSet$description((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    public static com.app.wordpress.realm.table.AuthorRealm copyOrUpdate(Realm realm, com.app.wordpress.realm.table.AuthorRealm object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.AuthorRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.AuthorRealm realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.app.wordpress.realm.table.AuthorRealm.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    realmObject = new io.realm.AuthorRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.AuthorRealm.class));
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

    public static com.app.wordpress.realm.table.AuthorRealm copy(Realm realm, com.app.wordpress.realm.table.AuthorRealm newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.AuthorRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.AuthorRealm realmObject = realm.createObject(com.app.wordpress.realm.table.AuthorRealm.class, ((AuthorRealmRealmProxyInterface) newObject).realmGet$id());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$id(((AuthorRealmRealmProxyInterface) newObject).realmGet$id());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$slug(((AuthorRealmRealmProxyInterface) newObject).realmGet$slug());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$name(((AuthorRealmRealmProxyInterface) newObject).realmGet$name());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$first_name(((AuthorRealmRealmProxyInterface) newObject).realmGet$first_name());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$last_name(((AuthorRealmRealmProxyInterface) newObject).realmGet$last_name());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$nickname(((AuthorRealmRealmProxyInterface) newObject).realmGet$nickname());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$url(((AuthorRealmRealmProxyInterface) newObject).realmGet$url());
            ((AuthorRealmRealmProxyInterface) realmObject).realmSet$description(((AuthorRealmRealmProxyInterface) newObject).realmGet$description());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.app.wordpress.realm.table.AuthorRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AuthorRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AuthorRealmColumnInfo columnInfo = (AuthorRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AuthorRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((AuthorRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
            }
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$slug = ((AuthorRealmRealmProxyInterface)object).realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
        }
        String realmGet$name = ((AuthorRealmRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
        }
        String realmGet$first_name = ((AuthorRealmRealmProxyInterface)object).realmGet$first_name();
        if (realmGet$first_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.first_nameIndex, rowIndex, realmGet$first_name);
        }
        String realmGet$last_name = ((AuthorRealmRealmProxyInterface)object).realmGet$last_name();
        if (realmGet$last_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.last_nameIndex, rowIndex, realmGet$last_name);
        }
        String realmGet$nickname = ((AuthorRealmRealmProxyInterface)object).realmGet$nickname();
        if (realmGet$nickname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nicknameIndex, rowIndex, realmGet$nickname);
        }
        String realmGet$url = ((AuthorRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        }
        String realmGet$description = ((AuthorRealmRealmProxyInterface)object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AuthorRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AuthorRealmColumnInfo columnInfo = (AuthorRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AuthorRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.AuthorRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.AuthorRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((AuthorRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
                    }
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$slug = ((AuthorRealmRealmProxyInterface)object).realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
                }
                String realmGet$name = ((AuthorRealmRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
                }
                String realmGet$first_name = ((AuthorRealmRealmProxyInterface)object).realmGet$first_name();
                if (realmGet$first_name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.first_nameIndex, rowIndex, realmGet$first_name);
                }
                String realmGet$last_name = ((AuthorRealmRealmProxyInterface)object).realmGet$last_name();
                if (realmGet$last_name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.last_nameIndex, rowIndex, realmGet$last_name);
                }
                String realmGet$nickname = ((AuthorRealmRealmProxyInterface)object).realmGet$nickname();
                if (realmGet$nickname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nicknameIndex, rowIndex, realmGet$nickname);
                }
                String realmGet$url = ((AuthorRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                }
                String realmGet$description = ((AuthorRealmRealmProxyInterface)object).realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.app.wordpress.realm.table.AuthorRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AuthorRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AuthorRealmColumnInfo columnInfo = (AuthorRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AuthorRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((AuthorRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
            }
        }
        cache.put(object, rowIndex);
        String realmGet$slug = ((AuthorRealmRealmProxyInterface)object).realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.slugIndex, rowIndex);
        }
        String realmGet$name = ((AuthorRealmRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex);
        }
        String realmGet$first_name = ((AuthorRealmRealmProxyInterface)object).realmGet$first_name();
        if (realmGet$first_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.first_nameIndex, rowIndex, realmGet$first_name);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.first_nameIndex, rowIndex);
        }
        String realmGet$last_name = ((AuthorRealmRealmProxyInterface)object).realmGet$last_name();
        if (realmGet$last_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.last_nameIndex, rowIndex, realmGet$last_name);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.last_nameIndex, rowIndex);
        }
        String realmGet$nickname = ((AuthorRealmRealmProxyInterface)object).realmGet$nickname();
        if (realmGet$nickname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nicknameIndex, rowIndex, realmGet$nickname);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nicknameIndex, rowIndex);
        }
        String realmGet$url = ((AuthorRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
        }
        String realmGet$description = ((AuthorRealmRealmProxyInterface)object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AuthorRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AuthorRealmColumnInfo columnInfo = (AuthorRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AuthorRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.AuthorRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.AuthorRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((AuthorRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AuthorRealmRealmProxyInterface) object).realmGet$id());
                    }
                }
                cache.put(object, rowIndex);
                String realmGet$slug = ((AuthorRealmRealmProxyInterface)object).realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.slugIndex, rowIndex, realmGet$slug);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.slugIndex, rowIndex);
                }
                String realmGet$name = ((AuthorRealmRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex);
                }
                String realmGet$first_name = ((AuthorRealmRealmProxyInterface)object).realmGet$first_name();
                if (realmGet$first_name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.first_nameIndex, rowIndex, realmGet$first_name);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.first_nameIndex, rowIndex);
                }
                String realmGet$last_name = ((AuthorRealmRealmProxyInterface)object).realmGet$last_name();
                if (realmGet$last_name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.last_nameIndex, rowIndex, realmGet$last_name);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.last_nameIndex, rowIndex);
                }
                String realmGet$nickname = ((AuthorRealmRealmProxyInterface)object).realmGet$nickname();
                if (realmGet$nickname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nicknameIndex, rowIndex, realmGet$nickname);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.nicknameIndex, rowIndex);
                }
                String realmGet$url = ((AuthorRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
                }
                String realmGet$description = ((AuthorRealmRealmProxyInterface)object).realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex);
                }
            }
        }
    }

    public static com.app.wordpress.realm.table.AuthorRealm createDetachedCopy(com.app.wordpress.realm.table.AuthorRealm realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.app.wordpress.realm.table.AuthorRealm unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.app.wordpress.realm.table.AuthorRealm)cachedObject.object;
            } else {
                unmanagedObject = (com.app.wordpress.realm.table.AuthorRealm)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.app.wordpress.realm.table.AuthorRealm();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$id(((AuthorRealmRealmProxyInterface) realmObject).realmGet$id());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$slug(((AuthorRealmRealmProxyInterface) realmObject).realmGet$slug());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$name(((AuthorRealmRealmProxyInterface) realmObject).realmGet$name());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$first_name(((AuthorRealmRealmProxyInterface) realmObject).realmGet$first_name());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$last_name(((AuthorRealmRealmProxyInterface) realmObject).realmGet$last_name());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$nickname(((AuthorRealmRealmProxyInterface) realmObject).realmGet$nickname());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$url(((AuthorRealmRealmProxyInterface) realmObject).realmGet$url());
        ((AuthorRealmRealmProxyInterface) unmanagedObject).realmSet$description(((AuthorRealmRealmProxyInterface) realmObject).realmGet$description());
        return unmanagedObject;
    }

    static com.app.wordpress.realm.table.AuthorRealm update(Realm realm, com.app.wordpress.realm.table.AuthorRealm realmObject, com.app.wordpress.realm.table.AuthorRealm newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$slug(((AuthorRealmRealmProxyInterface) newObject).realmGet$slug());
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$name(((AuthorRealmRealmProxyInterface) newObject).realmGet$name());
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$first_name(((AuthorRealmRealmProxyInterface) newObject).realmGet$first_name());
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$last_name(((AuthorRealmRealmProxyInterface) newObject).realmGet$last_name());
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$nickname(((AuthorRealmRealmProxyInterface) newObject).realmGet$nickname());
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$url(((AuthorRealmRealmProxyInterface) newObject).realmGet$url());
        ((AuthorRealmRealmProxyInterface) realmObject).realmSet$description(((AuthorRealmRealmProxyInterface) newObject).realmGet$description());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AuthorRealm = [");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{slug:");
        stringBuilder.append(realmGet$slug() != null ? realmGet$slug() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{first_name:");
        stringBuilder.append(realmGet$first_name() != null ? realmGet$first_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{last_name:");
        stringBuilder.append(realmGet$last_name() != null ? realmGet$last_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nickname:");
        stringBuilder.append(realmGet$nickname() != null ? realmGet$nickname() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
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
        AuthorRealmRealmProxy aAuthorRealm = (AuthorRealmRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAuthorRealm.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAuthorRealm.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAuthorRealm.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
