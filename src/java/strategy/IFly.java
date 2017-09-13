package strategy;

public interface IFly {
    String fly();
}

class CantFly implements  IFly{

    @Override
    public String fly() {
        return "I can not fly";
    }
}


class ItFly implements  IFly{

    @Override
    public String fly() {
        return "Flying High";
    }
}