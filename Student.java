import java.util.Random;

public class Student {
    
private String StudentID;
private String answer;


//Randomly generates a alphanumeric string of length 5 to get a unique ID for each student using the random class.
public Student() {
    String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
 
    StringBuffer randomString = new StringBuffer(5);
    Random random = new Random();
 
    for (int i = 0; i < 5; i++) {
        int randomIndex = random.nextInt(alphanumericCharacters.length());
        char randomChar = alphanumericCharacters.charAt(randomIndex);
        randomString.append(randomChar);
    }
 
    StudentID = randomString.toString();

}

public String getStudentID() {
    return this.StudentID;

}

public String getStudentAnswer() {
    return this.answer;
}

public void setStudentAnswer(String A) {
    answer = A;
}

}
