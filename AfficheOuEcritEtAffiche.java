import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class AfficheOuEcritEtAffiche extends AfficheOuEcrit {
        AfficheOuEcritEtAffiche(int arg1) {super(arg1);}
        int AfficheOuEcrit (String ChaineAUtiliser) {
                if (methode == 1 || methode == null && methode != 2){
                        File file = new File("./mon-fichier.txt");
                        PrintWriter writer = null;
                        try {
                                writer = new PrintWriter(file);
                                writer.println(ChaineAUtiliser);
                        }
                        catch (FileNotFoundException e){
                        }
                        finally
                        {
                                if (writer != null) {	
					writer.close();
					System.out.println(ChaineAUtiliser);
                        		return 0; //no error
				}
                                 else return -1; //error
                        }
                }
                else if (methode == 2)
                {
                        //System.err.println(ChaineAUtiliser);
                        System.out.println(ChaineAUtiliser);
                        return 0; //no error
                }
        return -1; //Ce n'est pas normal d'arriver là
        }
}
