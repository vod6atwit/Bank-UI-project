// Programmer Duy VO
// CIT 285

package bankUI;

import java.io.Serializable;

public class AccountRecord implements Serializable { 

    private static final long serialVersionUID = 3417040053089159204L;
    private int account;
    private String firstName;
    private String lastName;
    private char gender;
    private String address;
    private String socsec;
    private double balance;
    private String title;
    private double transactionAmount;
    //private double gpa;

    // no-argument constructor calls other constructor with
    // default values
    public AccountRecord() {
        this(0, "", "", ' ', "", "", 0, "", 0); // default way of private variables.
    }

    // initialize a record
    public AccountRecord(int acct, String first, String last, char genDer, String address,
            String socsec, double balance, String title, double transactionAmount) {
        setAccount(acct);
        setFirstName(first);
        setLastName(last);
        setGender(genDer);
        setAddress(address);
        setSocsec(socsec);
        setBalance(balance);
        setTitle(title);
        setTransactionAmount(transactionAmount);
    }

    // set account number
    public void setAccount(int account) {
        this.account = account;
    }

    // get account number
    public int getAccount() {
        return account;
    }

    // set first name
    public void setFirstName(String first) {
        this.firstName = first;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // set last name
    public void setLastName(String last) {
        this.lastName = last;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // set gender
    public void setGender(char genDer) {
        this.gender = genDer;
    }

    // get gender
    public char getGender() {
        return gender;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    // get address
    public String getAdress() {
        return address;
    }

    private void setSocsec(String socsec) {
        this.socsec = socsec;
    }

    // get socsec
    public String getSocsec() {
        return socsec;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    // get balance
    public double getBalance() {
        return balance;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    // get title
    public String getTitle() {
        return title;
    }

    private void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    // get gender
    public double getTransactionAmount() {
        return transactionAmount;
    }
} // end class AccountRecord

