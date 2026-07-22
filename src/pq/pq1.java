//Programming Question 1: What will be the output of the following Java program?
package pq;

class pq1 
    {
        public static void main(String args[]) 
        {
            try 
            {
                System.out.print("Hello" + " " + 1 / 0);
            }
            catch(ArithmeticException e) 
            {
        	System.out.print("World");        	
            }
        }
}