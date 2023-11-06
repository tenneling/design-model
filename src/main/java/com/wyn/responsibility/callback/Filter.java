package com.wyn.responsibility.callback;

/**
 * @InterfaceName Filter
 * @Description 过滤字符串接口
 * @Author WENYANNI
 * @Date 2021/10/30 下午6:32
 **/
public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
