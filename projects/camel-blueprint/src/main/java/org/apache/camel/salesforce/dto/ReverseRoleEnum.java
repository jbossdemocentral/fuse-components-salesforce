/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ReverseRole
 */
public enum ReverseRoleEnum {

    // System Integrator
    SYSTEM_INTEGRATOR("System Integrator"),
    // Agency
    AGENCY("Agency"),
    // Advertiser
    ADVERTISER("Advertiser"),
    // VAR/Reseller
    VAR_RESELLER("VAR/Reseller"),
    // Distributor
    DISTRIBUTOR("Distributor"),
    // Developer
    DEVELOPER("Developer"),
    // Broker
    BROKER("Broker"),
    // Lender
    LENDER("Lender"),
    // Supplier
    SUPPLIER("Supplier"),
    // Institution
    INSTITUTION("Institution"),
    // Contractor
    CONTRACTOR("Contractor"),
    // Dealer
    DEALER("Dealer"),
    // Consultant
    CONSULTANT("Consultant");

    final String value;

    private ReverseRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ReverseRoleEnum fromValue(String value) {
        for (ReverseRoleEnum e : ReverseRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
