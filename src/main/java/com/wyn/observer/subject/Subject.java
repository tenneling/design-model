package com.wyn.observer.subject;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:28$
 */
public interface Subject {
    void attach(Observer docExplorer);
    void detach(Observer docExplorer);
    void notifyObservers();
}

    