package ssala.zoo;

//questa mia classe estende la classe animale.

public class Rhino extends Animal {
//ci d� un problema perch� animal non ha un costruttore vuoto. Rhino non pu� essere costrutito. prima cerca di costruire se stesso, poi animal. devo costruire un costruttore che richiami animal.
	//public Rhino() {
		//super("Unnamed"); 
	//}
//resta solo la reference da animal. setta tutto in unnamed.se non vogliamo il rinocereonte senza nome:
	public Rhino(String name) {
		super(name);
	}
	
	@Override
	public String toString () {
		return"{Rhino" + getName() + "}";

	}
}