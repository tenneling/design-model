package com.wyn.policy;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.StringTokenizer;

/**
 * @ClassName ReflectionSelect
 * @Description 反射加配置文件
 * @Author WENYANNI
 * @Date 2021/11/20 上午9:24
 **/
public class ReflectionSelect {
    private ICalc obj;

    Properties properties = new Properties();
    /*
    + AddCalc
    - MinusCalc
    * MulCalc
    / DivCalc  */

    public ReflectionSelect(){
        try{
            String path = this.getClass().getResource("/").getPath()+ "one/myconfig.txt";
            FileInputStream fi = new FileInputStream(path);
            properties.load(fi);
            fi.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public int calc(String expression){
        StringTokenizer stringTokenizer = new StringTokenizer(expression,"+-*/",true);
        int a = Integer.parseInt(stringTokenizer.nextToken()) ;
        String op = stringTokenizer.nextToken();
        int b = Integer.parseInt(stringTokenizer.nextToken());
        String sClass = properties.getProperty(op);
        try{
            obj  = (ICalc) Class.forName(sClass).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj.calc(a,b);
    }
}
