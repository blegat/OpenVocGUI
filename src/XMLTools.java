import java.beans.PersistenceDelegate;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * /!\ Property must be an object not null to be printed
 *     There must exist a default constructor without any argument
 *     If a value is the default value, it is not stored to save place
 */

public final class XMLTools {

    private XMLTools() {}
	
    /**
     * Deserialisation d'un objet depuis un fichier
     * @param object objet a deserialiser
     * @param filename chemin du fichier
     */
    public static Object decodeFromFile(String fileName) throws FileNotFoundException, IOException {
        // ouverture du decodeur vers le fichier
        XMLDecoder decoder = new XMLDecoder(new FileInputStream(fileName));
        try {
            // deserialisation de l'objet
            Object object = decoder.readObject();
			return object;
        } finally {
            // fermeture du decodeur
            decoder.close();
        }
    }
	/**
     * Serialisation d'un objet dans un fichier
     * @param object objet a serialiser
     * @param filename chemin du fichier
     */
    public static void encodeToFile(Object object, String fileName) throws FileNotFoundException, IOException {
        // ouverture de l'encodeur vers le fichier
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fileName));
        try {
            // serialisation de l'objet
            encoder.writeObject(object);
            encoder.flush();
        } finally {
            // fermeture de l'encodeur
            encoder.close();
        }
    }
}
