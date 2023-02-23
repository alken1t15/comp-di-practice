package comp;


import jakarta.inject.Inject;

public class Computer implements IComputer {

    private String name;

    @Inject
    protected IMonitor monitor; // в эту переменную будет подставлен конкретный объект (это может быть неизвестно самой переменной)

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + monitor.getName());
    }
}
