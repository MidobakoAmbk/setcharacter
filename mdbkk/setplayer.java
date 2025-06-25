package mdbkk;


public class setplayer {
    public static void main(String[] args) {
        
        System.out.println("Created by Midobako.\nSetplayer.java  ver.1.0.0\n\n");

        System.out.println("選出結果\n");

        //プレイヤー名とゲーム名を出すための奴
        
        int p1,g1;
        p1 = (int)(Math.random()*3)+1;
        g1 = (int)(Math.random()*3)+1;

        //選ばれたものをターミナルに出すのにちょっと便利になるやつ
        String player;
        String game;

        //プレイヤー選出
        switch (p1) {
            case 1: {
                player = "れいむ";
                break;
            }
            case 2: {
                player = "まりさ";
                break;
            }
            case 3: {
                player = "みどばこ";
                break;
            }
            default: {
                player = "Unknown";
                break;
            }
        }
        //選出プレイヤーを表示
        System.out.println("プレイヤー : "+player+"\n");



        //プレイするゲームを選出
        switch (g1) {
            case 1: {
                game = "Minecraft";
                break;
            }
            case 2: {
                game = "マリオカート8DX";
                break;
            }
            case 3: {
                game = "スプラトゥーン3";
                break;
            }
            default: {
                game = "Unknown";
                break;
            }
        }
        //選出ゲームを表示
        System.out.println("ゲーム : "+game+"\n");

    }
}
