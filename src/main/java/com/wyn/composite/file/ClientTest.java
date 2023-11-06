package com.wyn.composite.file;

import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:17$
 */
public class ClientTest {
    public static void main(String[] args) {
        AbstactFile rootFolder = new Folder("D:\\");
        AbstactFile compositeFolder = new Folder("composite");
        AbstactFile windowsFolder = new Folder("windows");

        AbstactFile file = new File("TestComposite.java");
        rootFolder.addChild(compositeFolder);
        rootFolder.addChild(windowsFolder);
        compositeFolder.addChild(file);

        printTree(rootFolder);
    }

    private static void printTree(AbstactFile ifile) {
        ifile.printName();
        List<AbstactFile> children = ifile.getChildren();
        if(children == null){
            return;
        }

        for(AbstactFile file : children){
            printTree(file);
        }
    }
}

    