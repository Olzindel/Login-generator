package geco;

import java.nio.charset.Charset;
import java.util.Random;

/**
 * Classe permettant de générer des mots de passe
 */
public class PasswordGeneration {

    /**
     * Génère un mot de passe aléatoire de 8 caractères.
     *
     * @return le mot de passe généré.
     */
    public String getRandomPassword() {
        byte[] array = new byte[8];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    }
}
