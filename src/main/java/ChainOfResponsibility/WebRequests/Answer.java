package ChainOfResponsibility.WebRequests;

public interface Answer {

    void answer(RequestFormat req, Account account);
    void setNext(Answer answer);
}