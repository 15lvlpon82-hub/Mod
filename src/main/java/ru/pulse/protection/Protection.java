package ru.pulse.protection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class Protection {
    private static boolean initialized;

    private Protection() {
    }

    public static synchronized void initialize() {
        initialized = true;
    }

    public static synchronized void GamFjznbbEDK() {
        initialize();
    }

    public static boolean isInitialized() {
        return initialized;
    }

    public static Field findField(Class<?> owner, String name, String descriptor, boolean forceAccessible) {
        try {
            Field field = owner.getDeclaredField(name);
            field.setAccessible(forceAccessible);
            return field;
        } catch (ReflectiveOperationException ignored) {
            return null;
        }
    }

    public static Field HQcKVYMOvSiwNY(Class<?> owner, String name, String descriptor, boolean forceAccessible) {
        return findField(owner, name, descriptor, forceAccessible);
    }

    public static Method findMethod(Class<?> owner, String name, String descriptor, boolean forceAccessible) {
        for (Method method : owner.getDeclaredMethods()) {
            if (!method.getName().equals(name)) {
                continue;
            }
            method.setAccessible(forceAccessible);
            return method;
        }
        return null;
    }

    public static Method wjNaofXtsjno(Class<?> owner, String name, String descriptor, boolean forceAccessible) {
        return findMethod(owner, name, descriptor, forceAccessible);
    }

    public static Class<?> GHFapfmWTlg(String name) {
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException ignored) {
            return null;
        }
    }

    public static void VXCpRayqchcmz(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public static String xtksnqlsla(byte[] bytes, int key) {
        return "";
    }
}
