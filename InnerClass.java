package S202305016;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class InnerClass {
    //定义一个JFrame窗口
    private JFrame jf;

    //定义一个JTextField文本域
    private JTextField tf;

    public InnerClass(){
        //构造方法,初始化窗口和文本域
        jf = new JFrame("Innew Classes example");
        tf = new JTextField(30);
    }

    public void  launchFrame() {
        //添加标签
        JLabel label = new JLabel("Click and drag the mouse");
        //获取内容面板
        Container c = jf.getContentPane();
        //添加标签和文本域
        c.add(label, BorderLayout.NORTH);
        c.add(tf, BorderLayout.SOUTH);

        //添加鼠标监听器,使用内部类定义监听器
        jf.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //鼠标拖动时获取坐标并显示在文本域上
                String s = "Mouse dragging: x=" + e.getX() + "Y=" + e.getY();
                tf.setText(s);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });

        //设置窗口大小并显示
        jf.setSize(300, 200);
        jf.setVisible(true);
    }

    public static void main(String args[]){
        //主方法,创建InnerClass对象并调用launchFrame方法
        InnerClass obj = new InnerClass();
        obj.launchFrame();
    }
}