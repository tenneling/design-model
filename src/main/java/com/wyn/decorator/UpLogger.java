package com.wyn.decorator;

import java.util.Locale;

/**
 * @ClassName UpLogger
 * @Description 具体的装饰对象，Decorator的子类，实现了Component接口，描述了具体的装饰过程
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:23
 **/
public class UpLogger extends Decorator{

    public UpLogger(ILogger logger){
        super(logger);
    }

    @Override
    public void log(String msg) {
        msg = msg.toUpperCase();
        logger.log(msg);
    }
}
