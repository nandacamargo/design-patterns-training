package ChainOfResponsibility.WebRequests;

public class PercentFormat implements Answer {

    private Answer nextAnswer;

    PercentFormat() {
        this.nextAnswer = null;
    }

    public void answer(RequestFormat req, Account account) {
        if (req.getFormat() == Format.PERCENT)
            System.out.println(account.getHolder() + "%" + account.getBalance());
        else if (nextAnswer != null)
            nextAnswer.answer(req, account);
    }

    public void setNext(Answer nextAnswer) {
        this.nextAnswer = nextAnswer;
    }
}
