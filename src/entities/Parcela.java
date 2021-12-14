package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date vencimento;
	private Double total;
	
	public Parcela() {
	}

	public Parcela(Date vencimento, Double total) {
		super();
		this.vencimento = vencimento;
		this.total = total;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return sdf.format(vencimento) + " - " + String.format("%.2f", total);
	}
}
