/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;

/**
 *
 * @author вики
 */
public class ABcheck {
    static boolean ABcheck(String str){
     int indexOfA=0, indexOfB=0;   
        boolean spacesBetweenAB=false;
    for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='a'){
    indexOfA=i;
    }
    if(str.charAt(i)=='b'){
    indexOfB=i;
    }
    int max=Math.max(indexOfB, indexOfA);
    int min= Math.min(indexOfB, indexOfA);
    if(max-min==4){
    spacesBetweenAB=true;
    break;
    }
    }
    return spacesBetweenAB;
    }
    
    public static void main(String [] args){
        System.out.println(ABcheck("Laurb soas"));
    }
    
}
