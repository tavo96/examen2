package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class pausa extends Image{
	static boolean pausado=false;
	

	public pausa() {
		super(new Texture("data/pausa.png"));
		addListener(new MiInputinicio(this));
	
		
	}

}
