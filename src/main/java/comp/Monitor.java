package comp;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

//@Named
//@ApplicationScoped
//@Alternative
public class Monitor implements IMonitor{
    private String name = "mon";

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
