package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;;;


public class inicio extends Image {
	
	public inicio()
	{
		super(new Texture("data/inicio3.png"));
		
		this.addListener(new inputinicio(this));
	}

}
