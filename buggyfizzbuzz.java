/* [start comment]
 CS1501 -- Tools of the Trade
   Fall 2020

#######################################################
###                   Directions                   ####
#######################################################
Write a program that prints the numbers from 1 to n. 
But for multiples of three print “Fizz” instead of the number 
for the multiples of five print “Buzz”.
and for numbers which are multiples of both three and five print “FizzBuzz”.

This program does not work the way it is supposed to
If you enter 15 you should get a printout of FizzBuzz but you don't
Can you debug this?

Output for 15 should be:
 1
 2
 Fizz
 4
 Buzz
 Fizz
 7
 8
 Fizz
 Buzz
 11
 Fizz
 13
 14
 FizzBuzz
[end comment] */

class buggyfizzbuzz {
    public static void main(String[] args) {
        //could change n to try out different numbers
        int n = 15;

        //nice simple for loop to count up to n
        for(int i=1; i<=n; i++) {

            if(i%3 == 0 && i%5 !=0) {
                //check to see if divisible by 3
                System.out.println("Fizz");
            }
            else if(i%5 == 0 && i%3!=0) {
                //check to see if divisible by 5
                System.out.println("Buzz");
            }
            else if(i%5 == 0 && i%3 == 0) {
                //check to see if divisible by 3 and 5 
                System.out.println("FizzBuzz");
            }
            else {
                //else just print out the number
                System.out.println(i);
            }
        }

/* [start comment]
 As you debug and step through the code before making any changes,
 write down here what the output (being i, Fizz, Buzz, or FizzBuzz)
 and the i that it's associated with
 Ex. i=1, output=1
     i=3, output=Fizz
[end comment] */

    }
}
