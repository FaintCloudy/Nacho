package io.github.faintcloudy.nacho.settings;

import com.sun.istack.internal.NotNull;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Settings {
    private final Map<String, Object> entries = new HashMap<>();
    private final Map<String, Object> childEntries = new HashMap<>();
    public Settings() {
        try {
            for (Field field : this.getClass().getFields()) {
                if (field.isAnnotationPresent(Set.class)) {
                    Set set = field.getAnnotation(Set.class);
                    Object value = field.get(this);
                    entries.put(set.key(), value);
                    if (value instanceof Settings) {
                        childEntries.put(set.key(), value);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public <T> T getSet(String key, Class<T> valueClass) {
        return valueClass.cast(this.getSet(key));
    }

    public Object getSet(String key) {
        if (key == null || key.isEmpty())
            throw new NullPointerException("Key is invalid! (empty or null)");
        return entries.get(key);
    }

    /**
     * Methods named getSetDeeply and setDeeply had been deprecated.
     * The reason is accessing the child settings directly
     * may produce safety problems such as getting a set but
     * there are two set have the same key.
     *
     * If you aren't able to give up the method yet, please
     * stop using the same key in a tree of settings (settings
     * with child settings) anymore and modify them, or it'll be a thorny problem
     * in the future!
     */

    @Deprecated
    public <T> T getSetDeeply(String key, Class<T> valueClass) {
        T result = this.getSet(key, valueClass);
        if (result == null)
            return valueClass.cast(this.getSetDeeply(key));
        else return result;
    }

    @Deprecated
    public Object getSetDeeply(String key) {
        Object result = this.getSet(key);
        if (result == null)
            return childEntries.get(key);
        else return result;
    }

    @Deprecated
    public Settings setDeeply(@NotNull String key, Object value) {
        if (key == null || key.isEmpty())
            throw new NullPointerException("Key is invalid! (empty or null)");
        entries.put(key, value);
        childEntries.put(key, value);
        return this;
    }

    public Settings set(@NotNull String key, Object value) {
        if (key == null || key.isEmpty())
            throw new NullPointerException("Key is invalid! (empty or null)");
        entries.put(key, value);
        return this;
    }

    public Map<String, Object> getEntries() {
        return entries;
    }

    public Map<String, Object> getChildEntries() {
        return childEntries;
    }
}
