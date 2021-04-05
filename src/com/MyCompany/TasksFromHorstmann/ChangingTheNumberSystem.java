package com.BestCompany;

public class ChangingTheNumberSystem {

    private int numberForChange;

    public ChangingTheNumberSystem(int number) {
        this.numberForChange = number;
    }

    public StringBuilder binary(int num) {
        int tempB = 0;
        StringBuilder res = new StringBuilder();
        while(num != 0) {
            tempB = num % 2;
            res.append(tempB);
            num /=2;
        }
        return res.reverse();
    }

    public StringBuilder octal(int num) {
        int temp = 0;
        StringBuilder res = new StringBuilder();
        while(num != 0) {
            temp = num % 8;
            res.append(temp);
            num /=8;
        }
        return res.reverse();
    }

    public StringBuilder hexadecimal(int num) {
        int temp = 0;
        StringBuilder res = new StringBuilder();
        while(num != 0) {
            temp = num % 16;
            if(temp >= 10 && temp <= 16) {
                        switch (temp) {
                            case 10:
                                res.append("A");
                                break;
                            case 11:
                                res.append("B");
                                break;
                            case 12:
                                res.append("C");
                                break;
                            case 13:
                                res.append("D");
                                break;
                            case 14:
                                res.append("E");
                                break;
                            case 15:
                                res.append("F");
                                break;
                        }
                }
            else {
                res.append(temp);
            }
            num /= 16;
        }
        return res.reverse();
    }

    public int getNumberForChange() {
        return this.numberForChange;
    }
};
