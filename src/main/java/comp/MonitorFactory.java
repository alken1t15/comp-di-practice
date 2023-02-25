package comp;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class MonitorFactory {

    @Produces
    public IMonitor create(){
        return new Monitor();
    }
}