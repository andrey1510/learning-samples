package ObserverPatternCustom;

public class ConcreteObserver2 implements Observer {  // observer class (i.e. recipient of observation data), it shall implement to observer interface
    private Subject fanSensor;
    private int trackerSpeed = 0;
    public ConcreteObserver2(Subject fanSensor) {
        this.fanSensor = fanSensor;
        fanSensor.registerFanObserver(this);
    }

    @Override
    public void updateFanStaticsApp(int fanSpeed) {

        System.out.printf("Statistics App No. 2 reports: current fan speed is %s rpm. ", fanSpeed);
        if (trackerSpeed < fanSpeed) {
            System.out.printf("Speed has increased.%n");
            trackerSpeed = fanSpeed;
        } else if (trackerSpeed > fanSpeed) {
            System.out.printf("Speed has decreased.%n");
            trackerSpeed = fanSpeed;
        } else {
            System.out.printf("Speed has not changed.%n");
            trackerSpeed = fanSpeed;
        }
    }
}
