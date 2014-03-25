package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class inputsalir extends InputListener{
	salir gameover ;
	inputsalir(salir p){
		super();
		gameover=p;
		
	}

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
	    gameover.setVisible(true);
		return false;
	}

}

 