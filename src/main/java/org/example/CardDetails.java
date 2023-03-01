package org.example;

class CardDetails
{
    String holdername;
    Long cardno;

    String expirationdate;

    CardDetails(String holdername,Long cardno,String expirationdate)
    {
        this.holdername=holdername;

        this.cardno=cardno;
        this.expirationdate=expirationdate;

    }
    CardDetails(CardDetails cd1)
    {
        holdername=cd1.holdername;
        cardno= cd1.cardno;
        expirationdate= cd1.expirationdate;
    }

    boolean checkcard(Long newcardno)
    {
        return cardno.equals(newcardno);
    }


}