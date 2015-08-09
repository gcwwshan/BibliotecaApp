package com.twu.biblioteca;


public class User {

    private String number;
    private String password;
    private String name;
    private String emailAddress;
    private String phoneNumber;

    public final static int UserNumberInfoIdex = 0;
    public final static int UserPasswordInfoIdex = 1;
    public final static int UserNameInfoIdex = 2;
    public final static int UserEmailAddressInfoIdex = 3;
    public final static int UserPhoneNumberInfoIdex = 4;

    public void setUserInfo(String info, int i){
        switch(i){
            case UserNumberInfoIdex:
                this.number = info;
                break;
            case UserPasswordInfoIdex:
                this.password = info;
                break;
            case UserNameInfoIdex:
                this.name = info;
            case UserEmailAddressInfoIdex:
                this.emailAddress = info;
            case UserPhoneNumberInfoIdex:
                this.phoneNumber = info;
                break;
        }
    }
    public String getUserInfo(int i){
        switch(i){
            case UserNumberInfoIdex:
                return this.number;
            case UserPasswordInfoIdex:
                return this.password;
            case UserNameInfoIdex:
                return this.name;
            case UserEmailAddressInfoIdex:
                return this.emailAddress;
            case UserPhoneNumberInfoIdex:
                return this.phoneNumber;
        }
        return null;
    }
}
