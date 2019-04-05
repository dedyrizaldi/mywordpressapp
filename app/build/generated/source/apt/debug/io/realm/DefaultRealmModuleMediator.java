package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.ImplicitTransaction;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>();
        modelClasses.add(com.app.wordpress.realm.table.CommentRealm.class);
        modelClasses.add(com.app.wordpress.realm.table.AttachmentRealm.class);
        modelClasses.add(com.app.wordpress.realm.table.PostRealm.class);
        modelClasses.add(com.app.wordpress.realm.table.CategoryRealm.class);
        modelClasses.add(com.app.wordpress.realm.table.AuthorRealm.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Table createTable(Class<? extends RealmModel> clazz, ImplicitTransaction transaction) {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return io.realm.CommentRealmRealmProxy.initTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return io.realm.AttachmentRealmRealmProxy.initTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return io.realm.PostRealmRealmProxy.initTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return io.realm.CategoryRealmRealmProxy.initTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return io.realm.AuthorRealmRealmProxy.initTable(transaction);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public ColumnInfo validateTable(Class<? extends RealmModel> clazz, ImplicitTransaction transaction) {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return io.realm.CommentRealmRealmProxy.validateTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return io.realm.AttachmentRealmRealmProxy.validateTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return io.realm.PostRealmRealmProxy.validateTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return io.realm.CategoryRealmRealmProxy.validateTable(transaction);
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return io.realm.AuthorRealmRealmProxy.validateTable(transaction);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return io.realm.CommentRealmRealmProxy.getFieldNames();
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return io.realm.AttachmentRealmRealmProxy.getFieldNames();
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return io.realm.PostRealmRealmProxy.getFieldNames();
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return io.realm.CategoryRealmRealmProxy.getFieldNames();
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return io.realm.AuthorRealmRealmProxy.getFieldNames();
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return io.realm.CommentRealmRealmProxy.getTableName();
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return io.realm.AttachmentRealmRealmProxy.getTableName();
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return io.realm.PostRealmRealmProxy.getTableName();
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return io.realm.CategoryRealmRealmProxy.getTableName();
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return io.realm.AuthorRealmRealmProxy.getTableName();
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, ColumnInfo columnInfo) {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return clazz.cast(new io.realm.CommentRealmRealmProxy(columnInfo));
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return clazz.cast(new io.realm.AttachmentRealmRealmProxy(columnInfo));
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return clazz.cast(new io.realm.PostRealmRealmProxy(columnInfo));
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return clazz.cast(new io.realm.CategoryRealmRealmProxy(columnInfo));
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return clazz.cast(new io.realm.AuthorRealmRealmProxy(columnInfo));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return clazz.cast(io.realm.CommentRealmRealmProxy.copyOrUpdate(realm, (com.app.wordpress.realm.table.CommentRealm) obj, update, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return clazz.cast(io.realm.AttachmentRealmRealmProxy.copyOrUpdate(realm, (com.app.wordpress.realm.table.AttachmentRealm) obj, update, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return clazz.cast(io.realm.PostRealmRealmProxy.copyOrUpdate(realm, (com.app.wordpress.realm.table.PostRealm) obj, update, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return clazz.cast(io.realm.CategoryRealmRealmProxy.copyOrUpdate(realm, (com.app.wordpress.realm.table.CategoryRealm) obj, update, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return clazz.cast(io.realm.AuthorRealmRealmProxy.copyOrUpdate(realm, (com.app.wordpress.realm.table.AuthorRealm) obj, update, cache));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            io.realm.CommentRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.CommentRealm) object, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            io.realm.AttachmentRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.AttachmentRealm) object, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            io.realm.PostRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.PostRealm) object, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            io.realm.CategoryRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.CategoryRealm) object, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            io.realm.AuthorRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.AuthorRealm) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new IdentityHashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
                io.realm.CommentRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.CommentRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
                io.realm.AttachmentRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.AttachmentRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
                io.realm.PostRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.PostRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
                io.realm.CategoryRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.CategoryRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
                io.realm.AuthorRealmRealmProxy.insert(realm, (com.app.wordpress.realm.table.AuthorRealm) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
                    io.realm.CommentRealmRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
                    io.realm.AttachmentRealmRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
                    io.realm.PostRealmRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
                    io.realm.CategoryRealmRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
                    io.realm.AuthorRealmRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            io.realm.CommentRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.CommentRealm) obj, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            io.realm.AttachmentRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.AttachmentRealm) obj, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            io.realm.PostRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.PostRealm) obj, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            io.realm.CategoryRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.CategoryRealm) obj, cache);
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            io.realm.AuthorRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.AuthorRealm) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new IdentityHashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
                io.realm.CommentRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.CommentRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
                io.realm.AttachmentRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.AttachmentRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
                io.realm.PostRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.PostRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
                io.realm.CategoryRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.CategoryRealm) object, cache);
            } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
                io.realm.AuthorRealmRealmProxy.insertOrUpdate(realm, (com.app.wordpress.realm.table.AuthorRealm) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
                    io.realm.CommentRealmRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
                    io.realm.AttachmentRealmRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
                    io.realm.PostRealmRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
                    io.realm.CategoryRealmRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
                    io.realm.AuthorRealmRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return clazz.cast(io.realm.CommentRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return clazz.cast(io.realm.AttachmentRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return clazz.cast(io.realm.PostRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return clazz.cast(io.realm.CategoryRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return clazz.cast(io.realm.AuthorRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return clazz.cast(io.realm.CommentRealmRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return clazz.cast(io.realm.AttachmentRealmRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return clazz.cast(io.realm.PostRealmRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return clazz.cast(io.realm.CategoryRealmRealmProxy.createUsingJsonStream(realm, reader));
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return clazz.cast(io.realm.AuthorRealmRealmProxy.createUsingJsonStream(realm, reader));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.app.wordpress.realm.table.CommentRealm.class)) {
            return clazz.cast(io.realm.CommentRealmRealmProxy.createDetachedCopy((com.app.wordpress.realm.table.CommentRealm) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.AttachmentRealm.class)) {
            return clazz.cast(io.realm.AttachmentRealmRealmProxy.createDetachedCopy((com.app.wordpress.realm.table.AttachmentRealm) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.PostRealm.class)) {
            return clazz.cast(io.realm.PostRealmRealmProxy.createDetachedCopy((com.app.wordpress.realm.table.PostRealm) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.CategoryRealm.class)) {
            return clazz.cast(io.realm.CategoryRealmRealmProxy.createDetachedCopy((com.app.wordpress.realm.table.CategoryRealm) realmObject, 0, maxDepth, cache));
        } else if (clazz.equals(com.app.wordpress.realm.table.AuthorRealm.class)) {
            return clazz.cast(io.realm.AuthorRealmRealmProxy.createDetachedCopy((com.app.wordpress.realm.table.AuthorRealm) realmObject, 0, maxDepth, cache));
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
