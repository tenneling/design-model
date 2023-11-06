package com.wyn.factory.factoryExampleT;

/**
 * @InterfaceName IRead
 * @Description
 * @Author WENYANNI
 * @Date 2021/10/26 上午12:17
 **/
public interface IRead<T> {
    T read(String... in);
}