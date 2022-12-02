package digitalInovation.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href="http://stackoverflow.com/a/24018148">Ref</a>
 * 
 * @author Ricardo Olando
 *
 */

//caracteristica de instanciar o elemeto dentro dela quando for solicitada
public class SingletonLazyHolder {
	
	
	private static class InstanceHolder {
		
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
		
	    //construtor
		private SingletonLazyHolder() {
			super();
		}
		
		public static SingletonLazyHolder getInstancia() {
			return InstanceHolder.instancia;
		}
}
