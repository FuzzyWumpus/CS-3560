

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

    //Keeps track of how many times each choice was chosen
    public void submitSCQ(Student student){
        
        char answer = student.getStudentAnswer();
        System.out.println("Student picked: " + answer);
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


        public void submitTF(char answer){
            if (answer == 'T') {
                Tnum++;
            }
            else if (answer == 'F') {
                Fnum++;
            }
        }
    

    public void results(Question Q) {
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
