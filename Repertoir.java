package Classes;

import java.util.TreeSet;

public class Repertoir  {
	String nom;
	double taill ;
	static TreeSet<Dossier> ensD= new TreeSet<>();
	Repertoir(String nom, double taill){
		this.nom=nom;
		this.taill= taill;
	}

}

