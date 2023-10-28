import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();


    public char[] buildAZ(){
        char[] az = new char[52];
        int position = 0;
        for(char c = 'A'; c <= 'Z'; ++c) {
            az[position] = c;
            position++;
        }
        for(char c = 'a'; c <= 'z'; ++c) {
            az[position] = c;
            position++;
        }
        return az;
    }

    public int[] getTenRolls(){
        int[] rollsArray = new int[10];
        int randInt = 0;
        for(int i = 0; i < 10 ; i++){
            randInt = randMachine.nextInt(20)+1;
            rollsArray[i] = randInt;
        }
        return rollsArray;
    }

    public char getRandomLetter(){
        char[] az = buildAZ();
        return az[randMachine.nextInt(52)];
    }

    public String generatePassword(){
        String password = new String();
        for (int i = 0 ; i<8;i++){
            password += getRandomLetter();
        }
        // System.out.println(password);
        return password;
    }
    public String[] getNewPasswordSet(int setSize){
        String[] passwordArray = new String[setSize];
        for(int i = 0 ; i<setSize;i++){
            passwordArray[i] = generatePassword();
            // System.out.println(passwordArray[i]);
        }
        return passwordArray;
    }

    public String shuffleArray(char[] charArray,int shuffles){
        int arraySize = charArray.length;
        int fromPosition;
        int toPosition;
        char tempChar;
        for(int i=0 ; i<shuffles;i++){
            fromPosition = randMachine.nextInt(arraySize);
            toPosition = randMachine.nextInt(arraySize);
            tempChar = charArray[fromPosition];
            charArray[fromPosition] = charArray[toPosition];
            charArray[toPosition] = tempChar;
        }
        return new String(charArray);
    }
}
