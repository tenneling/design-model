package com.wyn.prototype.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName Address
 * @Description 籍贯信息类
 * @Author WENYANNI
 * @Date 2021/10/30 下午1:19
 **/
@Setter
@Getter
@ToString
public class Address implements Serializable {

    String province;
    String city;
    String zip;

    public Address(String province, String city, String zip){
        this.province = province;
        this.city = city;
        this.zip = zip;
    }
}
