package comp;

public class Monitor implements IMonitor{
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public Monitor() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
