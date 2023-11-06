package com.wyn.responsibility.callback;

/**
 * @ClassName MyThread
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/10/30 下午7:17
 **/
public class MyThread extends Thread{

    Request request;
    Response response;
    Filter filter;
    FilterChain filterChain;

    public MyThread(Request request, Response response, Filter filter, FilterChain filterChain) {
        this.request = request;
        this.response = response;
        this.filter = filter;
        this.filterChain = filterChain;
    }

    public void run(Filter filter){
        filter.doFilter(request,response,filterChain);
    }
}
