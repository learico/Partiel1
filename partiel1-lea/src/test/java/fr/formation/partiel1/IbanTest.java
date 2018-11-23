package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IbanTest {

    private String COUNTRY_CODE = "FR";

    private String KEY_CODE = "33";

    Rib a;

    /**
     *
     */
    @BeforeAll
    public void initialize() {
	a = new Rib(KEY_CODE, KEY_CODE, KEY_CODE, KEY_CODE);
    }

    @Test
    void shoulNotConstructWithNullCountryCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Iban(null, KEY_CODE, a);
	});
    }

    @Test
    void shoulNotConstructWithNullKeyCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Iban(COUNTRY_CODE, null, a);
	});
    }

    @Test
    void shoulNotConstructWithNullA() {
	assertThrows(NullPointerException.class, () -> {
	    new Iban(COUNTRY_CODE, KEY_CODE, null);
	});
    }

    @Test
    void shoulConstruct() {
	assertDoesNotThrow(() -> {
	    new Iban(COUNTRY_CODE, KEY_CODE, a);
	});
    }

    @Test
    void shoulConstructCountryCode() {
	assertDoesNotThrow(() -> {
	    new Iban(null, KEY_CODE, a);
	});
    }

    @Test
    void shoulConstructKeyCode() {
	assertDoesNotThrow(() -> {
	    new Iban(COUNTRY_CODE, null, a);
	});
    }

    @Test
    void shoulConstructa() {
	assertDoesNotThrow(() -> {
	    new Iban(COUNTRY_CODE, KEY_CODE, null);
	});
    }
}
