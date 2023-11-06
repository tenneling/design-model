package com.wyn.composite.file;

import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:13$
 */
public class File extends AbstactFile{

    public File(String name){
        this.name = name;
    }

    @Override
    public boolean addChild(AbstactFile file) {
        return false;
    }

    @Override
    public boolean removeChild(AbstactFile file) {
        return false;
    }

    @Override
    public List<AbstactFile> getChildren() {
        return null;
    }
}

    