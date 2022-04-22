public class Mercado {
 static float preco;
 static int qte;
 private float total;
 public float getPreco(){
10. return preco;
11. }
12.
13. public int getQte(){
14. return qte;
15. }
16.
17. public float getTotal(){
18. return total;
19. }
20.
21. public void setPreco(float preco){
22. this.preco = preco;
23. }
24. public void setQte(int qte){
25. this.qte = qte;
26. }
27. public void setTotal(float total){
28. this.total = total;
29. }
public Mercado(float preco, int qte, float total){
27. this.preco = 5;
28. this.qte = 3;
29. this.total = total;
30. }
31. public static float preco(float preco, int qte, float
total){
32. total = preco*qte;
33. return total;
34. }


 }
