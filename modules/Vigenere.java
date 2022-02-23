/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

/**
 *
 * @author letan
 */
public class Vigenere {
    
    private final static String text="abcdefghijklmnopqrstuvwxyz., ";
    
    private static int findChar(String p){
        return text.indexOf(p);
    }
    
    public static String encrypt(String input, String key){
        while(input.length()>key.length()){
            key+=key;
        }
        key = key.substring(0, input.length());
        
        String enString="";
        
        for(int i=0; i<input.length(); i++){
            int iInput = findChar(input.charAt(i)+"");
            int kInput = findChar(key.charAt(i)+"");
            int e = (iInput+kInput) % text.length();
            System.out.println("e: "+e);
            enString+=text.charAt(e);
        }
        
        return enString;
    }
    
    public static String decrypt(String enString, String key){
        while(enString.length()>key.length()){
            key+=key;
        }
        key = key.substring(0, enString.length());
        
        String input="";
        
        for(int i=0; i<enString.length(); i++){
            int iEn = findChar(enString.charAt(i)+"");
            int kInput = findChar(key.charAt(i)+"");
            int e = (iEn-kInput+text.length()) % text.length();
            input+=text.charAt(e);
        }
        
        return input;
    }
    
}
