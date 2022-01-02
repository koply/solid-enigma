package me.koply.kcommando.internal.boxes;

import me.koply.kcommando.internal.annotations.Slash;

import java.lang.reflect.Method;

public class SlashBox extends Box {

    public final Slash info;

    public SlashBox(Object instance, Method method, Class<?> clazz, Slash info) {
        super(instance, method, clazz);
        this.info = info;
    }

}