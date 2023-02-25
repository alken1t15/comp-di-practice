package comp;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@ApplicationScoped
public class Computer implements IComputer {

    private String name;

//    @Inject
//    @Named("monitor")
    protected IMonitor monitor; // в эту переменную будет подставлен конкретный объект (это может быть неизвестно самой переменной)
    private IMouse mouse;

//    @Inject
//    public Computer(IMouse mouse) {
//        this.mouse = mouse;
//    }

    @Inject
//    public Computer(IMouse mouse, @Named("monitor") IMonitor monitor) {
    public Computer(IMouse mouse,  IMonitor monitor) {
        this.mouse = mouse;
        this.monitor= monitor;
    }

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

    @Override
    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Inject
//    public void setMonitor(@Named("monitor") IMonitor monitor) {
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
