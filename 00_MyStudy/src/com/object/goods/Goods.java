package com.object.goods;

public class Goods {
	/*
	 * 1. 상품 클래스를 생성한다.
	 * 2. 상품번호, 상품타입, 상품이름, 상품가격, 상품할인율, 상품재고를 필드에 선언
	 * 3. 모든 필드는 외부에서 접근 가능
	 * 4. 상품타입, 상품이름, 상품가격, 상품할인율, 상품재고는 설정가능
	 * 5. 객체 생성 후 내용 출력, 생성은 매개변수로 생성자로 할 것
	 */
	public static int count;
	public int no;
	public String type;
	public String name;
	public int price;
	public double sale;
	public int inven;
	
	{
		no = count++;
	}
	
	public Goods() {
		this.no = 1;
		this.type = "카테고리";
		this.name = "제품이름";
		this.price = 1;
		this.sale = 0.0;
		this.inven = 1;
	}
	
	public Goods(String type, String name, int price, double sale, int inven) {
		this.no = count;
		setType(type);
		setName(name);
		setPrice(price);
		setSale(sale);
		setInven(inven);
	}

	public int getNo() {
		return no;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public int getInven() {
		return inven;
	}

	public void setInven(int inven) {
		this.inven = inven;
	}
	
	public String infoGoods() {
		return this.no + " " + this.type + " " + this.name + " " + this.price + " " + this.sale + " " + this.inven; 
	}
}
