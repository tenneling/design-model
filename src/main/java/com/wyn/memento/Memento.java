package com.wyn.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName Memento
 * @Description 备忘录类，负责存储原发者状态的对象
 * @Author WENYANNI
 * @Date 2021/11/14 下午1:20
 **/
@Setter
@Getter
@ToString
public class Memento implements Serializable {
    //由于将备忘录按对象形式保存在文件中，必须实现Serializable接口
    private int pos;
}
