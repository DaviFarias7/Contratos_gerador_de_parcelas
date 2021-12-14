package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ContratoService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
				
		/*Injeção dependência e inversão de controle
		 * PagamentoOnlineService ps = new PaypalService();
		ContratoService cs = new ContratoService(ps);*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy: ");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados do contrato: ");
		System.out.print("Número: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy)");
		Date data = sdf.parse(sc.next());
		System.out.println("Valor do contrato: ");
		Double valorTotalDoContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotalDoContrato);
		
		System.out.print("Informe o número de parcelas: ");
		int N = sc.nextInt();
		
		ContratoService cs = new ContratoService(new PaypalService());
		cs.processarContrato(contrato, N);
		
		System.out.println("Parcelas: ");
		for(Parcela pcl : contrato.getParcela()) {
			System.out.println(pcl);
		}
				
		sc.close();
	}

}
