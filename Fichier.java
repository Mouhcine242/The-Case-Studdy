package Classes;

import java.util.*;

public class Fichier implements Methods  {
	Scanner cl = new Scanner(System.in);
	String nom ;
	double taill ;
	Fichier(String nom, double taill){
		this.nom=nom;
		this.taill= taill;
		
	}
	@Override
	public String getName() {
		return this.nom;
	}
	@Override
	public double getLenght() {
		return this.taill;
	}
	@Override
	public void New(String nom, double taill) {
		System.out.println("Enter your UserName");
		String s1= cl.next();
		System.out.println("Enter your password");
		String s2= cl.next();
		if(s1.equals(UserName) && s2.equals(Password)  ) {
			Fichier f = new Fichier(nom , taill);
			Dossier.ensF.add(f);
		}
		
		
	}
	public void Supp(Fichier f) {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(UserName)&& s2.equals(Password) && Dossier.ensF.contains(f)) {
			Dossier.ensF.remove(f);
		}
		
	}

}
