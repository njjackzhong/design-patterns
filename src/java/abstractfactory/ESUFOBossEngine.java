package abstractfactory;

// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship

public class ESUFOBossEngine implements ESEngine{

    @Override
    public String toString() {
        return "2000 mph";
    }
}
