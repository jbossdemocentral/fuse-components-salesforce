package com.mycompany.camel.blueprint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.camel.component.salesforce.SalesforceLoginConfig;
import org.junit.Assert;

public class LoginConfigHelper extends Assert {

    private static final String TEST_LOGIN_PROPERTIES = "test-salesforce-login.properties";

    public static SalesforceLoginConfig getLoginConfig() throws IOException {

        // load test-salesforce-login properties
        Properties properties = new Properties();
        InputStream stream = null;
        try {
            stream = new FileInputStream(TEST_LOGIN_PROPERTIES);
            properties.load(stream);

            final SalesforceLoginConfig config = new SalesforceLoginConfig(
                properties.getProperty("loginUrl", SalesforceLoginConfig.DEFAULT_LOGIN_URL),
                properties.getProperty("clientId"),
                properties.getProperty("clientSecret"),
                properties.getProperty("userName"),
                properties.getProperty("password"),
                Boolean.parseBoolean(properties.getProperty("lazyLogin", "false")));

            assertNotNull("Null loginUrl", config.getLoginUrl());
            assertNotNull("Null clientId", config.getClientId());
            assertNotNull("Null clientSecret", config.getClientSecret());
            assertNotNull("Null userName", config.getUserName());
            assertNotNull("Null password", config.getPassword());

            return config;

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Create a properties file named "
                + TEST_LOGIN_PROPERTIES + " with clientId, clientSecret, userName, and password"
                + " for a Salesforce account with Merchandise and Invoice objects from Salesforce Guides.");
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException ignore) {
                }
            }
        }
    }

}