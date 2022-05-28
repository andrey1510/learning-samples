package ObserverPatternCustom;

public class FanTest {      // test class
    static int changeTracker = 0;
    public static void main(String[] args) {
        FanSensor fanSensor = new FanSensor();
        FanStatApp1 fanStasticsApp1 = new FanStatApp1(fanSensor);
        FanStatApp2 fanStasticsApp2 = new FanStatApp2(fanSensor);
        //fanSensor.registerFanObserver(fanStasticsApp1);               // todo
        fanSensor.setFanSpeed(3800);            // setting fan speed in FanSensor class
        fanSensor.setFanSpeed(4000);
        fanSensor.removeFanObserver(fanStasticsApp1);
        fanSensor.setFanSpeed(3600);
        fanSensor.setFanSpeed(3500);
        fanSensor.removeFanObserver(fanStasticsApp2);
    }
}
