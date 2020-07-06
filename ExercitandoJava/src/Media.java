
public class Media {
	public static void main(String[] args) {
		int primeiro, segundo, terceiro;
		int mediaUm, mediaDois;
		
		/* Calculando a primeira média */
		primeiro = 8;
		segundo = 9;
		terceiro = 7;
		
		mediaUm = (primeiro + segundo + terceiro)/3;
		System.out.println("A média entre " + primeiro + ", " + segundo + ", " + terceiro + " é " + mediaUm);
		
		/* Calculando a segunda média */
		primeiro = 4;
		segundo = 5;
		terceiro = 6;
		
		mediaDois = (primeiro + segundo + terceiro)/3;
		System.out.println("A média entre " + primeiro + ", " + segundo + ", " + terceiro + " é " + mediaDois);
		
		System.out.println("A soma das médias é " + (mediaUm + mediaDois));
	}
}
