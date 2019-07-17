package com.jibrus.jibrus.converters;

public interface Converter<F, T> {

    T convert(F from);

}
