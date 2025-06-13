package Day_17_Esercizio2;

import java.math.BigDecimal;


public class FatturaTest {

	public static void main(String[] args) {
//		Clienti paoloRossi = new Clienti();
//		paoloRossi.setCf("cf1");
//		paoloRossi.setNome("Paolo");
//		paoloRossi.setCognome("Rossi");
//		paoloRossi.setPrezzoDaPagare(new BigDecimal ("1200.00"));
//		System.out.println(paoloRossi.toString());
//		
//		Clienti lucaVerdi = new Clienti("cf2", "Luca", "Verdi", new BigDecimal ("1400.00"));
//		System.out.println(lucaVerdi.toString());
//
//	}
//	
//	paoloRossi.setCf("cf1");
//	paoloRossi.setNome("Paolo");
//	paoloRossi.setCognome("Rossi");
//	paoloRossi.setKwh(30.00);
//	
//	ClienteLuce lucaVerdi = new ClienteLuce("cf2","Luca", "Verdi", 80.00);
//	
//	System.out.println(paoloRossi);
//	System.out.println(lucaVerdi);
	
	//ClienteGas gianniBianchi = new ClienteGas("cf5","Gianni", "Bianchi", 50.00);
	
//	ClienteLuce paoloRossi = new ClienteLuce("cf1", "Paolo","Rossi", 299.00);
//	ClienteLuce lucaVerdi = new ClienteLuce("cf2", "Luca","Verdi", 450.00);
//	ClienteLuce gianniGianni = new ClienteLuce("cf3", "Gianni","Gianni", 800.00);
//	
//	CalcoloFatture.calcoloFattura(paoloRossi);
//	CalcoloFatture.calcoloFattura(lucaVerdi);
//	CalcoloFatture.calcoloFattura(gianniGianni);
//
//	System.out.println(paoloRossi);
//	System.out.println(lucaVerdi);
//	System.out.println(gianniGianni);
	
//	ClienteGas paoloRossi = new ClienteGas("cf1", "Paolo","Rossi", 299.00);
//	ClienteGas lucaVerdi = new ClienteGas("cf2", "Luca","Verdi", 450.00);
//	ClienteGas gianniGianni = new ClienteGas("cf3", "Gianni","Gianni", 800.00);
//	
//	CalcoloFatture.calcoloFattura(paoloRossi);
//	CalcoloFatture.calcoloFattura(lucaVerdi);
//	CalcoloFatture.calcoloFattura(gianniGianni);
//	
//	System.out.println(paoloRossi);
//	System.out.println(lucaVerdi);
//	System.out.println(gianniGianni);
	
//	ClienteFisso paoloRossi = new ClienteFisso("cf1", "Paolo","Rossi", ContrattoFisso.STANDARD);
//	ClienteFisso lucaVerdi = new ClienteFisso("cf2", "Luca","Verdi", ContrattoFisso.SPECIAL);
//	ClienteFisso gianniGianni = new ClienteFisso("cf3", "Gianni","Gianni", ContrattoFisso.SUPERSPECIAL);
//	
//	CalcoloFatture.calcoloFattura(paoloRossi);
//	CalcoloFatture.calcoloFattura(lucaVerdi);
//	CalcoloFatture.calcoloFattura(gianniGianni);
//	
//	System.out.println(paoloRossi);
//	System.out.println(lucaVerdi);
//	System.out.println(gianniGianni);
	
	ClienteMobile paoloRossi = new ClienteMobile("cf1", "Paolo","Rossi", 20);
	ClienteMobile lucaVerdi = new ClienteMobile("cf2", "Luca","Verdi", 50);
	ClienteMobile gianniGianni = new ClienteMobile("cf3", "Gianni","Gianni", 90);
	
	CalcoloFatture.calcoloFattura(paoloRossi);
	CalcoloFatture.calcoloFattura(lucaVerdi);
	CalcoloFatture.calcoloFattura(gianniGianni);
	
	System.out.println(paoloRossi);
	System.out.println(lucaVerdi);
	System.out.println(gianniGianni);

	
	}
	
	
}