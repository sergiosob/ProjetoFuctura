package entities;

public class Conta {
	public String numero;
	public String dono;
	private Double saldo;
	private Double limite;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta [" + numero + "]";
	}

	public Conta() {

	}

	public Conta(String numero, String dono, Double saldo, Double limite) {
		super();
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Boolean sacar(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo Insuciiente");
			return false;

		}
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}

	public void consultarSaldo() {
		System.out.println("Seu saldo: R$" + this.getSaldo());
	}

}


