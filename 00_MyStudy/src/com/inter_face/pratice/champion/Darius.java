package com.inter_face.pratice.champion;

public class Darius extends Champion{
	public Darius() {}
	
	public Darius (int hp, int mp, int power, int defense) {
		super(hp, mp, power, defense);
		setHp(hp);
		setMp(mp);
		setPower(power);
		setDefense(defense);
	}
	
	@Override
	public void attack() {
		System.out.println("다리우스의 기본 공격! " + this.getPower() + "데미지!");
	}
	
	@Override
	public void defense() {
		System.out.println("다리우스의 방어! " + this.getDefense() + "만큼 방어!");
	}
	
	@Override
	public void skill() {
		System.out.println("다리우스의 스킬 발동! 적을 처치!");
	}
}
