/*
 * Keenan McCloskey
 * CIT 337 Assignment #2
 * 1-30-17
 */
package beersong;

/**
 *
 * @author keenanmccloskey
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
<<<<<<< HEAD
                word = "bottle"; 
=======
                word = "bottle"; // ONE bottle
>>>>>>> interface
            }

=======
         int beerNum = 99;
         String word = "bottles";
         
          while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; // ONE bottle
            }
>>>>>>> implementation
            System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println("Take one down, pass it round " + beerNum + " " + word + " of beer");
            }
<<<<<<< HEAD
        }

        if (beerNum == 0) {
            System.out.println("No more bottles of beer");
        }
<<<<<<< HEAD
=======

    }
>>>>>>> interface
    }
    

=======
            
             if (beerNum == 0) {
            System.out.println("No more bottles of beer");
            }

          }
         
    
}
}
>>>>>>> implementation
