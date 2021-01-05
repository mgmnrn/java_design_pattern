package com.company;


class Loan {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public Loan(int amount) {
        this.amount = amount;
    }
}

abstract class LoanApproval{

    protected LoanApproval nextLoanApproval;

    public void setNextLoanApproval(LoanApproval nextLoanApproval) {
        this.nextLoanApproval=nextLoanApproval;
    }
    public abstract void approveLoan(Loan loan);
}

class Manager extends LoanApproval{

    public void approveLoan(Loan loan){
        if (loan.getAmount()<=100000) {
            System.out.println("Менежер зөвшөөрсөн");
        }
        else
            nextLoanApproval.approveLoan(loan);
    }
}
class Director extends LoanApproval{
    public void approveLoan(Loan loan){
        if (loan.getAmount()<=1000000) {
            System.out.println("Захирал зөвшөөрсөн");
        }
        else
            nextLoanApproval.approveLoan(loan);
    }
}

class VicePresident extends LoanApproval{
    public void approveLoan(Loan loan){
        System.out.println("Дэд ерөнхийлөгч зөвшөөрсөн");
    }

}

public class ChainOf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LoanApproval m=new Manager();
        LoanApproval d=new Director();
        LoanApproval vp=new VicePresident();

        m.setNextLoanApproval(d);
        d.setNextLoanApproval(vp);

        m.approveLoan(new Loan(1000001));
    }
}