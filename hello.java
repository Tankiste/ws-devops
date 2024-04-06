
public class hello {

    public static void main(String[] args) {
        //Création de la chaine
	String MaChaine = "Debut\n";
	for (int i=0; i<10; i++)
		for (int j=2; j<11;j+=2)
			for (int g=3; g<12; g+=3){
				for (int h=i+j+g; h<100;h++)
					MaChaine+= h + " ";
				MaChaine += "\n";
			}
	AfficheOuEcrit Aff1 = new AfficheOuEcrit(2);
	Aff1.AfficheOuEcrit(MaChaine);
	Aff1.methode = 1;
	Aff1.AfficheOuEcrit(MaChaine);
	AfficheOuEcritEtAffiche Ecr2 = new AfficheOuEcritEtAffiche(1);
	Ecr2.AfficheOuEcrit(MaChaine);
    }

}

