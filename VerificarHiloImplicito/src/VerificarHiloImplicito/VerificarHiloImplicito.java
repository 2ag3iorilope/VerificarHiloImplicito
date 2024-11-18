package VerificarHiloImplicito;

public class VerificarHiloImplicito {

	public static void main(String[] args) {
		 // Thread motako objektu bat deklaratzen da, eta une horretan exekutatzen ari den...
		 // ...hariaren erreferentzia berreskuratzen da currentThread metodoaren bidez.
		   Thread hiloPrincipal= Thread.currentThread();

		   //Hariaren izena lortzen du
		   System.out.println(hiloPrincipal.getName()); 

		   //Hariaren izena eta lehentasuna lortzen ditu kate moduan
		   System.out.println(hiloPrincipal.toString());

		   //Devuelve el número de threads activos
		   System.out.println(hiloPrincipal.activeCount());  
		}
		}


