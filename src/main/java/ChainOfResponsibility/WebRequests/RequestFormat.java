package ChainOfResponsibility.WebRequests;

enum Format {
    XML,
    CSV,
    PERCENT
}

public class RequestFormat {

    private Format format;

    public RequestFormat(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    public static void main(String[] args) {

        Account account = new Account("Mary Stuart", 500.0);

        Answer xmlFile = new XMLFormat();
        Answer csvFile = new CSVFormat();
        Answer percentFile = new PercentFormat();

        xmlFile.setNext(csvFile);
        csvFile.setNext(percentFile);

        RequestFormat request = new RequestFormat(Format.PERCENT);
        xmlFile.answer(request, account);

    }

}
