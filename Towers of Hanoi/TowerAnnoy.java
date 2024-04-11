import java.util.Stack;

/*
name: Arav Neroth
date: 2/1/2024
class: CS 3 3rd Period
 */
public class TowerAnnoy {
    private Stack<Integer> towerOne, towerTwo, towerThree;
    private int rings;

    public TowerAnnoy(Stack<Integer> towerStart){
        rings = towerStart.size();
        towerOne = towerStart;
        towerTwo = new Stack<>();
        towerThree = new Stack<>();
    }

    public void solveHanoi(){
        // solve from this method so that we don't need to
        solveH(rings, towerOne, towerTwo, towerThree);
    }

    public void solveH(int rings, Stack<Integer> towerOne, Stack<Integer> towerTwo, Stack<Integer> towerThree) {

        if (rings > 0) {

            // Move the top disks from T1 to T2, using T3 as temp
            solveH(rings - 1, towerOne, towerThree, towerTwo);

            // Move the largest available disk from T1 to T3 if possible
            if (!towerOne.isEmpty() && (towerThree.isEmpty() || towerOne.peek() > towerThree.peek())) {
                towerThree.push(towerOne.pop());
                printTowers();
            }

            else {
                // If you cant move largest disk, move smaller disk
                solveH(rings - 1, towerTwo, towerOne, towerThree);
            }

            // Move the leftoverr disks from T2 to T3 with T1 as temp
            solveH(rings - 1, towerTwo, towerOne, towerThree);

        }
    }


    private void printTowers() {
        int max_height = Math.max(towerOne.size(), Math.max(towerTwo.size(), towerThree.size()));

        for (int i = 0; i < max_height; i++) {
            String t1 = (i < towerOne.size()) ? String.valueOf(towerOne.get(i)) : " ";
            String t2 = (i < towerTwo.size()) ? String.valueOf(towerTwo.get(i)) : " ";
            String t3 = (i < towerThree.size()) ? String.valueOf(towerThree.get(towerThree.size() - 1 - i)) : " ";
            System.out.println(t1 + "\t" + t2 + "\t" + t3);
        }

        System.out.println("T1| T2 |T3");
        System.out.println();
    }


}
