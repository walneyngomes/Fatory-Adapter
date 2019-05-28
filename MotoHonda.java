
public class MotoHonda implements Moto {

	private Carro carro;

	public MotoHonda(String escolha) throws CarroPointerException {
		FactoryCarro carro = new FactoryCarro();

		if (carro.obterCarro(escolha).equals(null)) {
			throw new CarroPointerException("Não existe carro para adaptar");

		} else {
			this.carro = carro.obterCarro(escolha);
		}
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		carro.corre();
	}

}
