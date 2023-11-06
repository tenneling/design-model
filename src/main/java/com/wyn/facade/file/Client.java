package com.wyn.facade.file;

/**
 * @ClassName Client
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:55
 **/
public class Client {
    public static void main(String[] args)

    {
        //这里完全可以通过配置文件将外观类的具体实现利用反射技术进行动态实例化，这样就

        //可以扩展系统的同时不需要修改源代码

        AbstractFacade facade = new Facade();

        facade.encryptFile("要加密的文件.txt", "加密的文件_encrypt.txt");

    }
}
