package abstractfactory;

// Here we define a basic component of a space ship
// Any part that implements the interface ESWeapon
// can replace that part in any ship

public class ESUFOBossGun implements ESWeapon {

    @Override
    public String toString() {
        return "40 damage";
    }
}
