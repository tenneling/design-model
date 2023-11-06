package com.wyn.facade.file;

/**
 * @ClassName AbstractFacade
 * @Description 抽象外观类
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:52
 **/
public abstract class AbstractFacade {
    /**

     * @param fileName:表示明文文件名称

     * @param encryptFileName:表示加密后的文件名称

     */

    public abstract void encryptFile(String fileName,String encryptFileName);
}
