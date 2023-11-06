package com.wyn.responsibility.callback;

/**
 * @ClassName TrimFilter
 * @Description 去掉空格的过滤器
 * @Author WENYANNI
 * @Date 2021/10/30 下午7:01
 **/
public class TrimFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //这是上一个过滤器的响应
        String s = response.response;
        response.response = s.replace(" ","");
        filterChain.doFilter(request,response,filterChain);
    }
}
