package com.object.goods;

public class GoodsRun {
	public static void main(String[] args) {
		Goods g1 = new Goods("자동차", "부릉", 3000000, 15, 5);
		Goods g2 = new Goods("핸드폰", "깜빡", 55000, 1, 10);
		Goods g3 = new Goods("마스크", "텁텁", 1500, 500, 0);
		
		System.out.println(g1.infoGoods());
		System.out.println(g2.infoGoods());
		System.out.println(g3.infoGoods());
	}
}
