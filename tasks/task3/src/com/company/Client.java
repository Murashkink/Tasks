package com.company;

public class Client {

    private String clientSecondName;
    private String clientFirstName;
    private String clientPatronymic;
    private String clientAddress;
    private long clientCardNumber;
    private double clientDebit;
    private double clientCredit;
    private String diagnoz;

    public String getClientSecondName() {
        return clientSecondName;
    }

    public String getClientDiagnoz() {
        return diagnoz;
    }

    public Client(String clientSecondName, String clientFirstName, String clientPatronymic,
                  String clientAddress, long clientCardNumber, double clientDebit,
                  double clientCredit, String diagnoz) {

        this.clientSecondName = clientSecondName;
        this.clientFirstName = clientFirstName;
        this.clientPatronymic = clientPatronymic;
        this.clientAddress = clientAddress;
        this.clientCardNumber = clientCardNumber;
        this.clientDebit = clientDebit;
        this.clientCredit = clientCredit;
        this.diagnoz = diagnoz;
    }

    public String toString() {
        return String.format("Client: %s %s %s", clientSecondName, clientFirstName, clientPatronymic) + "\n" + "Адрес проживания" + clientAddress +
                String.format("\t\tCardNumber: %d\t Debit: %10.2f\t  Credit: %10.2f.", clientCardNumber, clientDebit,
                        clientCredit) + "\n" + "Заболевание: "
                + diagnoz;
    }
}
