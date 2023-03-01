package org.example;


import java.util.Scanner;
import java.util.logging.Logger;


public class CreditCard {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String holdername;
        long cardno;

        String expirationdate;
        LOGGER.info("Enter Card holder name:");
        holdername = input.nextLine();
        LOGGER.info("Enter Card number:");
        cardno = input.nextLong();
        LOGGER.info("Enter Expiration date:");
        expirationdate = input.next();
        CardDetails cd = new CardDetails(holdername, cardno, expirationdate);
        CardDetails clone = new CardDetails(cd);
        String opt;
        long newcardno;
        LOGGER.info("Do yo want new Credit card y/n:");
        opt = input.next().toUpperCase();
        Boolean t = null;
        if (opt.equals("Y")) {
            LOGGER.info("Enter card number:");
            newcardno = input.nextLong();
            t = cd.checkcard(newcardno);
        } else {
            LOGGER.warning("Procces Cancelled");
        }

        String res = String.valueOf(t);
        String cno=String.valueOf(clone.cardno);

        if (res.equals("true"))
        {
            LOGGER.info("Creating new Credit card...");
            LOGGER.info("Card Holder name :"+clone.holdername);
            LOGGER.info("Card Number:"+cno);
            LOGGER.info("Card Expiration date:"+clone.expirationdate);
        }
        else
        {
            LOGGER.info("CARD NOT FOUND try again later");
        }
    }
}
