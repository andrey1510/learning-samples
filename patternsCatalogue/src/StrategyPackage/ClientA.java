package StrategyPackage;

class ClientA {    // клиент, использующий объект стратегий
    private final Strategy strategy;

    public ClientA(Strategy s) {
        this.strategy = s;
    }

    public int process(int i, int n) {
        return strategy.calculate(i, n);
    }

    public static void main(String[] args) {
        ClientA a = new ClientA(new ConcreteStrategyA());
        int result = a.process(4, 4);
        System.out.println(result);
    }
}
