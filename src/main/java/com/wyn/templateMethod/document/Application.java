package com.wyn.templateMethod.document;

import java.util.Vector;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:26$
 */
public abstract class Application {
    private Vector<Document> documents;

    public boolean canOpenDocument(String docName){
        return true;
    }

    public void addDocument(Document document){
        documents.add(document);
    }

    public abstract Document doCreateDocument(String name);

    public void openDocument(String docName){
        if(!canOpenDocument(docName)){
            System.out.println("文档无法打开");
            return;
        }

        Document document = doCreateDocument(docName);
        document.open(docName);
        document.read(docName);
        addDocument(document);
    }
}

    