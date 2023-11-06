package com.wyn.composite.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:15$
 */
public class Folder extends AbstactFile{

    private List<AbstactFile> childList;

    public Folder(String name){
        this.name = name;
        this.childList = new ArrayList<AbstactFile>();
    }
    @Override
    public boolean addChild(AbstactFile file) {
        return childList.add(file);
    }

    @Override
    public boolean removeChild(AbstactFile file) {
        return childList.remove(file);
    }

    @Override
    public List<AbstactFile> getChildren() {
        return childList;
    }
}

    