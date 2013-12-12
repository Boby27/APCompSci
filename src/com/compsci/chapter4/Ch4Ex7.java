package com.compsci.chapter4;
public class Ch4Ex7{

     public static void main(String []args){
         int input = 1;
         boolean answer = false;
         int place = 1;
         while((input-squares(place) >= 0)){
             if (input-squares(place) == 0){
                answer = true;
             }
             place++;
         }  
         System.out.println(answer);
     }
     public static int squares(int p){
         int sum = 0;
         for(int j = 1;j<=p;j++){
            sum = sum + ((2*j) - 1);
        }
        return sum;
     }
     
     
}