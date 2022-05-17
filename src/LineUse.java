public class LineUse {

    public void myClass(){

        String lengthOfLine1;

        String lengthOfLine2;


        double x1 = Math.floor(Math.random() * 10) % 2;
        double x2 = Math.floor(Math.random() * 10) % 3;
        double y1 = Math.floor(Math.random() * 10) % 4;
        double y2 = Math.floor(Math.random() * 10) % 5;

        double x21 = Math.floor(Math.random() * 10) % 2;
        double x22 = Math.floor(Math.random() * 10) % 3;
        double y21 = Math.floor(Math.random() * 10) % 4;
        double y22 = Math.floor(Math.random() * 10) % 5;


        double lengthOfLine1 = (Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))));
        double lengthOfLine2 = Math.round(Math.sqrt((x22 - x21) * (x22 - x21) + (y22 - y21) * (y22 - y21)));

    }
}

