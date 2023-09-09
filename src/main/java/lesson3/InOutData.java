package lesson3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InOutData {
    public String inputString;
    public String outputString;
    private StringBuilder specialString;

    public void inputLongString(){
//        inputString = "Ivanov Ivan Jovanovich 12.12.2023 88888888888 m";
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string separated by a space:  " +
                "Surname First name Patronymic Date of birth Phone number Gender\n : ");
        inputString = in.nextLine();

    }
    public CharSequence createSpecialString(String[] data){
        specialString = new StringBuilder("");
        for (int i = 0; i < data.length; i++){
            specialString.append("<");
            specialString.append(data[i]);
            specialString.append(">");
        }
        specialString.append("\n");
        return specialString;
    }
    public void savingDataToFile(String[] data){
        try (FileWriter fr = new FileWriter(data[0],true)){
            fr.append(createSpecialString(data));
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
}
