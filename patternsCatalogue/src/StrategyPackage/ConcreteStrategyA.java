package StrategyPackage;

class ConcreteStrategyA implements Strategy {
    public int calculate(int i, int n) {
        return i * n;
    }
}
