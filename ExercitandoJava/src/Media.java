
public class Media {
	public static void main(String[] args) {
		int primeiro, segundo, terceiro;
		int mediaUm, mediaDois;
		
		/* Calculando a primeira m�dia */
		primeiro = 8;
		segundo = 9;
		terceiro = 7;
		
		mediaUm = (primeiro + segundo + terceiro)/3;
		System.out.println("A m�dia entre " + primeiro + ", " + segundo + ", " + terceiro + " � " + mediaUm);
		
		/* Calculando a segunda m�dia */
		primeiro = 4;
		segundo = 5;
		terceiro = 6;
		
		mediaDois = (primeiro + segundo + terceiro)/3;
		System.out.println("A m�dia entre " + primeiro + ", " + segundo + ", " + terceiro + " � " + mediaDois);
		
		System.out.println("A soma das m�dias � " + (mediaUm + mediaDois));
	}
}
