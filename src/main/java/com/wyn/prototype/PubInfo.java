package com.wyn.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName PubInfo
 * @Description 公共信息
 * @Author WENYANNI
 * @Date 2021/10/30 下午2:19
 **/
@Setter
@Getter
@ToString
public class PubInfo implements Cloneable{
    String college;
    String city;
    String zip;

    public PubInfo(String college,String city,String zip){
        college = this.college;
        city = this.city;
        zip = this.zip;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
