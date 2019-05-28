
public class FactoryCarro {
	public Carro obterCarro(String tipo) {
		Carro carro = null;
		if ("Fiat".equals(tipo)) {
			carro = new CarroFiat();
		}
		return carro;
	}

}
