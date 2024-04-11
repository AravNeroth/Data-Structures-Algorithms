/*
name: arav neroth
date: 12/10/23 ( late work 'redo' )
class: CS 3 3rd period
i do not like diameter, & some of the code (diameter & leaves) I got help with
 */

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
       int[] list = new int[] { 70, 80, 85, 90, 98, 100, 120 };
      BinarySearchTree bintree = new BinarySearchTree();
       for (int i : list) {
          bintree.add(i);
       }

       System.out.println("IN ORDER" +  "\n");
       bintree.inOrder();

       System.out.println("PRE ORDER" +  "\n");
       bintree.preOrder();

      System.out.println("POST ORDER" +  "\n");
      bintree.postOrder();

      System.out.println("REV ORDER" +  "\n");
      bintree.revOrder();

      System.out.println("Tree height is " + bintree.getHeight());
      System.out.println("Number of leaves is " + bintree.getNumLeaves());
      System.out.println("Number of levels is " + bintree.getNumLevels());
      System.out.println("Number of nodes is " + bintree.getNumNodes());
      System.out.println("Tree width is " + bintree.getDiameter());

      if(bintree.isFull()){
         System.out.println("The tree is full");
      } else {
         System.out.println("The tree is not full");
      }
   }
}