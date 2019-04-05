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

public class AttachmentRealmRealmProxy extends com.app.wordpress.realm.table.AttachmentRealm
    implements RealmObjectProxy, AttachmentRealmRealmProxyInterface {

    static final class AttachmentRealmColumnInfo extends ColumnInfo {

        public final long idIndex;
        public final long urlIndex;
        public final long mime_typeIndex;

        AttachmentRealmColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(3);
            this.idIndex = getValidColumnIndex(path, table, "AttachmentRealm", "id");
            indicesMap.put("id", this.idIndex);

            this.urlIndex = getValidColumnIndex(path, table, "AttachmentRealm", "url");
            indicesMap.put("url", this.urlIndex);

            this.mime_typeIndex = getValidColumnIndex(path, table, "AttachmentRealm", "mime_type");
            indicesMap.put("mime_type", this.mime_typeIndex);

            setIndicesMap(indicesMap);
        }
    }

    private final AttachmentRealmColumnInfo columnInfo;
    private final ProxyState proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("url");
        fieldNames.add("mime_type");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    AttachmentRealmRealmProxy(ColumnInfo columnInfo) {
        this.columnInfo = (AttachmentRealmColumnInfo) columnInfo;
        this.proxyState = new ProxyState(com.app.wordpress.realm.table.AttachmentRealm.class, this);
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
    public String realmGet$mime_type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mime_typeIndex);
    }

    public void realmSet$mime_type(String value) {
        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mime_typeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mime_typeIndex, value);
    }

    public static Table initTable(ImplicitTransaction transaction) {
        if (!transaction.hasTable("class_AttachmentRealm")) {
            Table table = transaction.getTable("class_AttachmentRealm");
            table.addColumn(RealmFieldType.INTEGER, "id", Table.NOT_NULLABLE);
            table.addColumn(RealmFieldType.STRING, "url", Table.NULLABLE);
            table.addColumn(RealmFieldType.STRING, "mime_type", Table.NULLABLE);
            table.addSearchIndex(table.getColumnIndex("id"));
            table.setPrimaryKey("id");
            return table;
        }
        return transaction.getTable("class_AttachmentRealm");
    }

    public static AttachmentRealmColumnInfo validateTable(ImplicitTransaction transaction) {
        if (transaction.hasTable("class_AttachmentRealm")) {
            Table table = transaction.getTable("class_AttachmentRealm");
            if (table.getColumnCount() != 3) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field count does not match - expected 3 but was " + table.getColumnCount());
            }
            Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
            for (long i = 0; i < 3; i++) {
                columnTypes.put(table.getColumnName(i), table.getColumnType(i));
            }

            final AttachmentRealmColumnInfo columnInfo = new AttachmentRealmColumnInfo(transaction.getPath(), table);

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
            if (!columnTypes.containsKey("url")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'url' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("url") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'url' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.urlIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'url' is required. Either set @Required to field 'url' or migrate using RealmObjectSchema.setNullable().");
            }
            if (!columnTypes.containsKey("mime_type")) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Missing field 'mime_type' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
            }
            if (columnTypes.get("mime_type") != RealmFieldType.STRING) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Invalid type 'String' for field 'mime_type' in existing Realm file.");
            }
            if (!table.isColumnNullable(columnInfo.mime_typeIndex)) {
                throw new RealmMigrationNeededException(transaction.getPath(), "Field 'mime_type' is required. Either set @Required to field 'mime_type' or migrate using RealmObjectSchema.setNullable().");
            }
            return columnInfo;
        } else {
            throw new RealmMigrationNeededException(transaction.getPath(), "The 'AttachmentRealm' class is missing from the schema for this Realm.");
        }
    }

    public static String getTableName() {
        return "class_AttachmentRealm";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.AttachmentRealm createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        com.app.wordpress.realm.table.AttachmentRealm obj = null;
        if (update) {
            Table table = realm.getTable(com.app.wordpress.realm.table.AttachmentRealm.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = TableOrView.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != TableOrView.NO_MATCH) {
                obj = new io.realm.AttachmentRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.AttachmentRealm.class));
                ((RealmObjectProxy)obj).realmGet$proxyState().setRealm$realm(realm);
                ((RealmObjectProxy)obj).realmGet$proxyState().setRow$realm(table.getUncheckedRow(rowIndex));
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.AttachmentRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.AttachmentRealm.class, null);
                } else {
                    obj = (io.realm.AttachmentRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.AttachmentRealm.class, json.getInt("id"));
                }
            } else {
                obj = (io.realm.AttachmentRealmRealmProxy) realm.createObject(com.app.wordpress.realm.table.AttachmentRealm.class);
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((AttachmentRealmRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((AttachmentRealmRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((AttachmentRealmRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("mime_type")) {
            if (json.isNull("mime_type")) {
                ((AttachmentRealmRealmProxyInterface) obj).realmSet$mime_type(null);
            } else {
                ((AttachmentRealmRealmProxyInterface) obj).realmSet$mime_type((String) json.getString("mime_type"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    public static com.app.wordpress.realm.table.AttachmentRealm createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.app.wordpress.realm.table.AttachmentRealm obj = realm.createObject(com.app.wordpress.realm.table.AttachmentRealm.class);
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((AttachmentRealmRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AttachmentRealmRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((AttachmentRealmRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("mime_type")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AttachmentRealmRealmProxyInterface) obj).realmSet$mime_type(null);
                } else {
                    ((AttachmentRealmRealmProxyInterface) obj).realmSet$mime_type((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    public static com.app.wordpress.realm.table.AttachmentRealm copyOrUpdate(Realm realm, com.app.wordpress.realm.table.AttachmentRealm object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.AttachmentRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.AttachmentRealm realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.app.wordpress.realm.table.AttachmentRealm.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
                if (rowIndex != TableOrView.NO_MATCH) {
                    realmObject = new io.realm.AttachmentRealmRealmProxy(realm.schema.getColumnInfo(com.app.wordpress.realm.table.AttachmentRealm.class));
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

    public static com.app.wordpress.realm.table.AttachmentRealm copy(Realm realm, com.app.wordpress.realm.table.AttachmentRealm newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.app.wordpress.realm.table.AttachmentRealm) cachedRealmObject;
        } else {
            com.app.wordpress.realm.table.AttachmentRealm realmObject = realm.createObject(com.app.wordpress.realm.table.AttachmentRealm.class, ((AttachmentRealmRealmProxyInterface) newObject).realmGet$id());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((AttachmentRealmRealmProxyInterface) realmObject).realmSet$id(((AttachmentRealmRealmProxyInterface) newObject).realmGet$id());
            ((AttachmentRealmRealmProxyInterface) realmObject).realmSet$url(((AttachmentRealmRealmProxyInterface) newObject).realmGet$url());
            ((AttachmentRealmRealmProxyInterface) realmObject).realmSet$mime_type(((AttachmentRealmRealmProxyInterface) newObject).realmGet$mime_type());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.app.wordpress.realm.table.AttachmentRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AttachmentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AttachmentRealmColumnInfo columnInfo = (AttachmentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AttachmentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((AttachmentRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
            }
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$url = ((AttachmentRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        }
        String realmGet$mime_type = ((AttachmentRealmRealmProxyInterface)object).realmGet$mime_type();
        if (realmGet$mime_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mime_typeIndex, rowIndex, realmGet$mime_type);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AttachmentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AttachmentRealmColumnInfo columnInfo = (AttachmentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AttachmentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.AttachmentRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.AttachmentRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((AttachmentRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
                    }
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$url = ((AttachmentRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                }
                String realmGet$mime_type = ((AttachmentRealmRealmProxyInterface)object).realmGet$mime_type();
                if (realmGet$mime_type != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.mime_typeIndex, rowIndex, realmGet$mime_type);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.app.wordpress.realm.table.AttachmentRealm object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AttachmentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AttachmentRealmColumnInfo columnInfo = (AttachmentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AttachmentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = TableOrView.NO_MATCH;
        Object primaryKeyValue = ((AttachmentRealmRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == TableOrView.NO_MATCH) {
            rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
            if (primaryKeyValue != null) {
                Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
            }
        }
        cache.put(object, rowIndex);
        String realmGet$url = ((AttachmentRealmRealmProxyInterface)object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
        }
        String realmGet$mime_type = ((AttachmentRealmRealmProxyInterface)object).realmGet$mime_type();
        if (realmGet$mime_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mime_typeIndex, rowIndex, realmGet$mime_type);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mime_typeIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.app.wordpress.realm.table.AttachmentRealm.class);
        long tableNativePtr = table.getNativeTablePointer();
        AttachmentRealmColumnInfo columnInfo = (AttachmentRealmColumnInfo) realm.schema.getColumnInfo(com.app.wordpress.realm.table.AttachmentRealm.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.app.wordpress.realm.table.AttachmentRealm object = null;
        while (objects.hasNext()) {
            object = (com.app.wordpress.realm.table.AttachmentRealm) objects.next();
            if(!cache.containsKey(object)) {
                long rowIndex = TableOrView.NO_MATCH;
                Object primaryKeyValue = ((AttachmentRealmRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == TableOrView.NO_MATCH) {
                    rowIndex = Table.nativeAddEmptyRow(tableNativePtr, 1);
                    if (primaryKeyValue != null) {
                        Table.nativeSetLong(tableNativePtr, pkColumnIndex, rowIndex, ((AttachmentRealmRealmProxyInterface) object).realmGet$id());
                    }
                }
                cache.put(object, rowIndex);
                String realmGet$url = ((AttachmentRealmRealmProxyInterface)object).realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex);
                }
                String realmGet$mime_type = ((AttachmentRealmRealmProxyInterface)object).realmGet$mime_type();
                if (realmGet$mime_type != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.mime_typeIndex, rowIndex, realmGet$mime_type);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.mime_typeIndex, rowIndex);
                }
            }
        }
    }

    public static com.app.wordpress.realm.table.AttachmentRealm createDetachedCopy(com.app.wordpress.realm.table.AttachmentRealm realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.app.wordpress.realm.table.AttachmentRealm unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.app.wordpress.realm.table.AttachmentRealm)cachedObject.object;
            } else {
                unmanagedObject = (com.app.wordpress.realm.table.AttachmentRealm)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.app.wordpress.realm.table.AttachmentRealm();
            cache.put(realmObject, new RealmObjectProxy.CacheData(currentDepth, unmanagedObject));
        }
        ((AttachmentRealmRealmProxyInterface) unmanagedObject).realmSet$id(((AttachmentRealmRealmProxyInterface) realmObject).realmGet$id());
        ((AttachmentRealmRealmProxyInterface) unmanagedObject).realmSet$url(((AttachmentRealmRealmProxyInterface) realmObject).realmGet$url());
        ((AttachmentRealmRealmProxyInterface) unmanagedObject).realmSet$mime_type(((AttachmentRealmRealmProxyInterface) realmObject).realmGet$mime_type());
        return unmanagedObject;
    }

    static com.app.wordpress.realm.table.AttachmentRealm update(Realm realm, com.app.wordpress.realm.table.AttachmentRealm realmObject, com.app.wordpress.realm.table.AttachmentRealm newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((AttachmentRealmRealmProxyInterface) realmObject).realmSet$url(((AttachmentRealmRealmProxyInterface) newObject).realmGet$url());
        ((AttachmentRealmRealmProxyInterface) realmObject).realmSet$mime_type(((AttachmentRealmRealmProxyInterface) newObject).realmGet$mime_type());
        return realmObject;
    }

    @Override
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AttachmentRealm = [");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mime_type:");
        stringBuilder.append(realmGet$mime_type() != null ? realmGet$mime_type() : "null");
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
        AttachmentRealmRealmProxy aAttachmentRealm = (AttachmentRealmRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttachmentRealm.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttachmentRealm.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttachmentRealm.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
