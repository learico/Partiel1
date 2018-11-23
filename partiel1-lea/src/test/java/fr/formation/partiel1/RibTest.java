package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author Administrateur
 */
public class RibTest {

    @SuppressWarnings("javadoc")
    public String BANK_CODE;

    private String SORT_CODE;

    private String KEY_RIB;

    private String ACCOUNT_NUMBER;

    @Test
    void shoulNotConstructWithNullBankCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, SORT_CODE, KEY_RIB, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulNotConstructWithNullSortCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(BANK_CODE, null, KEY_RIB, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulNotConstructWithNullKeyCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(BANK_CODE, SORT_CODE, null, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulNotConstructWithNullAccountNumber() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(BANK_CODE, SORT_CODE, KEY_RIB, null);
	});
    }

    @Test
    void shoulNotConstructWithNull() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, null, null, null);
	});
    }

    @Test
    void shoulConstruct() {
	assertDoesNotThrow(() -> {
	    Rib a = new Rib(BANK_CODE, SORT_CODE, KEY_RIB, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulConstructBankCode() {
	assertDoesNotThrow(() -> {
	    Rib a = new Rib(null, SORT_CODE, KEY_RIB, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulConstructSortCode() {
	assertDoesNotThrow(() -> {
	    Rib a = new Rib(BANK_CODE, null, KEY_RIB, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulConstructKeyCode() {
	assertDoesNotThrow(() -> {
	    Rib a = new Rib(BANK_CODE, SORT_CODE, null, ACCOUNT_NUMBER);
	});
    }

    @Test
    void shoulConstructAccountNumber() {
	assertDoesNotThrow(() -> {
	    Rib a = new Rib(BANK_CODE, SORT_CODE, KEY_RIB, null);
	});
    }
}
