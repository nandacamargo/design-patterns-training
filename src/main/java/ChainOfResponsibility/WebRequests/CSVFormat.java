package ChainOfResponsibility.WebRequests;

public class CSVFormat implements Answer {

    private Answer nextAnswer;

    CSVFormat() {
        this.nextAnswer = null;
    }

    public void answer(RequestFormat req, Account account) {
        if (req.getFormat().equals("CSV"))
            System.out.println(account.getHolder() + ", " + account.getBalance());
        else if (nextAnswer != null)
            nextAnswer.answer(req, account);
    }

    public void setNext(Answer nextAnswer) {
        this.nextAnswer = nextAnswer;
    }
}
