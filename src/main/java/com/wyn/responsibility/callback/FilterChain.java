package com.wyn.responsibility.callback;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ClassName FilterChain
 * @Description 过滤器容器类，其对象作为具体处理者必备的回调参数
 * @Author WENYANNI
 * @Date 2021/10/30 下午6:46
 **/
public class FilterChain implements Filter{

    /**
     * 生成了过滤器集合对象
     * 实现了回调功能
     *
     * 将FilterChain和具体处理类均从FILTER接口派生的好处：公用doFilter()方法
     **/

    ArrayList<Filter> arrayList = new ArrayList<>();
    int index = 0;

    void addFilter(Filter filter){
        arrayList.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if(index == arrayList.size()){
            return;
        }
        Filter filter = arrayList.get(index);
        index++;
        filter.doFilter(request,response,filterChain);

        /**
         * 多线程：异步回调
         **/
        MyThread myThread = new MyThread(request,response,filter,filterChain);
        myThread.start();
    }
}
