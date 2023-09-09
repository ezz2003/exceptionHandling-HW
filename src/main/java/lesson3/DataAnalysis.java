package lesson3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAnalysis {
    private String[] data;


    private void checkString (String part, String correction)  {
        if (!part.matches("^[A-Za-zА-Яа-я]{4,40}$")){
            throw new StringFormatException(correction);
        }
    }
    private void checkDate(String d) throws ParseDateException {
        try{
            DateFormat df = new SimpleDateFormat("MM.dd.yyyy");
            Date enteredDate = df.parse(d);
//            System.out.println("Date, with the default formatting: " + enteredDate);
        } catch (ParseException e) {
            throw new ParseDateException("Error input DATE", 1);
        }
    }
    private void checkPhoneNum(String num){
        if (!num.matches("^[0-9]{11}$")){
            throw new PhoneNumberFormatException(num + " Invalid phone number format");
        }
    }
    private void checkGender(String gender, String correction){
        if(!(gender.equals("m") || gender.equals("f")) ){
            throw new StringFormatException(correction);
        }
    }

    public void checkData() throws ParseDateException {
        checkString(data[0], "Last name");
        checkString(data[1], "First name");
        checkString(data[2], "Patronymic");
        checkDate(data[3]);
        checkPhoneNum(data[4]);
        checkGender(data[5], "Gender");
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }
}
