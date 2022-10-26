package E3_3;

public class E3_3{
    protected char[] encoder = new char[28];
    protected char[] decoder = new char[28];

    public E3_3(int notation) 
    {
        for(int k =0; k<28; k++)
        {
            encoder[k] = (char) ('A' + (k+notation)%28);
            /* necesitamos cambiar aquí en arebic hay 28caracteres y necesitamos junst cambiar 26 a 28 y necesitamos cambiar A a la primera latterHebrewfirst latter */
            decoder[k] = (char) ('A' + (k-notation +28) % 28);
        }
    }
    /*Devuelve la transformación de la cadena original utilizando el código dado*/
    private String transform(String original, char[] code) 
    {
        char[] msg = original.toCharArray();
        for(int k = 0 ; k< msg.length; k++) {
        if(Character.isUpperCase(msg[k])) 
        {
            int j = msg[k] - 'A';
            msg[k] = code[j];
        }
        }return new String(msg);
    } /*Devuelve una cadena que representa el mensaje encriptado.*/
    public String encrypt(String message)
    {
        return transform(message, encoder);
    }/*Devuelve el mensaje descifrado dado el secreto cifrado */
    public String decrypt(String secret) {return transform(secret, decoder);
    }/*Método principal simple para probar el cifrado César*/
    public static void main(String[] args) 
    {
        E3_3 cipher = new E3_3(3);
        System.out.println("Codigo encriptado = " + new String(cipher.encoder));
        System.out.println("Codigo de descifrado = " + new String (cipher.decoder));
        String message = "ME GUSTA EL IDIOMA hebreo.";String coded = cipher.encrypt(message);
        System.out.println("secret0: " + coded);String answer = cipher.decrypt(coded);
        System.out.println("Mensaje: " + answer);
    }
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
