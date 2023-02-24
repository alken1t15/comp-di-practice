package comp;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class MonitorNew implements IMonitor{
    private String name = "new";

    public MonitorNew(String name) {
        this.name = name;
    }

    public MonitorNew() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
