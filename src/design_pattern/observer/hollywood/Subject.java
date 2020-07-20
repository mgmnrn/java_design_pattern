package design_pattern.observer.hollywood;

public interface Subject {
    void Register(Object o);
    void UnRegister(Object o);
    void NotifyAll(Object o);
}
