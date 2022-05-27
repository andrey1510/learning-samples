package ObserverPatternCustom;

public interface FanObservable {            // observable interface
    void registerFanObserver(FanObserver o);
    void removeFanObserver(FanObserver o);
    void notifyFanObserver();
                                          // interface members implicitly have 'public' so 'public' modifier can be omitted
}
