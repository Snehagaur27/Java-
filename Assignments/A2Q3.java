public class A2Q3 {
    public static void main(String[] args) {
        
        int   previous=0 , current=1, n=10;
        for(int i=1; i<=n; i++)
        {
            System.out.println( current);
            int next=previous + current;
            previous = current;
            current = next;

        }

    
    }  

    }
