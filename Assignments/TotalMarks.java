public class TotalMarks
 {
    public static void main(String[] args)
 {
        
        int hindi = 80;
        int english = 85;
        int math = 90;
        int physics = 85;
        int chemistry = 99;

        
        int totalMarks = hindi + english + math + physics + chemistry;

        
        int maxMarks = 500;

        
        double percentage = (double) totalMarks / maxMarks * 100;

        
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.println("Percentage: " + percentage + "%");
    }
}

