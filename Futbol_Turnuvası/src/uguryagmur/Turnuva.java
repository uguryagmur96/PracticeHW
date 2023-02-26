package uguryagmur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Turnuva  {
	
	private String name;
	private ArrayList<Takim> takimlarList;
	
	public Turnuva() {
		
	}
	
	public Turnuva(String name) {
		super();
		this.name = name;
		this.takimlarList = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Takim> getTakimlarList() {
		return takimlarList;
	}
	public void setTakimlarList(ArrayList<Takim> takimlarList) {
		this.takimlarList = takimlarList;
	}
	public void turnuvayaTakimEkle(Takim takim) {
		this.takimlarList.add(takim);
	}
	public void kickStart(Takim takim1,Takim takim2) {
		Random rand=new Random();
		int n=rand.nextInt(1,3);
		
		if (n==1) {
			takim1.setScore(takim1.getScore()+3);
			takim1.setVault(takim1.getWallet()+10000);
			System.out.println(takim1.getName() + " " + takim2.getName() + " 'ye karşı maçı kazandı!!!");
		}
		else if (n==2) {
			takim2.setScore(takim2.getScore()+3);
			takim2.setVault(takim2.getWallet()+10000);
			System.out.println(takim2.getName() + " " + takim1.getName() + " 'ye karşı maçı kazandı!!!");
		}
		else {
			System.out.println(takim1.getName() + " ve " + takim2.getName() + " berabere kaldı!!!");
			takim1.setScore(takim1.getScore()+1);
			takim1.setVault(takim1.getWallet()+5000);
			takim2.setScore(takim2.getScore()+1);
			takim2.setVault(takim2.getWallet()+5000);
		}
		
		
	}
	public void leagueTable () {
		
		for (Takim takim : takimlarList) {
			System.out.println(takim.getName() + " Puanı: " + takim.getScore());
		}
	}
	public void champion() {
		String champ="";
		int enBuyuk=0;
		for (Takim takim : takimlarList) {
			if (takim.getScore()>enBuyuk) {
				champ=takim.getName();
			}
		}
		System.out.println("Şampiyon ===>>> " + champ);
		
	}

	
	
	

}
