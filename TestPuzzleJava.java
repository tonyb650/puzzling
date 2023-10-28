public class TestPuzzleJava {
    public static void main(String[] args){
        PuzzleJava myPuzzle = new PuzzleJava();

        System.out.println("\n<-------Ten Rolls Generator ------->");
        int[] rolls = myPuzzle.getTenRolls();
        System.out.println(rolls[0]);
        
        System.out.println("\n<-------Random Letter Generator ------->");
        char letter = myPuzzle.getRandomLetter();
        System.out.println(letter);

        System.out.println("\n<-------Single Password Generator ------->");
        System.out.println(myPuzzle.generatePassword());

        System.out.println("\n<-------Password Set Generator ------->");
        String[] passwordSet = myPuzzle.getNewPasswordSet(4);
        // for(int i = 0; i<passwordSet.length; i++){
        //     System.out.println(passwordSet[i]);
        // }
            
        System.out.println("\n<-------Shuffle Array ------->");
        System.out.println(myPuzzle.shuffleArray(myPuzzle.buildAZ(),50));
    }
}
