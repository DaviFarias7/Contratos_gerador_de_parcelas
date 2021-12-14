package services;

public class PaypalService implements PagamentoOnlineService {
	
	//Definição de constantes para usar nos métodos
	private static final double TAXA_DE_PAGAMENTO = 0.02;
	private static final double JUROS_MENSAL = 0.01;
	
	@Override
	public double taxaDePagamento(double quantia) {
		return quantia * TAXA_DE_PAGAMENTO;
	}

	@Override
	public double juros(double quantia, int meses) {
		return quantia * JUROS_MENSAL * meses;
	}

}
