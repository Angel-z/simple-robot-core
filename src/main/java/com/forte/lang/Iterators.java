/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     Iterators.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.lang;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 迭代器工具类
 * @author <a href="https://github.com/ForteScarlet"> ForteScarlet </a>
 */
public class Iterators {

    /**
     * 将{@link java.util.Enumeration}转化为迭代器对象
     * @return Iterator
     */
    public static <T> Iterator<T> iter(Enumeration<T> enumeration){
        return new EnumerateIterator<>(enumeration);
    }



    static final class EnumerateIterator<T> implements Iterator<T>, Enumeration<T> {
        private final Enumeration<T> enumeration;
        EnumerateIterator(Enumeration<T> enumeration){
            this.enumeration = enumeration;
        }
        @Override
        public boolean hasNext() {
            return enumeration.hasMoreElements();
        }

        @Override
        public T next() {
            return enumeration.nextElement();
        }

        @Override
        public boolean hasMoreElements() {
            return enumeration.hasMoreElements();
        }

        @Override
        public T nextElement() {
            return enumeration.nextElement();
        }

        @Override
        public String toString() {
            return super.toString() + "("+ enumeration.toString() +")";
        }
    }


}
