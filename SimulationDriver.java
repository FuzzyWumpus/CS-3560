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
    
        if(questionType == 0) { 
            SCQ = true;
        } else {
            MCQ = true;
        }

        if(SCQ == true) {
            int j = 0;
            String randAnswer;
            String possibleAnswers = "ABCD";
            String possibleAnswersTF = "TF";
            int questionNumber = rand.nextInt(6) + 1;
            System.out.println(questionNumber);
            question.createSCQ(questionNumber);
            //Lets know the voting service know if its a A-D answer question or True/False answer question.
            vote.ConfigureSCQ(questionNumber);
            if (questionNumber == 5 || questionNumber == 6)
            {
                for (j = 0; j < numStudents; j++) {
                    Student testStudent = new Student();
                    randAnswer = String.valueOf(possibleAnswersTF.charAt(rand.nextInt(possibleAnswersTF.length())));
                    testStudent.setStudentAnswer(randAnswer);
                    vote.submitTF(testStudent);
                }   

            }
           else {
                for (j = 0; j < numStudents; j++) {
                    Student testStudent = new Student();

                    randAnswer = String.valueOf(possibleAnswers.charAt(rand.nextInt(possibleAnswers.length())));
                    testStudent.setStudentAnswer(randAnswer);
                    vote.submitSCQ(testStudent);
                }   
           
           
           }
    
        vote.results(question);
       
        SCQ = false;
        
    }
   // Start of the Multiple choice question simulation.
        if(MCQ == true) {
        
        int numChoicePicked;
        int questionNumber = rand.nextInt(5) + 1;
        
        question.createMCQ(questionNumber);
        
        /*For this I used a method similar to the generating random strings for StudentIDS 
          Uses stringbuilder in order to delete already choosen answers to elimate repeat answers.*/
            for (int j = 0; j < numStudents; j++) {
                StringBuffer randomAnswer = new StringBuffer(5);
                Student testStudent = new Student();
                String possibleAnswers = "ABCD";
                numChoicePicked = rand.nextInt(3) + 1;
                StringBuilder answers = new StringBuilder(possibleAnswers);
                for (int y = 0; y < numChoicePicked; y++) {
                    
                    int randomIndex = rand.nextInt(answers.length());
                    char randomChar = answers.charAt(randomIndex);
                    randomAnswer.append(randomChar);
                    answers.deleteCharAt(randomIndex);
                }
                System.out.println(randomAnswer.toString());
                testStudent.setStudentAnswer(randomAnswer.toString());
                vote.submitMCQ(testStudent,numChoicePicked);
            }   
        

        vote.results(question);
        MCQ = false;
        }



    }
    

 }


}
