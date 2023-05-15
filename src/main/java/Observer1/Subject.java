package Observer1;

public interface Subject {
    void notifyObservers();

    void register(Receivers receiver);

    void deRegister(Receivers receiver);
}
