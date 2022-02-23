/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.ArrayList;

/**
 *
 * @author letan
 */
public class Prime {
    
//    public static boolean isPrime(int n){
//        if(n<2) return false;
//        if(n==2) return true;
//        for(int i=2; i<=Math.sqrt(n); i++){
//            if(n%i==0) return false;
//        }
//        return true;
//    }
    
    public static ArrayList<String> findPrimeInArray(ArrayList<String> list){
        ArrayList<String> resultList = new ArrayList<>();
        ArrayList<String> primeList = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        do{
            String word = list.get(list.size()-1);
            primeList.add(word);
            list.remove(list.size()-1);
            int num = 1;
            while(list.indexOf(word)!=-1){
                int pos=list.indexOf(word);
//                primeList.add(list.get(pos));
                num++;
                list.remove(pos);
            }
            number.add(num);
        }while(!list.isEmpty());
        
        int max = number.get(0);
        for(int i:number){
            if(max<i){
                max=i;
            }
        }
        
        for(int i=0; i<number.size(); i++){
            if(max==number.get(i)){
                resultList.add(primeList.get(i)+": "+max);
            }
        }
        
        return resultList;
    }
    
}
