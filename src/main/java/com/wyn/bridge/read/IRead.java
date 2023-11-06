package com.wyn.bridge.read;

/**
 * @InterfaceName IRead
 * @Description
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:27
 **/
public interface IRead<T> {
    T read() throws Exception;
}
