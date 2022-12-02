package digitalInovation.gof.Subsitema2Cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cidade) {
		return "Araquara";
	}
	
	public String recuperarCep(String cep) {
		return "SP";
	}

}
