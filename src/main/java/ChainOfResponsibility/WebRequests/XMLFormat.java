package ChainOfResponsibility.WebRequests;

public class XMLFormat implements Answer {

    private Answer nextAnswer;

    XMLFormat() {
        this.nextAnswer = null;
    }

    public void answer(RequestFormat req, Account account) {
        if (req.getFormat().equals("XML"))
            System.out.println("<account><holder>" + account.getHolder()
                + "</titular><saldo>" + account.getBalance() + "</balance></account>.");
        else if (nextAnswer != null)
            nextAnswer.answer(req, account);
    }

    public void setNext(Answer nextAnswer) {
        this.nextAnswer = nextAnswer;
    }
}
