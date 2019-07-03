//package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Song {
    private String Artist;
    private String title;
    public Song(){

    }
    public void setArtist(String Artist ){
        this.Artist=Artist;
        this.title=title;
    }
    public String getArtist(){
        return Artist;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public String display() {
        return "\nTitle of Song:" + getTitle() +
                "\nArtist:" + getArtist();
    }
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>(); //Arraylist object[xxxx-converted to Song]
        for (int i = 0; i < 10; i++) {
            //Song class Instantiation
            Song s = new Song();

            String artist = "Prince";//modify program to prompt user for an artist
            String title = "Purple Rain"; //modify program to prompt user for a title
            System.out.println("please type in a Title of song:");
            title = keyb.nextLine();
            System.out.println("Please type in An Artist:");
            artist = keyb.nextLine();
            //
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }
        //print all the songs in the array list
        for (Song s1 : songs) {

            System.out.println(s1.display());
        }
        //look for blue and print if found
        String titleToFind = "Purple Rain";
        boolean flag=false;
        for (Song ss : songs) {
            if (ss.getTitle().equals(titleToFind)) {

                System.out.printf("I found %s \r\n", ss.getTitle());
                System.out.println("I found :" + ss.display());
            }
        }}}





