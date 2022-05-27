package ObserverPatternCustom;

import java.util.ArrayList;

// The Observer Pattern defines a one-to-many relationship between a set of objects.

public class FanSensor implements FanObservable {   // subject class, it will provide data to observer. Shall implement observable interface
    private int fanSpeed;
    private ArrayList fanAppsList;

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        System.out.printf("   Fan speed was set to %s rpm.%n", fanSpeed);
        notifyFanObserver(); // ToDo
    }

    public int getFanSpeed() {
        return fanSpeed;
    }
    public FanSensor() {            //ToDo
        fanAppsList = new ArrayList();
    }

    @Override
    public void registerFanObserver(FanObserver o) {
        fanAppsList.add(o);
        System.out.println("New app was registed: " + o.getClass());
    }

    @Override
    public void removeFanObserver(FanObserver o) {
        int i = fanAppsList.indexOf(o);
        if (i >= 0) {
            fanAppsList.remove(i);
            System.out.println("App was removed: " + o.getClass());
        }
    }

    @Override
    public void notifyFanObserver() {
        for (int i=0; i < fanAppsList.size(); i++) {
            FanObserver fanObserver = (FanObserver)fanAppsList.get(i);
            fanObserver.updateFanStaticsApp(fanSpeed);
        }
    }
}
