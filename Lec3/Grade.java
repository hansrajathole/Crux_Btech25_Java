
public class Grade {
    public static void main(String[] args) {
        int marks = 89;

        if(marks >=80){
            System.out.println("Grade A");
        }
        else if(marks <80 && marks >=60){
            System.out.println("Grade b");
        }
        else if(marks < 60 && marks >= 40){
            System.out.println("Grade A");
        }
        else {
            System.out.println("Fail...");
        }

    }
}