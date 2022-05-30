package ObserverPatternCustom;

public interface Observable {            // observable interface
    void registerFanObserver(Observer o);
    void removeFanObserver(Observer o);
    void notifyFanObserver();
                                          // interface members implicitly have 'public' so 'public' modifier can be omitted
}
