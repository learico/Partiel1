package fr.formation.partiel1;

import java.util.Objects;

/**
 * @author Administrateur
 */
public class Rib {

    @SuppressWarnings("javadoc")
    public String bankCode;

    private String sortCode;

    private String keyRib;

    private String accountNumber;

    /**
     * @param bankCode
     * @param sortCode
     * @param keyRib
     * @param accountNumber
     */
    public Rib(String bankCode, String sortCode, String keyRib,
	    String accountNumber) {
	setBankCode(bankCode);
	setSortCode(sortCode);
	setKeyRib(keyRib);
	setAccountNumber(accountNumber);
    }

    /**
     * @return
     */
    public String getBankCode() {
	return bankCode;
    }

    /**
     * @return
     */
    public String getSortCode() {
	return sortCode;
    }

    /**
     * @return
     */
    public String getKeyRib() {
	return keyRib;
    }

    /**
     * @return
     */
    public String getAccountNumber() {
	return accountNumber;
    }

    private void setBankCode(String bankCode) {
	Objects.requireNonNull(bankCode);
	this.bankCode = bankCode;
    }

    private void setSortCode(String sortCode) {
	Objects.requireNonNull(sortCode);
	this.sortCode = sortCode;
    }

    private void setKeyRib(String keyRib) {
	Objects.requireNonNull(keyRib);
	this.keyRib = keyRib;
    }

    private void setAccountNumber(String accountNumber) {
	Objects.requireNonNull(accountNumber);
	this.accountNumber = accountNumber;
    }
}
