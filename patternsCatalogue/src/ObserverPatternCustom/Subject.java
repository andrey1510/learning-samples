package ObserverPatternCustom;

import java.util.ArrayList;

// The Observer Pattern defines a one-to-many relationship between a set of objects.

public class Subject implements Observable {   // subject class, it will provide data to observer. Shall implement observable interface
    private int fanSpeed;
    private ArrayList concreteObserversList;

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        System.out.printf("   Fan speed was set to %s rpm.%n", fanSpeed);
        notifyFanObserver(); // ToDo
    }

    public Subject() {            //ToDo
        concreteObserversList = new ArrayList();
    }

    @Override
    public void registerFanObserver(Observer o) {
        concreteObserversList.add(o);
        System.out.println("New app was registed: " + o.getClass());
    }

    @Override
    public void removeFanObserver(Observer o) {
        int i = concreteObserversList.indexOf(o);
        if (i >= 0) {
            concreteObserversList.remove(i);
            System.out.println("App was removed: " + o.getClass());
        }
    }

    @Override
    public void notifyFanObserver() {
        for (int i=0; i < concreteObserversList.size(); i++) {
            Observer fanObserver = (Observer)concreteObserversList.get(i);
            fanObserver.updateFanStaticsApp(fanSpeed);
        }
    }
}
