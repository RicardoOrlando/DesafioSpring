package digitalInovation.gof.singleton;
/**
 * Singleton pregucoso
 * @author Ricardo Olando
 *
 */
 //o çsingleton Lazy no primeiro momento ele não disponibiliza a sua instancia para o usuario.
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	
    //vonstrutor privado para que ninguem o instancie
	private SingletonLazy() {
		super();
		// TODO Auto-generated constructor stub
	}

	//metodo publico para que ele retorne que ele foi instanciada
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

	
	
	
	
	
}
