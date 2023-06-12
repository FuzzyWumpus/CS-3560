public class Question {
    
    private String answer;

    
    //returns the correct answer for the current question
    public String getanswer(){
        return this.answer;

    }


    //Picks a multiple choice question from the list
    public void createMCQ(int questionNum) {
    switch(questionNum) {
        case 1:
        System.out.println("What countries made up the original Axis powers in World War II \nA: Russia \nB: Japan \nC: Italy \nD: Germany ");
        answer = "B, C, and D";
        break;
        case 2:
        System.out.println("Which of these are mammals? \nA: Dogs \nB: Lizards \nC: Cats \nD: Eagles ");
        answer = "A and C";
        break;
        case 3:
        System.out.println("Which of these countries are in Europe? \nA: France \nB: China \nC: Germany \nD: Finland ");
        answer = "A, C, and D";
        break;
        case 4:
        System.out.println("Which of these are chess pieces? \nA: King \nB: Bishop \nC: Squire \nD: Castle ");
        answer = "A and B";
        break;
        case 5:
        System.out.println("Which animal appears in the Chinese zodiac?? \nA: Dragon \nB: Rabbit \nC: Dog \nD: Hummingbird ");
        answer = "A, B, and C";
        break;


    }
    }
    //Picks a single choice question from the list
    public void createSCQ(int questionNum){
        switch(questionNum) {
            case 1:
            System.out.println("What is 10 + 11 \nA: 21 \nB: 20 \nC: 1011 \nD: 22 ");
            answer = "A";
            break;
            case 2:
            System.out.println("What does \"www\" stand for in a website browser? \nA: Willy's Wacky Web \nB: World Wide Web \nC: World Web Wide \nD: Wide World Web");
            answer = "B";
            break;
            case 3:
            System.out.println("What color is the circle in Japan's flag? \nA: Blue \nB: White \nC: Red \nD: Black");
            answer = "C";
            break;
            case 4:
            System.out.println("What is cynophobia? \nA: Fear of the cold \nB: A virus \nC: A disease like a cold \nD: Fear of dogs");
            answer = "D";
            break;
            case 5:
            System.out.println("Sharks are mammals \nT: True \nF: False");
            answer = "F";
            break;
            case 6:
            System.out.println("The blue whale is the biggest animal to have ever lived \nT: True \nF: False");
            answer = "T";
            break;


    }



    }

}
