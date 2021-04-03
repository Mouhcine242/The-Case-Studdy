package Classes;

import java.util.TreeSet;

import java.util.*;

public class Dossier implements Methods {
	Scanner cl = new Scanner(System.in);
	String nom ;
	double taill ;
	static TreeSet<Fichier> ensF = new TreeSet<>();
	Dossier(String nom , double taill){
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
			Dossier d = new Dossier(nom , taill);
			Repertoir.ensD.add(d);
		}
		
	}

	public void Supp(Dossier d) {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(UserName)&& s2.equals(Password) && Repertoir.ensD.contains(d)) {
			Repertoir.ensD.remove(d);
		}
		
	} 
	

}
