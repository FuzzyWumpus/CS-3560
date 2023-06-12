import java.util.Random;

public class SimulationDriver {
    

    public static void main(String [] args)
	{

         boolean SCQ = false;
         boolean MCQ = false;

        Random rand = new Random();
        //Randomly creates between 5-15 students for the duration of the program.
        int numStudents = rand.nextInt(10) + 5; 
       
        
        
        
        Question question = new Question();
        VotingService vote = new VotingService();


        /* Picks between a Single choice question and multiple choice question between each round. Each round is 1 question.
         Signle choice question has the another random choice between a true or false question, and a A-D choice question to improve varity */


        for (int i = 1; i < 6; i++) {
        System.out.print("\nQuestion " + i + "\n\n");
        int questionType = rand.nextInt(2);
    
        if(questionType == 0 || questionType == 1) { 
            SCQ = true;
        } else {
            MCQ = true;
        }

        if(SCQ == true) {
            int j = 0;
            char randAnswer;
            String possibleAnswers = "ABCD";
            int questionNumber = rand.nextInt(6) + 1;
            question.createSCQ(questionNumber);
            vote.ConfigureSCQ(questionNumber);

            
                System.out.println("Number of students: " + numStudents);
                for (j = 0; j < numStudents; j++) {
                    Student testStudent = new Student();

                    randAnswer = possibleAnswers.charAt(rand.nextInt(possibleAnswers.length()));
                    testStudent.setStudentAnswer(randAnswer);
                    vote.submitSCQ(testStudent);
                }   
           
           
            
    
        vote.results(question);
       
        SCQ = false;
        
    }
   // Start of the Multiple choice question simulation.
        if(MCQ == true) {
        int j = 0;
        int numChoicePicked;
        int questionNumber = rand.nextInt(5) + 1;
        char randAnswer;
        String possibleAnswers = "ABCD";
        question.createMCQ(questionNumber);
        
        while (j < numStudents) {
            for (int y = 0; y < numStudents; y++) {
                Student testStudent = new Student();

                randAnswer = possibleAnswers.charAt(rand.nextInt(possibleAnswers.length()));
                testStudent.setStudentAnswer(randAnswer);
                vote.submitSCQ(testStudent);
            }   
        j++;
        }

        vote.results(question);
        MCQ = false;
        }



    }
    

}


}
