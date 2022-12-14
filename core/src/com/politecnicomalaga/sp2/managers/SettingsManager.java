package com.politecnicomalaga.sp2.managers;

///////////////
// CONSTANTS //
///////////////

public class SettingsManager {

    // WINDOW
    public static final short SCREEN_MID_WIDTH = 400;
    public static final short SCREEN_MID_HEIGHT = 330;
    public static final short SCREEN_WIDTH = SCREEN_MID_WIDTH*2;
    public static final short SCREEN_HEIGHT = SCREEN_MID_HEIGHT*2;

    // ACTOR
    public static final short PLAYER_SIZE = 32;
    public static final short ENEMY_SIZE = 32;
    public static final short PLAYER_HOR_POS = SCREEN_MID_WIDTH;
    public static final short PLAYER_VER_POS = 5;

    // SQUAD
    public static final short BATTALION_SIZE = 8;
    public static final short SQUAD_SIZE = 4;

    // SHOT
    public static final short PLAYER_BULLET_WIDTH = 8;
    public static final short PLAYER_BULLET_HEIGHT = 20;
    public static final short ENEMY_BULLET_WIDTH = 6;
    public static final short ENEMY_BULLET_HEIGHT = 12;
    public static final byte BULLET_PLAYER_SPEED = 7;
    public static final byte BULLET_ENEMY_SPEED = 5;
    public static final float BULLET_PLAYER_RATIO = 0.35f;
    public static final float BULLET_ENEMY_RATIO = 0.35f;

    // ANIMATION
    public static final float PLAYER_ANIMATION_TIME = 0.25f;
    public static final float ENEMY_ANIMATION_TIME = 0.5f;
    public static final float BULLET_ANIMATION_TIME = 0.25f;
    public static final float ENEMY_EXPLOSION_ANIMATION_TIME = 0.5f;

}//CLASS
