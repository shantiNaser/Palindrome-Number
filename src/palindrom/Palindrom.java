/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

import java.util.Scanner;


class myStack{
    private int top=0;
    private int array[];
    
    
    public myStack(int t){ // Constructer 
    t=10;   
    array=new int[t];
    top=0;   
    }
    
 
    public boolean isFull(){
       return top==array.length;
    }
    
    
    public boolean isEmpty(){
      return top==0;
    }
    
    
    public void push(int value){
      if(!isFull())
    array[top++]=value;
    }
    
    
   public int pop(){
if(!isEmpty())
    return array[--top];
    return -9999;
   }
   
    @Override
   protected void finalize () // destracter
     {
         System.out.println("the finilize is called...");
     }

    }

 // end class myStack


 class myQueue {
        
      private int array[];
      private int front=0;
      private int rear=0;


     public myQueue(int size){
      array=new int[size];
      rear=front=0;
     }

    
     public myQueue(){
       this(10);
     }
     
     
    public boolean isempty(){
      return rear==0;
    }
    
    
    public boolean isFull(){
      return front==rear;
    }
    
    
    public void add(int value){
       array[rear]=value;
       rear++;
    }


    public int Delete(){
      if(!isFull()){
      int savePoint=front;   
      front++;
      return array[savePoint];
     }
  return -9999;

}


    @Override
    protected void finalize () // destracter
     {
         System.out.println("the finilize is called...");
     }

    }   
// end class myQueue

    
    


public class Palindrom {

    
    public static void main(String[] args) {
      
        
         Scanner in = new Scanner(System.in);
         myStack st = new myStack(10);
         myQueue Q = new myQueue(10);
         
         System.out.println("please enter number to check if its Palindrome or Not >>");
         int number = in.nextInt();
         while(number!=0)
         {
             st.push(number%10);
             Q.add(number%10);
             number/=10;
             
         }
         
       
        
         while(!st.isEmpty()&&!Q.isempty())
         {
             if(st.pop()!=Q.Delete())
             {
                 System.out.println("Sorry, ---> This number is not palindrome");
             return;
             }
         }
         System.out.println("This number is palindrome..");
         
       
         
       
        
    
}
}
