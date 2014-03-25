package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;



public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private Image i;
	pausa h;
	Stage s;
	ArrayList<Sprite>sprites=new ArrayList<Sprite>();
	ArrayList<Pelotita>pelotitas=new ArrayList<Pelotita>();
	ArrayList<PelotitaMala>pelotitasmalas=new ArrayList<PelotitaMala>();
	
	int rotacion=0;
	
	@Override
	public void create()
	{		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("data/fondo.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		sprite = new Sprite(region);
		
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);
		
		
		
		s=new Stage();
		i=new Image(texture);
		s.addActor(i);
		
		Gdx.input.setInputProcessor(s);
		pausa gh= new pausa();
		s.addActor(gh);
		
		
		for(int i=0; i<=10; i++)
		{
			
			Pelotita p = new Pelotita((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(p);
			pelotitas.add(p);
		}
		
		salir gameover= new salir();
		
		 
		for(int e=0; e<9; e++)
		{
			PelotitaMala t = new PelotitaMala((int)(Math.random()*1000%w),(int)(Math.random()*1000%h),gameover);
			s.addActor(t);
			pelotitasmalas.add(t);
		}
		
		
		gameover.setVisible(false);
		s.addActor(gameover);
		
		inicio as= new inicio();
		s.addActor(as);
		
		
		
		
		
		
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {	
		sprite.setRotation(rotacion);
		
		
		Gdx.gl.glClearColor(4.5f, 8.3f, 2.2f, 8.2f);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		
		if(!pausa.pausado)
		{
		
		s.act();
		
		}
		s.draw();
	}
	
	

	@Override
	public void resize(int width, int height) {
	}

	
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
