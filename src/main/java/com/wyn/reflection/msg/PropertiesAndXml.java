package com.wyn.reflection.msg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName PropertiesAndXml
 * @Description 反射与配置文件的关系
 * @Author WENYANNI
 * @Date 2021/10/24 下午4:34
 **/
public class PropertiesAndXml {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties ps = new Properties();
        //装载配置文件(properties类型)
        ps.load(new FileInputStream("..../loan_core.properties"));
        //通过key 获取value
        String name = ps.getProperty("func");

        IMsg obj = null;
        obj = (IMsg)Class.forName(name).newInstance();
        obj.process("hello world");

        //装载配置文件(XML类型)
        //ps.loadFromXML(new FileInputStream("..../loan_core.xml"));
    }
}
