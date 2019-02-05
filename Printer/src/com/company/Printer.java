package com.company;

public class Printer {
    private int tonerLevel;
    private int pages;
    private boolean duplex;

    public Printer(int tonerLevel, int pages, boolean duplex) {
        if(tonerLevel > 100 && tonerLevel >= 0){
            this.tonerLevel = 0;
        }else{
            this.tonerLevel = tonerLevel;
        }


        this.pages = pages;
        this.duplex = duplex;
    }

    public int fillToner(int number){
        if(number > 100){
            this.setTonerLevel(100);
        }else{
            this.setTonerLevel(this.tonerLevel + number);
        }
    }

    public void printPage(){
        int pagesToPrint;
        if(this.duplex){
            pagesToPrint = this.pages/2 + (pages%2);
            System.out.println("Printing in duplex mode.")
        }
        this.setPages(this.getPages()+ pagesToPrint);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
