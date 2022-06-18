public class StrategyPattern {
}


interface Strategy {
    int calculate(int i, int n);
}

class ConcreteStrategyA implements Strategy {   // Интерфейс, отражающий какой-либо алгоритм
    public int calculate(int i, int n) {
        return i*n;
    }
}

class ConcreteStrategyB implements Strategy {   // конкретная реализация этого интерфейса
    public int calculate(int i, int n) {
        return i+n;
    }
}

class ClientA {    // клиент, использующий объект стратегий
    private final Strategy strategy;
    public ClientA(Strategy s) {
        this.strategy = s;
    }
    public int process (int i, int n) {
        return strategy.calculate(i, n);
    }

    public static void main(String[] args) {
        ClientA a = new ClientA(new ConcreteStrategyA());
        int result = a.process(4,4);
        System.out.println(result);
    }
}

class ClientB {
    private final Strategy strategy;
    public ClientB(Strategy s) {
        this.strategy = s;
    }
    public int process (int i, int n) {
        return strategy.calculate(i, n);
    }

    public static void main(String[] args) {
        ClientB b = new ClientB(new ConcreteStrategyB());
        int result = b.process(4,4);
        System.out.println(result);
    }
}