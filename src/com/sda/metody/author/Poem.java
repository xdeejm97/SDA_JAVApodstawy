package com.sda.metody.author;

public class Poem {
    public Poem(Author creator, int stropheNumbers){
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;


    }
    private Author creator;
    private int stropheNumbers;

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
