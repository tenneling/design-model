package com.wyn.composite;

import java.io.File;

/**
 * @ClassName NodeTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/21 下午2:53
 **/
public class NodeTest {
    public static void main(String[] args) throws Exception {
        Node start = new DirectNode("D://data");
        createTree(start);
        start.display();
    }

    private static void createTree(Node node) throws Exception {
        File file = new File(node.name);
        File fileArray[] = file.listFiles();

        for(int i=0;i<fileArray.length;i++){
            if (fileArray[i].isFile()){
                Node node1 = new FileNode(fileArray[i].getAbsolutePath());
                node.addNode(node1);
            }
            if (fileArray[i].isDirectory()){
                Node node1 = new FileNode(fileArray[i].getAbsolutePath());
                node.addNode(node1);
                createTree(node1);
            }
        }
    }
}
