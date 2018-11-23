package fr.formation.partiel1;

import java.util.Objects;

/**
 * @author Administrateur
 */
public class Iban {

    private String countryCode;

    private String controlKey;

    private Rib rib;

    /**
     * @param countryCode
     * @param controlKey
     * @param rib
     */
    public Iban(String countryCode, String controlKey, Rib rib) {
	setCountryCode(countryCode);
	setControlKey(controlKey);
    }

    /**
     * @return
     */
    public String getCountryCode() {
	return countryCode;
    }

    /**
     * @return
     */
    public String getControlKey() {
	return controlKey;
    }

    private void setCountryCode(String countryCode) {
	Objects.requireNonNull(countryCode);
	this.countryCode = countryCode;
    }

    private void setControlKey(String controlKey) {
	Objects.requireNonNull(controlKey);
	this.controlKey = controlKey;
    }
}
