public class Mercado {
    static float preco;
    static int qte;
    private static float total;

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
        this.total = total
    }

    public Mercado(float preco, int qte, float total){
        this.preco = 5;
        this.qte = 3;
        this.total = total;
    }

    public static float preco(float preco, int qte, float total){
        total = preco*qte;
        return total;
    }
}
