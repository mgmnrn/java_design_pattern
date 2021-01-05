package com.company.template;

public class Flipkart extends ProcessOrder {
	@Override
	public void selectProduct() {
		// TODO Auto-generated method stub
		System.out.println(" Онлайн худалдаа");
		System.out.println(" Хэрэгтэй бараагаа хайж байна.");
		System.out.println(" Карт руугаа нэмлээ");
		System.out.println(" Төлбөрөө хийхээр явлаа.");
	}
	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println(" Хаягаа орууллаа.");
		System.out.println(" Төлбөрийн хэлбэрээ сонголоо.");
		System.out.println(" Төлбөрөө хийлээ.");
	}
	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println(" Таны бараа 3-4 ажлын өдрийн дотор хүргэгдэнэ.");
		System.out.println(" Ахиж худалдан авалт хийх үү. Баярлалаа");
		System.out.println(" ---------------------------");
	}
}
