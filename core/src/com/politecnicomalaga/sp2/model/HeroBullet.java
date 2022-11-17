package com.politecnicomalaga.sp2.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.politecnicomalaga.sp2.managers.AssetsManager;
import com.politecnicomalaga.sp2.managers.GameManager;
import com.politecnicomalaga.sp2.managers.SettingsManager;


public class HeroBullet extends Actor {

    private Animation<TextureRegion> skin;
    private PlayerSpaceShip player;

    private Rectangle body;


    public HeroBullet(PlayerSpaceShip player) {
        super();
        this.player = player;
        TextureAtlas atlas = new TextureAtlas(Gdx.files.internal(AssetsManager.ATLAS_PATH));
        skin = new Animation<TextureRegion>(SettingsManager.PLAYER_ANIMATION_TIME, atlas.findRegions(AssetsManager.REGION_EXPLOSION_NAME), Animation.PlayMode.LOOP);
        this.setBounds(0, 0, SettingsManager.PLAYER_SIZE,  SettingsManager.PLAYER_SIZE);
        this.setX(player.getX());
        this.setY(player.getY());
    }//PLAYERSPACESHIP

    public void resetPos() {
        setX(player.getX());
        setY(player.getY());
    }//RESETPOS

    public Rectangle getBody() {
        return body = new Rectangle((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }//GETBODY

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        TextureRegion currentFrame = skin.getKeyFrame(GameManager.getSingleton().getGameTime(), true);
        batch.draw(currentFrame, this.getX(), this.getY(), SettingsManager.PLAYER_SIZE,  SettingsManager.PLAYER_SIZE);
    }//DRAW
}//CLASS