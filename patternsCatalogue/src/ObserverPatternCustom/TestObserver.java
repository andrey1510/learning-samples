package ObserverPatternCustom;

public class TestObserver {
    static int changeTracker = 0;
    public static void main(String[] args) {
        Subject fanSensor = new Subject();
        ConcreteObserver1 fanStasticsApp1 = new ConcreteObserver1(fanSensor);
        ConcreteObserver2 fanStasticsApp2 = new ConcreteObserver2(fanSensor);
        //fanSensor.registerFanObserver(fanStasticsApp1);               // todo
        fanSensor.setFanSpeed(3800);            // setting fan speed in FanSensor class
        fanSensor.setFanSpeed(4000);
        fanSensor.removeFanObserver(fanStasticsApp1);
        fanSensor.setFanSpeed(3600);
        fanSensor.setFanSpeed(3500);
        fanSensor.removeFanObserver(fanStasticsApp2);
    }
}
