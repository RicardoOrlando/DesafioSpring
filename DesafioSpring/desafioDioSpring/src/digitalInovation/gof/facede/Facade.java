package digitalInovation.gof.facede;

import digitalInovation.gof.Subsitema1crm.CrmService;
import digitalInovation.gof.Subsitema2Cep.CepApi;

public class Facade {
	public void migraCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarCep(cep);
		CrmService.gravarClient(nome, cep, cidade, estado);
		
	}
}
