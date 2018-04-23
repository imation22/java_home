package feladatok;

public class feladat_4 {
	//Írj egy függvényt, amely egy egész számról eldönti, hogy a prím tényezõi között hány darab 2-es van és visszaadja ezt az értéket! Függvénnyel.

	public static void main(String[] args) {
		printenyezok(96);
	}

	private static void printenyezok(int szam) {
		int oszto= 2;
		int szamlalo = 0;
		
		while(szam>=1) {
			if(szam%oszto==0) {
				if(oszto==2) {
					szamlalo++;
				}
				System.out.println(szam + " "+ oszto);
				szam = szam/oszto;
			}else {
				oszto++;
			}
			
			if(szam==1) {
				System.out.println("Kettesek primtényezõk száma: " + szamlalo);
				break;
			}
		}	
	}
}
