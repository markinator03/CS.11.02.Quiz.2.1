public class Main {

    public static void  main(String[] args) {

        // call the first add method and store the result into a variable called resultOne.
            int numOne = 10;
                    int numTwo = 3;
            int resultOne  = add( numOne, numTwo);


            // print resultOne.
            System.out.println(resultOne);
        }
        // call the greeting method and store the result into a variable called resultTwo.
        public static String greeting(String name)   {

            return "Bonjour, " + name;
        }

        // print resultTwo.
        //System.out.println(resultTwo);
        // call the second add method and store the result into a variable called resultThree.
    public static int resultThree(int numOne, int numTwo, int numThree, int numFour){
        return numOne + numTwo + numThree + numFour;
        // print resultThree.
        //System.out.println(resultThree);
        // call the printCapitalised method.

    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */

    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }


    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */


    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */


    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */




}
