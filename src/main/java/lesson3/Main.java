package lesson3;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {


        InOutData inOutData = new InOutData();
        StringAnalysis stringAnalysis = new StringAnalysis();
        DataAnalysis dataAnalysis = new DataAnalysis();
        PersonData personData = new PersonData(inOutData, stringAnalysis, dataAnalysis);
        personData.personGo();
    }
}
