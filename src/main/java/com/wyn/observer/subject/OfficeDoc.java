package com.wyn.observer.subject;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:31$
 */
public class OfficeDoc implements Subject{

    private Vector observerVector = new Vector();

    @Override
    public void attach(Observer docExplorer) {
        observerVector.addElement(docExplorer);
    }

    @Override
    public void detach(Observer docExplorer) {
        observerVector.removeElement(docExplorer);
    }

    @Override
    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((Observer)enumeration.nextElement()).update(this);
        }
    }

    public Enumeration observers(){
        return observerVector.elements();
    }

}

    