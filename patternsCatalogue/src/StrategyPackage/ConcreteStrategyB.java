package StrategyPackage;

class ConcreteStrategyB implements Strategy {   // конкретная реализация этого интерфейса
    public int calculate(int i, int n) {
        return i + n;
    }
}
