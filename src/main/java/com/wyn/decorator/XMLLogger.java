package com.wyn.decorator;

/**
 * @ClassName XMLLogger
 * @Description XML格式化
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:27
 **/
public class XMLLogger extends Decorator{

    public XMLLogger(ILogger logger){
        super(logger);
    }

    @Override
    public void log(String msg) {
        String s = "<msg><content>"+msg+"</content></msg>";
        logger.log(msg);
    }
}
