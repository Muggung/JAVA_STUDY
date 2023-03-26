package com.inter_face.run;

import com.inter_face.pratice.champion.Champion;
import com.inter_face.pratice.champion.Darius;
import com.inter_face.pratice.champion.Garen;

public class Run {

	public static void main(String[] args) {
		Champion garen = new Garen(100, 0, 50, 40);
		Champion darius = new Darius(100, 100, 52, 40);
		
		garen.attack();
		darius.defense();
		
		((Garen)garen).assassinCrow();
		garen.skill();
		darius.die();;
	}

}
