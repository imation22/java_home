package feladatok;

public class feladat_4 {
	//�rj egy f�ggv�nyt, amely egy eg�sz sz�mr�l eld�nti, hogy a pr�m t�nyez�i k�z�tt h�ny darab 2-es van �s visszaadja ezt az �rt�ket! F�ggv�nnyel.

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
				System.out.println("Kettesek primt�nyez�k sz�ma: " + szamlalo);
				break;
			}
		}	
	}
}
