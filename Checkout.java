import java.text.DecimalFormat;

public class Checkout {

	private Rules rules;
	private int total;
	private int soma;
	private int qtdA, qtdB, qtdC, qtdD ;

	public Checkout(Rules rules) {
		this.rules = rules;
	}

	// scan
	void scan(String... itens) {

		// identificar e somar
		for (int i = 0; i < itens.length; i++) {

			switch (itens[i]) {
			case "A":
				qtdA++;
				break;
			case "B":
				qtdB++;
				break;
			case "C":
				qtdC++;
				break;
			case "D":
				qtdD++;
				break;
			default:
				System.out.println("Este não é um produto válido!");
			}
		}
		calculaPromocao();
	}

	private void calculaPromocao() {
 		
		//regra produto A
		System.out.println("Valor de produtos com A:"+ qtdA * rules.getA());
		setSoma(qtdA * rules.getA());  
		
		//regra produto B
		System.out.println("Valor de produtos com B:"+ qtdB * rules.getB());
		setSoma(qtdB * rules.getB());
		
		System.out.println("Valor de produtos com C:"+ qtdC * rules.getC());
		setSoma(qtdC * rules.getC());
		
		System.out.println("Valor de produtos com D:"+ qtdD * rules.getD());
		setSoma(qtdD * rules.getD());
	
		setTotal(getSoma());
	}

	// calcula promoção

	public Rules getRules() {
		return rules;
	}

	public void setRules(Rules rules) {
		this.rules = rules;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = this.soma + soma;
	}
}
