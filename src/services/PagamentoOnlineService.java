package services;

public interface PagamentoOnlineService {
	
	double taxaDePagamento (double quantia);
	double juros (double quantia, int meses);

}
