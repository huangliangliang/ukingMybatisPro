/*
 * Copyright (c) 2018. 中南设计集团工程研究院. 版权所有者.
 * ProjectName: performance-util
 * FileName: JsonUtil.java
 * Date: 18-8-6 下午5:22
 * Version: 1.0.0
 * LastModified: 18-8-6 下午5:22
 */

package com.uking.mbpro.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author: s1203017
 * Create: 2018-08-06
 * Description: Json转换工具类
 */
public class JsonUtil {

    /**
     * 实现格式化的时间字符串转时间对象
     */
    private static final String DATE_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 使用默认的gson对象进行反序列化
     */
    public static <T> T fromJsonDefault(String json, TypeToken<T> typeToken) {
        Gson gson = new Gson();
        return gson.fromJson(json, typeToken.getType());
    }

    /**
     * json字符串转list或者map
     */
    public static <T> T fromJsonToMap(String json) {
        //重写map的反序列化
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<Map<String, Object>>() {
        }.getType(), new MapTypeAdapter()).create();
        return gson.fromJson(json, new TypeToken<Map<String, Object>>() {
        }.getType());
    }

    /**
     * json字符串转list或者map,根据Type
     */
    public static <T> T fromJson(String json, Type type) {
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<Map<String, Object>>() {
        }.getType(), new MapTypeAdapter()).create();
        return gson.fromJson(json, type);
    }

    /**
     * json字符串转list或者map,根据TypeToken
     */
    public static <T> T fromJson(String json, TypeToken<T> typeToken) {
        //重写map的反序列化
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<Map<String, Object>>() {
        }.getType(), new MapTypeAdapter()).create();
        return gson.fromJson(json, typeToken.getType());
    }

    /**
     * json字符串转bean对象,根据Class
     */
    public static <T> T fromJson(String json, Class<T> cls) {
        Gson gson = new GsonBuilder().setDateFormat(DATE_FORMAT_DEFAULT).create();
        return gson.fromJson(json, cls);
    }

    /**
     * 对象转json
     */
    public static String toJson(Object obj, boolean format) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //设置默认时间格式
        gsonBuilder.setDateFormat(DATE_FORMAT_DEFAULT);
        //添加格式化设置
        if (format) {
            gsonBuilder.setPrettyPrinting();
        }
        Gson gson = gsonBuilder.create();
        return gson.toJson(obj);
    }

    /**
     * Author: s1203017
     * Create: 2018-08-06
     * Description: Map类型适配器
     */
    public static class MapTypeAdapter extends TypeAdapter<Object> {
        @Override
        public Object read(JsonReader in) throws IOException {
            JsonToken token = in.peek();
            switch (token) {
                case BEGIN_ARRAY:
                    List<Object> list = new ArrayList<>();
                    in.beginArray();
                    while (in.hasNext()) {
                        list.add(read(in));
                    }
                    in.endArray();
                    return list;
                case BEGIN_OBJECT:
                    Map<String, Object> map = new LinkedTreeMap<>();
                    in.beginObject();
                    while (in.hasNext()) {
                        map.put(in.nextName(), read(in));
                    }
                    in.endObject();
                    return map;
                case STRING:
                    return in.nextString();
                case NUMBER:
                    //改写数字的处理逻辑，将数字值分为整型与浮点型。
                    double dbNum = in.nextDouble();
                    //数字超过long的最大值，返回浮点类型
                    if (dbNum > Long.MAX_VALUE) {
                        return dbNum;
                    }
                    //判断数字是否为整数值
                    long lngNum = (long) dbNum;
                    if (dbNum == lngNum) {
                        return lngNum;
                    } else {
                        return dbNum;
                    }
                case BOOLEAN:
                    return in.nextBoolean();
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    throw new IllegalStateException();
            }
        }

        @Override
        public void write(JsonWriter out, Object value) throws IOException {
            // 序列化无需实现
        }
    }

}
