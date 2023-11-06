package com.wyn.composite.file;

import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:11$
 */
public abstract class AbstactFile {
    protected String name;

    public void printName(){
        System.out.println(name);
    }

    public abstract boolean addChild(AbstactFile file);

    public abstract boolean removeChild(AbstactFile file);

    public abstract List<AbstactFile> getChildren();
}

    