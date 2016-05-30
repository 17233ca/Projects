package com.as.aniket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

//package com.npu.algo;

/**
 * File Name: PowerBall.java
 * 
 * @author Aniket Choudhury
 * @year 20156
 */
/*
 * To compile you require: IntUtil.java RandomInt.java PowerBall.java
 */

class PowerBall {
  /*
   * ALL PRIVATE DATA BELOW
   */
  private static int[] winningNumber ;
  private static int[] ticketNumber ;
  private long cash ;
  static private IntUtil u = new IntUtil();
  public static PowerBall p1;
  public PowerBall(){
      
  }

    public static void check(){
        
    //PowerBall obj = new PowerBall();
    int count = 0;    

//*****************case1*************************************************        
        int[] temp5 = new int[6];
        for(int i=0; i<ticketNumber.length-1;i++){
            temp5[i] = ticketNumber[i];    
        }

        int[] won5 = new int[6];
        for(int i=0; i<ticketNumber.length-1;i++){
            won5[i] = ticketNumber[i];    
        }
//*****************case2***************************************************
        int[] lTemp = new int[1];
        lTemp[0] = ticketNumber[ticketNumber.length-1];
   
        int[] lWon = new int[1];
        lWon[0] = winningNumber[winningNumber.length-1];
     
        for(int i=0; i<ticketNumber.length-1;i++){
            for(int j=0; j<winningNumber.length-1; j++){
                if(ticketNumber[i] == winningNumber[j]){
                    count = count + 1;
        
                        }
                        
                    }
                }
                
                
                if(count == 5 && Arrays.equals(lTemp, lWon)){
                    System.out.println("You won a jackpot");
                    p1 = new PowerBall();
                    p1.setCash(0);
                    p1.getCash();
                }
                else if(count==5){
                    System.out.println("You won cash = $1000,000");
                    p1 = new PowerBall();
                    p1.setCash(1000000);
                    p1.getCash();
                }
                else if(count==4 && Arrays.equals(lTemp, lWon)){
                    System.out.println("You won cash = $50,000");
                    p1 = new PowerBall();
                    p1.setCash(50000);
                    p1.getCash();
                }
                else if(count==4){
                    System.out.println("You won cash = $100");
                    p1 = new PowerBall();
                    p1.setCash(100);
                    p1.getCash();
                }
                else if(count==3 && Arrays.equals(lTemp, lWon)){
                    System.out.println("You won cash = $100");
                    p1 = new PowerBall();
                    p1.setCash(100);
                    p1.getCash();
                }
                else if(count==3){
                    System.out.println("You won cash = $7");
                    p1 = new PowerBall();
                    p1.setCash(7);
                    p1.getCash();
                }
                else if(count==2 && Arrays.equals(lTemp, lWon)){
                    System.out.println("You won cash = $7");
                    p1 = new PowerBall();
                    p1.setCash(7);
                    p1.getCash();
                }
                else if(count==1 && Arrays.equals(lTemp, lWon)){
                    System.out.println("You won cash = $4");
                    p1 = new PowerBall();
                    p1.setCash(4);
                    p1.getCash();
                }
                else if(Arrays.equals(lTemp, lWon)){
                    System.out.println("You won cash = $4");
                    p1 = new PowerBall();
                    p1.setCash(4);
                    p1.getCash();
                }
                else{
                    System.out.println("you lost!!");
                    p1 = new PowerBall();
                    p1.setCash(0);
                    p1.getCash();
                    
                }
    }  

    public long getCash() {
        
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
        
    }
    
    
    public long cash(){//**********************************cash() method*******************
        
        return p1.getCash();
    }

  //YOU CANNOT CHANGE ANYTHING BELOW

  PowerBall(int[] w, int [] t) {
    winningNumber = w ;
    ticketNumber = t ;
    cash = 0 ;
    check() ;
  }
  
  private static void test1() {
      
    int[] w = {8,4,19,24,27,10} ;
    {
      int [] n= {4,8,19,27,24,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {24,27,19,8,4,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {24,27,19,8,4,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,124,19,119,18,14} ;
      PowerBall x = new PowerBall(w,n);
      
     
    }  
    
  }
  
  private static void testRandom() {
    int[] w = {4,8,19,27,24,10} ;
    int max = 10000 ;
    long c = 0 ;
    for (int i = 0; i < max; ++i) {    
      int [] n = u.generateRandomNumber(6,true,1,99);
      PowerBall x = new PowerBall(w,n); 
      c = c + x.cash();
      
    }
    System.out.println("Out of " + max + " times you win " + c + "$") ;
  }
  
  private static void testBench() {
    test1() ;
    testRandom() ;
  }
  
  public static void main(String[] args) {
    System.out.println("PowerBall.java");
    testBench();
    System.out.println("Done");
  }
  
}