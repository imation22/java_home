package feladatok;

import java.util.Random;
//�rj egy programot, amely egy N elemet tartalmaz� t�mbr�l megmondja, hogy a szomsz�dos elemek k�z�tt mekkora legnagyobb k�l�nbs�g! F�ggv�nnyel!
//�rj egy programot, amely egy N elemet tartalmaz� t�mbr�l megmondja, hogy melyik k�t eleme k�z�tt legkisebb a k�l�nbs�g! 

public class feladat_1 {

	public static void main(String[] args) {
		int[] array = tombGeneral(5);
		legnagyobbKulonbseg(array);
		legkisebbKulonbseg(array);		
	}
	
	
	
	public static int[] tombGeneral(int meret) {
		int[] array = new int[meret];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i]= rand.nextInt(10)+1;
			System.out.print(array[i]+" ");
		}
		return array;
	}

	public static int legnagyobbKulonbseg(int[] array) {
		int eredmeny = 0;
		
		for (int j = 0; j < array.length-1; j++) {
			if (eredmeny<array[j]-array[j+1]) {
				eredmeny = array[j]-array[j+1];
			}
			
		}
		System.out.println("\nA legnagyobb k�l�nbs�g a t�mbben: " + eredmeny);
		return eredmeny;
	}
	
	
	public static int legkisebbKulonbseg(int[] array) {
		int eredmeny = 0;
		
		for (int j = 0; j < array.length-1; j++) {
			if (eredmeny>array[j]-array[j+1]) {
				eredmeny = array[j]-array[j+1];
			}
			
		}
		System.out.println("\nA legkisebb k�l�nbs�g a t�mbben: " + eredmeny);
		return eredmeny;
	}
	
	
	
}

