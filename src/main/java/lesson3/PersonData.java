package lesson3;

import java.text.ParseException;

public class PersonData {
    InOutData inOutData;
    StringAnalysis stringAnalysis;
    DataAnalysis dataAnalysis;

    public PersonData(InOutData inOutData, StringAnalysis stringAnalysis, DataAnalysis dataAnalysis) {
        this.inOutData = inOutData;
        this.stringAnalysis = stringAnalysis;
        this.dataAnalysis = dataAnalysis;
    }

    private void dataVerification(){
        inOutData.inputLongString();
        stringAnalysis.anayssisString = inOutData.inputString;
        try {
            stringAnalysis.analys();
        } catch (InvalidInputLess e) {
            System.out.println(e.getMessage());
            System.out.println("Try again!");
            dataVerification();
        } catch (InvalidInputMore e) {
            System.out.println(e.getMessage());
            System.out.println("Try again!");
            dataVerification();
        }
    }

    private void dataCheck(DataAnalysis dataAnalysis, StringAnalysis stringAnalysis)
            throws ParseException, StringFormatException
             {
        dataAnalysis.setData(stringAnalysis.data);
        try {
            dataAnalysis.checkData();
        } catch (StringFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Try again!");
            personGo();
        } catch (ParseDateException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again!");
            personGo();
        } catch (PhoneNumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Try again!");
            personGo();
        }
    }

    public void personGo() throws ParseException {

        this.dataVerification();
        this.dataAnalysis.setData(stringAnalysis.data);
        dataCheck(dataAnalysis, stringAnalysis);
        inOutData.savingDataToFile(dataAnalysis.getData());
    }
}
