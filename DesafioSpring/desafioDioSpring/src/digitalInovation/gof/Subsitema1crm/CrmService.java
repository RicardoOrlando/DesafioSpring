package digitalInovation.gof.Subsitema1crm;

public class CrmService {
	public static void gravarClient(String nome, String cep,String cidade, String estado) {
		System.out.println("cliente salvo no sistema de CRM");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
