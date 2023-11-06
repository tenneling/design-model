package com.wyn.responsibility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @ClassName MyChainByReflect
 * @Description 通过配置文件读取责任链
 * @Author WENYANNI
 * @Date 2021/10/30 下午5:11
 **/
public class MyChainByReflect {
    /**
     * myconfig文件内容：chain=ZuZhang,ZhuRen,JingLi
     **/
    private Handle handler[];

    public void createChain(){
        try {
            String path = this.getClass().getResource("/").getPath();
            FileInputStream fi = new FileInputStream(path + "one/myconfig.txt");

            Properties properties = new Properties();
            properties.load(fi);

            //获得责任链总串
            String s = properties.getProperty("chain");
            String unit[] = s.split(",");

            //共有n个处理者
            int n = unit.length;

            for(int i= 0;i<n; i++){
                //通过 反射加载各个责任链对象
                handler[i] = (Handle) Class.forName(unit[i]).newInstance();
            }

            for (int i=0 ; i<n;i++){
                //设置节点前后关系
                handler[i].setNext(handler[i+1]);
            }
            fi.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handle(Request request){
        handler[0].handle(request);
    }
}
