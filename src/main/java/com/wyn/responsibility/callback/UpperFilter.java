package com.wyn.responsibility.callback;

import java.util.Locale;

/**
 * @ClassName UpperFilter
 * @Description 英文字符串小写转大写
 * @Author WENYANNI
 * @Date 2021/10/30 下午6:44
 **/
public class UpperFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String s = request.request;
        response.response = s.toUpperCase();
        filterChain.doFilter(request,response,filterChain);
    }
}
