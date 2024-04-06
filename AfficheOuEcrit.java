import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class AfficheOuEcrit {

        AfficheOuEcrit(int arg1){
                methode = arg1;
        }
        Integer methode;//1 pour Exrire 2 pour afficher
        Integer Get_methode (){  if (methode == null) {return null;}        else return methode;}
        void Set_methode (int param1) { methode = param1; }

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
				 if (writer != null) {writer.close();return 0;}
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

