package com.pwnpub.gui;

import java.awt.*;

/**
 * @author: soobeenwong
 * @date: 2020/9/20 11:38 下午
 * @description:
 */
public class FirstFrame {

    public static void main(String[] args) {
        Frame newFrame = new Frame("The first window");
        newFrame.setBackground(Color.yellow);
        newFrame.setSize(300, 300);
        newFrame.setTitle("I m coming");
        newFrame.setLocation(200, 200);
        //将qq.png,图片作为图标
        newFrame.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));
        Button b1 = new Button("按钮一");
        newFrame.add(b1);
        //设置布局管理器
        newFrame.setLayout(new FlowLayout());

        newFrame.setVisible(true);
    }
}
