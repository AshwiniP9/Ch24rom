package com.videoGame.game;
public class VideoGame {
    private String name;
    private String version;
    private  int priceOfGame;
    public VideoGame(String name,String version,int priceOfGame){
        this.name=name;
        this.version=version;
        this.priceOfGame=priceOfGame;
        System.out.println("create constructor with parameters ");
    }
    public void display(){
        System.out.println("name"+this.name);
        System.out.println("version"+this.version);
        System.out.println("priceofgame"+this.priceOfGame);
}



}

