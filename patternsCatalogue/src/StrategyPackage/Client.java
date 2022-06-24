package StrategyPackage;

class Client {    // клиент, использующий объект стратегий
    private final Strategy strategy;

    public Client(Strategy s) {
        this.strategy = s;
    }

    public int process(int i, int n) {
        return strategy.calculate(i, n);
    }

    public static void main(String[] args) {

        // Different strategies may be used:

        Client a = new Client(new ConcreteStrategyA());
        int resultA = a.process(4, 4);
        System.out.println(resultA);

        Client b = new Client(new ConcreteStrategyB());
        int resultB = b.process(4, 4);
        System.out.println(resultB);
    }
}
