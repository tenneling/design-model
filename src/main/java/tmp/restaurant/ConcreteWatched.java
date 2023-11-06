package tmp.restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 16:53$
 */
public class ConcreteWatched implements Watched{

    private List<Watcher> watchers = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str) {
        for(Watcher watcher:watchers){
            watcher.doSomething();
        }
    }
}

    