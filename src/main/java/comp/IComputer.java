package comp;

public interface IComputer {

    String getName();
    IMonitor getMonitor();

    IMouse getMouse();

    void on();
    void off();

}
