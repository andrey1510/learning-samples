package StrategyPackage;

class ClientB {
    private final Strategy strategy;

    public ClientB(Strategy s) {
        this.strategy = s;
    }

    public int process(int i, int n) {
        return strategy.calculate(i, n);
    }

    public static void main(String[] args) {
        ClientB b = new ClientB(new ConcreteStrategyB());
        int result = b.process(4, 4);
        System.out.println(result);
    }
}
