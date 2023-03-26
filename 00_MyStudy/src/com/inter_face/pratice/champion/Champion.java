package com.inter_face.pratice.champion;

public abstract class Champion {
	private int hp;
	private int mp;
	private int power;
	private int defense;
	
	protected Champion() {}

	protected Champion(int hp, int mp, int power, int defense) {
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.defense = defense;
	}
	
	public abstract void attack();
	
	public abstract void defense();
	
	public abstract void skill();
	
	public void die() {
		System.out.println("적에게 당했습니다.");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
