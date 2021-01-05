package com.company.template;

public class Shop extends ProcessOrder {
	@Override
	public void selectProduct() {
		// TODO Auto-generated method stub
		System.out.println(" Оффлайн худалдаа");
		System.out.println(" Хэрэгтэй бараагаа хайж байна.");
		
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println(" Касс руу явлаа..");
		System.out.println(" Дараалалд зогслоо.");
		System.out.println(" Төлбөрөө хийлээ.");
		System.out.println(" Төлбөр төлсөн баримтаа авлаа.");
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println(" Төлбөр төлсөн баримтаа үзүүллээ.");
		System.out.println(" Бараагаа олгох тасгаас авлаа.");
		System.out.println(" Манайхаар үйлчлүүлсэнд баярлалаа.");
		System.out.println(" ---------------------------");
	}
	
}
