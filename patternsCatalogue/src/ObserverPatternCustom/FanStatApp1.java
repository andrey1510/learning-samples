package ObserverPatternCustom;

public class FanStatApp1 implements FanObserver {       // Observer class (i.e. recipient of observation data), it shall implement to Observer interface
    private FanSensor fanSensor;
    public FanStatApp1(FanSensor fanSensor) {
        this.fanSensor = fanSensor;
        fanSensor.registerFanObserver(this);
    }

    @Override
    public void updateFanStaticsApp(int fanSpeed) {
        System.out.printf("Statistics App No. 1 reports: current fan speed is %s rpm.%n", fanSpeed);
    }
}
