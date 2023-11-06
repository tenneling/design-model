package com.wyn.adapter.listener;

import javax.swing.*;
import java.awt.event.WindowEvent;

/**
 * @ClassName WindowAdapterTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/21 下午12:46
 **/
public class WindowAdapterTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("window");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
