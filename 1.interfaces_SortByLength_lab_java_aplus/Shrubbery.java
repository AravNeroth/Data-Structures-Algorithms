/*
Arav Neroth
3rd Period CS 3
8/30/23
 */

public class Shrubbery implements Comparable <Shrubbery> {

    private int niceRate;
    private double price;
    private double size;
    private String name;

    public static String compare;

    public Shrubbery(String name, int niceRate, double price, double size){

        this.name = name;
        this.niceRate = niceRate;
        this.price = price;
        this.size = size;
        this.compare = compare;
    }

    public String getName(){
        return name;
    }

    public int compareTo(Shrubbery diff){

        if(compare.equals("SIZE")){
            if(size > diff.size){
                return -1;

            }else if(size < diff.size) {
                return 1;

            }


        } else if (compare.equals("NICE")){
            if(niceRate > diff.niceRate){
                return -1;

            }else if(niceRate < diff.niceRate){
                return 1;
            }

        }
        else {

            if(price > diff.price){
                return 1;

            }else if(price < diff.price){
                return -1;
            }

        }

        return 0;
    }

    public String toString(){
        return name;
    }
}
