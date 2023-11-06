package com.wyn.observer.pull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Vector;

/**
 * @ClassName Subject
 * @Description 主题实现类
 * @Author WENYANNI
 * @Date 2021/11/14 下午3:48
 **/
@Getter
@Setter
@ToString
public class Subject extends AbstractSubject {
    //主题中心数据
    private String data ;
}
