package Models;

import java.util.ArrayList;

public class account_info {
    int AccountNumber;
    String SSN;
    String FirstName;
    String LastName;
    String Email;
    String PhoneNum;
    double BeginningBalance;
    ArrayList<stock_trade> Trades;

    public account_info(int accountNumber, String ssn, String firstName, 
    String lastName, String email, String phoneNum, double beginningBalance, ArrayList<stock_trade> trades) {
        super();
        AccountNumber = accountNumber;
        SSN = ssn;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        PhoneNum = phoneNum;
        BeginningBalance = beginningBalance;
        Trades = trades;
    }

    double CalculateEndingBalance(){
        double result = BeginningBalance;

        // Calculation Logic Here!!

        return result;
    }
}
