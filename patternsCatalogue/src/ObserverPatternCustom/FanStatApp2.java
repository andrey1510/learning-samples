package ObserverPatternCustom;

public class FanStatApp2 implements FanObserver {  // observer class (i.e. recipient of observation data), it shall implement to observer interface
    private FanSensor fanSensor;
    private int trackerSpeed = 0;
    public FanStatApp2(FanSensor fanSensor) {
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
