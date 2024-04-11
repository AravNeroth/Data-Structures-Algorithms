import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/*
name: Arav Neroth
date: 2/1/2024
class: CS 3 3rd Period
 */
public class TowerRunner {
    public static void main(String[] args) throws IOException {

        Stack<Integer> startingStack = new Stack<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many rings?: ");
        int rings = input.nextInt();

        for (int x = rings; x > 0; x--)
            startingStack.push(x);

        TowerAnnoy towers = new TowerAnnoy(startingStack);
        towers.solveHanoi();
    }
}
