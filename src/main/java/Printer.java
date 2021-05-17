public class Printer {
    private int numberOfSheets;
    private int tonerLevel;

    public Printer(){
        this.numberOfSheets = 100;
        this.tonerLevel = 100;
    }

    public int getNumberOfSheets(){
        return this.numberOfSheets;
    }

    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int printTotal = numberOfPages * numberOfCopies;
        if(printTotal <= this.numberOfSheets){
            this.numberOfSheets -= printTotal;
            this.tonerLevel -= printTotal;
        }
    }


}
