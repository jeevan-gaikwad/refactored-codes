package movierental;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeevan on 24/7/16.
 */
public class CustomerTest {
    @Test
    public void statement() throws Exception {
        Movie mov1=new Movie("Jab we met",Movie.NEW_RELEASE);
        Movie mov2=new Movie("Om Shanti Om",Movie.REGULAR);
        Movie mov3 = new Movie("Bal Ganesh", Movie.CHILDRENS);

        Rental rent1=new Rental(mov1,4);
        Rental rent2=new Rental(mov2,3);
        Rental rent3=new Rental(mov3,4);

        CustomerBuilder customerBuilder=new CustomerBuilder().withName("Jeevan").withRentals(rent1,rent2,rent3);
        Customer cust1 = customerBuilder.build();
        String consoleOutput = cust1.statement();

        assertEquals("Rental Record for Jeevan\n" +
                "\tJab we met\t12.0\n" +
                "\tOm Shanti Om\t3.5\n" +
                "\tBal Ganesh\t3.0\n" +
                "Amount owed is 18.5\n" +
                "You earned 4 frequent renter points",
                consoleOutput);
    }

}