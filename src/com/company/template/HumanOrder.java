package com.company.template;

public class HumanOrder extends ProcessOrder{
    @Override
    public void selectProduct() {
        System.out.println(" Хүнээр дамжуулах худалдаа");
        System.out.println(" Авах бараагаа хүнд хэлэх");
    }

    @Override
    public void makePayment() {
        System.out.println(" Хүнд мөнгөө төлнө");
        System.out.println(" Төлбөрөө хийлээ.");
        System.out.println(" Төлбөр төлсөн баримтаа авлаа.");
    }

    @Override
    public void deliver() {
        System.out.println(" Хүнээс бараагаа авлаа.");
        System.out.println(" ИБаримт аа араас нь авлаа.");
        System.out.println(" Баярлалаа");
    }
}
