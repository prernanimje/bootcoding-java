package Practice;

import java.util.concurrent.Callable;

import static Practice.Cycle.c1;

public class CycleApplication {
    public static void main(String[] args) {
        Cycle c1=Cycle.CreateCycle();
        Cycle c2=Cycle.CreateCycle("hero","blue",42000.22,"Sports",4);
        Cycle.makeCycle(c1);
        Cycle.makeCycle(c2);

        SportsCycle sc= new SportsCycle();
        SportsCycle.CreateCycle();
        SportsCycle.makeCycle(c1);

        HeroCycle hc = new HeroCycle();
        HeroCycle.makeCycle(c2);
        HeroCycle.CreateCycle();

    }
}
