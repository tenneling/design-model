package com.wyn.facade.file;

/**
 * @ClassName Facade
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:53
 **/
public class Facade extends AbstractFacade {
    private FileReader reader;

    private EncryptFile encryptFile;

    private FileWriter writer;

    //初始化业务逻辑类

    public Facade()

    {
        reader = new FileReader();

        encryptFile = new EncryptFile();

        writer = new FileWriter();

    }

    public void encryptFile(String fileName, String encryptFileName)

    {
        //读取文件

        String publicMessage = reader.readFile(fileName);

        //对读取的明文信息进行加密

        String privateMessage = encryptFile.encryptFile(publicMessage);

        //将加密后的信息写入文件中

        writer.write2File(privateMessage, encryptFileName);

    }

}
