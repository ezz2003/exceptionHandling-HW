package lesson3;

public class StringAnalysis {
    public String anayssisString;
    public String[] data;

    public void convertingToArray(){
        data = anayssisString.split(" ");
    }

    public void quantityAnalysis() throws InvalidInputLess, InvalidInputMore {
        if (data.length < 6){
            throw new InvalidInputLess("code 001 Not enough parameters for the table");
        }
        if (data.length > 6){
            throw new InvalidInputMore("code 002 Redundant parameters for the table");
        }
    }

    public void analys() throws InvalidInputLess, InvalidInputMore {
        convertingToArray();
        quantityAnalysis();
    }
}
