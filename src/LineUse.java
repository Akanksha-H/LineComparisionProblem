public class LineUse {

    public void myClass(){

        double x1 = Math.floor(Math.random() * 10) % 2;
        double x2 = Math.floor(Math.random() * 10) % 3;
        double y1 = Math.floor(Math.random() * 10) % 4;
        double y2 = Math.floor(Math.random() * 10) % 5;

        double lengthOfLine = (Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))));
    }
}

