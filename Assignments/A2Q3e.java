public class A2Q3e { 
        public static void pow(int i, int pow){
            int result=1;
            for( int j=0; j<i; j++){
                result*=pow;
            }
            System.out.println(result);
        }
        public static void main(String[] args)
        {
            for( int i=1; i<=5; i++)
            {

                pow(i,i);
            }

            
        }
    
}
