package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;



public class MiInputMala extends InputListener{
	PelotitaMala t;
     salir gameover;
	MiInputMala(PelotitaMala param,salir p)
	{
		super();
		t = param;
		gameover = p;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
	    if(!pausa.pausado){
		
        gameover.setVisible(true);
	    }
		return true;
	}

}
