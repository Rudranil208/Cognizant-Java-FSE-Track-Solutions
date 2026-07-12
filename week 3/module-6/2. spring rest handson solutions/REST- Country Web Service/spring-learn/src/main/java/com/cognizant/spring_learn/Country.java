package com.cognizant.spring_learn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    // Default Constructor
    public Country() {
        LOGGER.debug("Inside Country Constructor");
    }

    // Parameterized Constructor (Optional)
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter for code
    public String getCode() {
        return code;
    }

    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
