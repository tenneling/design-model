package com.wyn.responsibility.callback;

/**
 * @ClassName StringFilterTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/10/30 下午7:08
 **/
public class StringFilterTest {
    public static void main(String[] args) {
        Request request = new Request("i am a student");
        Response response = new Response("");

        Filter oneFilter = new UpperFilter();
        Filter twoFilter = new TrimFilter();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(oneFilter);
        filterChain.addFilter(twoFilter);
        filterChain.doFilter(request,response,filterChain);

        System.out.println(response.response);
    }
}
