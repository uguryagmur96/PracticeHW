package uguryagmur;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Takim t1=new Takim("Karşıyaka",0,0);
		Takim t2=new Takim("Göztepe",0,0);
		Takim t3=new Takim("Altay",0,0);
		Takim t4=new Takim("Altınordu",0,0);
		Turnuva tt1=new Turnuva("İzmir'in Çınarları");
		tt1.turnuvayaTakimEkle(t1);
		tt1.turnuvayaTakimEkle(t2);
		tt1.turnuvayaTakimEkle(t3);
		tt1.turnuvayaTakimEkle(t4);
		
		tt1.kickStart(t1, t2);
		tt1.kickStart(t1, t3);
		tt1.kickStart(t1, t4);
		tt1.kickStart(t2, t3);
		tt1.kickStart(t2, t4);
		tt1.kickStart(t3, t4);
		System.out.println("******************");
		t1.financialRecords();
		t2.financialRecords();
		t3.financialRecords();
		t4.financialRecords();
		System.out.println("*******************");
		tt1.leagueTable();
		System.out.println("*******************");
		tt1.champion();
		
		
	}

}
