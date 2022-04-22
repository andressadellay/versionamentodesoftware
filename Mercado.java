public class Mercado {
	static float preco;
	static int qte;
	private float total;
	public float getPreco(){
		return preco;
	}

	public int getQte(){
		return qte;
	}

	public float getTotal(){
		return total;
	}

	public void setPreco(float preco){
		this.preco = preco;
	}
	public void setQte(int qte){
		this.qte = qte;
	}
	public void setTotal(float total){
		this.total = total;
	}
}