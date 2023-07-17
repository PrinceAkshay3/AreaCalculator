// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(2,2));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }else{
            return radius*radius*Math.PI;
        }

    }

    public static double area(double x, double y){

        if((x<0) || (y<0)){
            return -1.0;
        }else{
            return x*y;
        }
    }
}