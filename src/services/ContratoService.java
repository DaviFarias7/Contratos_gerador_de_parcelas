package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ContratoService {
	
	/*composição de objetos
	 * Inversão de controle/Injeção de dependências*/
	private PagamentoOnlineService pagamentoOnlineService;
	
	/*Injeção de dependência utilizando o construtor*/
	public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
		this.pagamentoOnlineService = pagamentoOnlineService;

	}
	
	/*Processamento do contrato: Gera as parcelas*/
	public void processarContrato(Contrato contrato, int meses) {
		double parcelaBasica = contrato.getValorTotal() / meses;
		for (int i = 1; i  <= meses; i++) {
			double parcelaAtualizada = parcelaBasica + pagamentoOnlineService.juros(parcelaBasica, i);
			double parcelaTotal = parcelaAtualizada + pagamentoOnlineService.taxaDePagamento(parcelaAtualizada);
			Date dataDoVencimento = adicionarMesesAumaData(contrato.getData(), i);
			contrato.getParcela().add(new Parcela(dataDoVencimento, parcelaTotal));
		}
	}
	
	/*Função para adicionar meses a uma data*/
	private Date adicionarMesesAumaData(Date data, int N) {;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
