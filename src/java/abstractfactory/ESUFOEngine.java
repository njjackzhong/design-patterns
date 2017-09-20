package abstractfactory;


// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship

public class ESUFOEngine implements ESEngine {

    @Override
    public String toString() {
        return "1000 mph";
    }
}
