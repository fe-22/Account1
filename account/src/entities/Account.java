package entities;

public class Account {
	
	
	
	private int conta;
	private String ccp;
	private double initialDeposit;
	
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getCcp() {
		return ccp;
	}
	public void setCcp(String ccp) {
		this.ccp = ccp;
	}
	public double DepositInitial(double amount) {
		return initialDeposit += amount;
	}
	public void saque(double amount) {
		initialDeposit -= amount + 0.5;
	}
	@Override
	public String toString() {
		return 
				"Conta"
				+ "Valor em conta=" 
				+ conta + "ccp=" 
				+ ccp + ", initialDeposit=" 
				+ initialDeposit ;
	}
	public void InitialDeposit(double valorDeposito) {
		
		
	}
	
	
	
	
	
}
