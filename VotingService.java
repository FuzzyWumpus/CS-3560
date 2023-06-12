

public class VotingService {
   
   
    private int Anum;
    private int Bnum;
    private int Cnum;
    private int Dnum;
    private int Tnum;
    private int Fnum;
    private int questionFormat;
    
    

    public void ConfigureSCQ(int questionNum ) {
        
       if (questionNum == 5 || questionNum == 6) {
        questionFormat = 1;
       }

    }

    //Keeps track of how many times each choice was chosen for SCQ
    public void submitSCQ(Student student){
        
        char answer = (student.getStudentAnswer()).charAt(0);
        
        if (answer == 'A') {
            Anum++;
        } 
        else if(answer == 'B') {
            Bnum++;
        }
        else if (answer == 'C') {
            Cnum++;
        }
        else if (answer == 'D') {
            Dnum++;
        }
        
    }  

     //Keeps track of how many times each choice was chosen for SCQ true or false
        public void submitTF(Student student){

            char answer = (student.getStudentAnswer()).charAt(0);
            
            if (answer == 'T') {
                Tnum++;
            }
            else if (answer == 'F') {
                Fnum++;
            }
        }
    
         //Keeps track of how many times each choice was chosen for MCQ
         public void submitMCQ(Student student, int numChoices){
            
            for (int i = 0; i < numChoices; i++){
            char answer = (student.getStudentAnswer()).charAt(i);
            System.out.println("choice: " + answer);

            if (answer == 'A') {
                Anum++;
            } 
            else if(answer == 'B') {
                Bnum++;
            }
            else if (answer == 'C') {
                Cnum++;
            }
            else if (answer == 'D') {
                Dnum++;
            }
         }
        }  

    public void results(Question Q) {
        //Tracks the questionFormat between A-D answer questions and true or false questions so it correctly outputs statistics
        if (questionFormat == 0)
        System.out.println("Stats from this round\nA : " + Anum + "\nB : " + Bnum + "\nC : " + Cnum + "\nD : " + Dnum);
        else {
            System.out.println("Stats from this round\nT : " + Tnum + "\nF : " + Fnum );    
        }
        System.out.println("The correct answer is: " + Q.getanswer());
        //Resets the count for the next question
        Anum = 0;
        Bnum = 0;
        Cnum = 0;
        Dnum = 0;
        Tnum = 0;
        Fnum = 0;
        questionFormat = 0;
    }
}
