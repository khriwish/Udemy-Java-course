public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int toner, boolean duplex) {
        this.tonerLevel = toner;
        this.duplex = duplex;
    }

    private int addToner(int tonerAmount) {
        if((tonerLevel + tonerAmount) >= 100 || (tonerLevel + tonerAmount) <= 0 )
        {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    private int printPages(int pages) {
        int jobPages = (duplex) ? (pages/2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        if(duplex) {
            System.out.println("this printer is a duplex printer "
            + "and it printed : ");
         }

        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
