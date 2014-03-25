package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class inputinicio extends InputListener{
	inicio a;
	inputinicio(inicio param){
		super();
		a=param;
		
	}

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
	    a.setVisible(false);
		return true;
	}

}

 