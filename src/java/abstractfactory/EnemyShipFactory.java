package abstractfactory;


// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship
// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

public interface EnemyShipFactory {

    ESWeapon addESGun();
    ESEngine addESEngine();

}
