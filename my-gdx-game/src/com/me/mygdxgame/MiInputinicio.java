package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInputinicio extends InputListener{
	pausa h;
	MiInputinicio(pausa param)
	{
		super();
		
		h= param;
	}
	
	

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)	{
		System.out.println("pausa");
		pausa.pausado=!pausa.pausado;
		return true;
		
			
		}
	}

