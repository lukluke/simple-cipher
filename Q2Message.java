/**
 * This class represents a message entity. 
 * It is used to store a piece of text that could be a plaintext or ciphertext for encryption or decryption.
 * The text comes along with a key that is used to encrypt or decrypt the text.
 *
 * @author Luke
 */
public class Q2Message {

    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ,.";
    private String key="Hzdwtin8GQNP1KFRklE9vocWsDhBAMmYOfj,.6SpC57aeU VJ4Zr0ybLXTx2guqI3";     // a permutation of the alphabets
    private String text="Hello World";    // store either the plaintext or ciphertext

    /*** provide other entity properties and methods as appropriate ***/
    public void setKey(String key) {
        this.key = key;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getKey() {
        return key;
    }
    
    public String getText() {
        return text;
    }

    /**
     * Encrypt the property 'text' (plain) with a given 'key'.
     * 
     * @return the encrypted text
     */
    String encrypt() {
        String encryptOutput = "";
        
        for (int i=0; i<text.length(); i++) {
            for (int j=0; j<65; j++) {
                if (text.charAt(i) == ALPHABET.charAt(j)) {
                    encryptOutput += key.charAt(j);
                }
            }
        }
        
        return encryptOutput;
    }

    /**
     * Decrypt the property 'text' (cipher) with a given 'key'.
     *
     * @return the decrypted text
     */
    String decrypt() {
        String decryptOutput = "";
        
        for (int i=0; i<text.length(); i++) {
            for (int j=0; j<65; j++) {
                if (text.charAt(i) == key.charAt(j)) {
                    decryptOutput += ALPHABET.charAt(j);
                }
            }
        }
        
        return decryptOutput;
    }
}
