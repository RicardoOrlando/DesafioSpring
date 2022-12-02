package digitalInovation.gof;

import digitalInovation.gof.facede.Facade;
import digitalInovation.gof.singleton.SingletonEager;
import digitalInovation.gof.singleton.SingletonLazy;
import digitalInovation.gof.singleton.SingletonLazyHolder;
import digitalInovation.gof.strategy.Comportamento;
import digitalInovation.gof.strategy.ComportamentoAgressivo;
import digitalInovation.gof.strategy.ComportamentoDefensivo;
import digitalInovation.gof.strategy.ComportamentoNormal;
import digitalInovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
	
	
		//Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		//Facede
		Facade facade = new Facade();
		facade.migraCliente("Ricardo", "14801788");
		
		
		
		
		
		
		
		
		
		
}
}