/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject Lead
 */
@XStreamAlias("Lead")
public class Lead extends AbstractSObjectBase {

    // MasterRecordId
    private String MasterRecordId;

    @JsonProperty("MasterRecordId")
    public String getMasterRecordId() {
        return this.MasterRecordId;
    }

    @JsonProperty("MasterRecordId")
    public void setMasterRecordId(String MasterRecordId) {
        this.MasterRecordId = MasterRecordId;
    }

    // LastName
    private String LastName;

    @JsonProperty("LastName")
    public String getLastName() {
        return this.LastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    // FirstName
    private String FirstName;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return this.FirstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    // Salutation
    @XStreamConverter(PicklistEnumConverter.class)
    private SalutationEnum Salutation;

    @JsonProperty("Salutation")
    public SalutationEnum getSalutation() {
        return this.Salutation;
    }

    @JsonProperty("Salutation")
    public void setSalutation(SalutationEnum Salutation) {
        this.Salutation = Salutation;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // Company
    private String Company;

    @JsonProperty("Company")
    public String getCompany() {
        return this.Company;
    }

    @JsonProperty("Company")
    public void setCompany(String Company) {
        this.Company = Company;
    }

    // Street
    private String Street;

    @JsonProperty("Street")
    public String getStreet() {
        return this.Street;
    }

    @JsonProperty("Street")
    public void setStreet(String Street) {
        this.Street = Street;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // PostalCode
    private String PostalCode;

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return this.PostalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // MobilePhone
    private String MobilePhone;

    @JsonProperty("MobilePhone")
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    @JsonProperty("MobilePhone")
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    // Fax
    private String Fax;

    @JsonProperty("Fax")
    public String getFax() {
        return this.Fax;
    }

    @JsonProperty("Fax")
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    // Email
    private String Email;

    @JsonProperty("Email")
    public String getEmail() {
        return this.Email;
    }

    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Website
    private String Website;

    @JsonProperty("Website")
    public String getWebsite() {
        return this.Website;
    }

    @JsonProperty("Website")
    public void setWebsite(String Website) {
        this.Website = Website;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // LeadSource
    @XStreamConverter(PicklistEnumConverter.class)
    private LeadSourceEnum LeadSource;

    @JsonProperty("LeadSource")
    public LeadSourceEnum getLeadSource() {
        return this.LeadSource;
    }

    @JsonProperty("LeadSource")
    public void setLeadSource(LeadSourceEnum LeadSource) {
        this.LeadSource = LeadSource;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // Industry
    @XStreamConverter(PicklistEnumConverter.class)
    private IndustryEnum Industry;

    @JsonProperty("Industry")
    public IndustryEnum getIndustry() {
        return this.Industry;
    }

    @JsonProperty("Industry")
    public void setIndustry(IndustryEnum Industry) {
        this.Industry = Industry;
    }

    // Rating
    @XStreamConverter(PicklistEnumConverter.class)
    private RatingEnum Rating;

    @JsonProperty("Rating")
    public RatingEnum getRating() {
        return this.Rating;
    }

    @JsonProperty("Rating")
    public void setRating(RatingEnum Rating) {
        this.Rating = Rating;
    }

    // AnnualRevenue
    private Double AnnualRevenue;

    @JsonProperty("AnnualRevenue")
    public Double getAnnualRevenue() {
        return this.AnnualRevenue;
    }

    @JsonProperty("AnnualRevenue")
    public void setAnnualRevenue(Double AnnualRevenue) {
        this.AnnualRevenue = AnnualRevenue;
    }

    // NumberOfEmployees
    private Integer NumberOfEmployees;

    @JsonProperty("NumberOfEmployees")
    public Integer getNumberOfEmployees() {
        return this.NumberOfEmployees;
    }

    @JsonProperty("NumberOfEmployees")
    public void setNumberOfEmployees(Integer NumberOfEmployees) {
        this.NumberOfEmployees = NumberOfEmployees;
    }

    // IsConverted
    private Boolean IsConverted;

    @JsonProperty("IsConverted")
    public Boolean getIsConverted() {
        return this.IsConverted;
    }

    @JsonProperty("IsConverted")
    public void setIsConverted(Boolean IsConverted) {
        this.IsConverted = IsConverted;
    }

    // ConvertedDate
    private org.joda.time.DateTime ConvertedDate;

    @JsonProperty("ConvertedDate")
    public org.joda.time.DateTime getConvertedDate() {
        return this.ConvertedDate;
    }

    @JsonProperty("ConvertedDate")
    public void setConvertedDate(org.joda.time.DateTime ConvertedDate) {
        this.ConvertedDate = ConvertedDate;
    }

    // ConvertedAccountId
    private String ConvertedAccountId;

    @JsonProperty("ConvertedAccountId")
    public String getConvertedAccountId() {
        return this.ConvertedAccountId;
    }

    @JsonProperty("ConvertedAccountId")
    public void setConvertedAccountId(String ConvertedAccountId) {
        this.ConvertedAccountId = ConvertedAccountId;
    }

    // ConvertedContactId
    private String ConvertedContactId;

    @JsonProperty("ConvertedContactId")
    public String getConvertedContactId() {
        return this.ConvertedContactId;
    }

    @JsonProperty("ConvertedContactId")
    public void setConvertedContactId(String ConvertedContactId) {
        this.ConvertedContactId = ConvertedContactId;
    }

    // ConvertedOpportunityId
    private String ConvertedOpportunityId;

    @JsonProperty("ConvertedOpportunityId")
    public String getConvertedOpportunityId() {
        return this.ConvertedOpportunityId;
    }

    @JsonProperty("ConvertedOpportunityId")
    public void setConvertedOpportunityId(String ConvertedOpportunityId) {
        this.ConvertedOpportunityId = ConvertedOpportunityId;
    }

    // IsUnreadByOwner
    private Boolean IsUnreadByOwner;

    @JsonProperty("IsUnreadByOwner")
    public Boolean getIsUnreadByOwner() {
        return this.IsUnreadByOwner;
    }

    @JsonProperty("IsUnreadByOwner")
    public void setIsUnreadByOwner(Boolean IsUnreadByOwner) {
        this.IsUnreadByOwner = IsUnreadByOwner;
    }

    // Jigsaw
    private String Jigsaw;

    @JsonProperty("Jigsaw")
    public String getJigsaw() {
        return this.Jigsaw;
    }

    @JsonProperty("Jigsaw")
    public void setJigsaw(String Jigsaw) {
        this.Jigsaw = Jigsaw;
    }

    // JigsawContactId
    private String JigsawContactId;

    @JsonProperty("JigsawContactId")
    public String getJigsawContactId() {
        return this.JigsawContactId;
    }

    @JsonProperty("JigsawContactId")
    public void setJigsawContactId(String JigsawContactId) {
        this.JigsawContactId = JigsawContactId;
    }

    // CleanStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private CleanStatusEnum CleanStatus;

    @JsonProperty("CleanStatus")
    public CleanStatusEnum getCleanStatus() {
        return this.CleanStatus;
    }

    @JsonProperty("CleanStatus")
    public void setCleanStatus(CleanStatusEnum CleanStatus) {
        this.CleanStatus = CleanStatus;
    }

    // CompanyDunsNumber
    private String CompanyDunsNumber;

    @JsonProperty("CompanyDunsNumber")
    public String getCompanyDunsNumber() {
        return this.CompanyDunsNumber;
    }

    @JsonProperty("CompanyDunsNumber")
    public void setCompanyDunsNumber(String CompanyDunsNumber) {
        this.CompanyDunsNumber = CompanyDunsNumber;
    }

    // DandbCompanyId
    private String DandbCompanyId;

    @JsonProperty("DandbCompanyId")
    public String getDandbCompanyId() {
        return this.DandbCompanyId;
    }

    @JsonProperty("DandbCompanyId")
    public void setDandbCompanyId(String DandbCompanyId) {
        this.DandbCompanyId = DandbCompanyId;
    }

    // EmailBouncedReason
    private String EmailBouncedReason;

    @JsonProperty("EmailBouncedReason")
    public String getEmailBouncedReason() {
        return this.EmailBouncedReason;
    }

    @JsonProperty("EmailBouncedReason")
    public void setEmailBouncedReason(String EmailBouncedReason) {
        this.EmailBouncedReason = EmailBouncedReason;
    }

    // EmailBouncedDate
    private org.joda.time.DateTime EmailBouncedDate;

    @JsonProperty("EmailBouncedDate")
    public org.joda.time.DateTime getEmailBouncedDate() {
        return this.EmailBouncedDate;
    }

    @JsonProperty("EmailBouncedDate")
    public void setEmailBouncedDate(org.joda.time.DateTime EmailBouncedDate) {
        this.EmailBouncedDate = EmailBouncedDate;
    }

    // SICCode__c
    private String SICCode__c;

    @JsonProperty("SICCode__c")
    public String getSICCode__c() {
        return this.SICCode__c;
    }

    @JsonProperty("SICCode__c")
    public void setSICCode__c(String SICCode__c) {
        this.SICCode__c = SICCode__c;
    }

    // ProductInterest__c
    @XStreamConverter(PicklistEnumConverter.class)
    private ProductInterestEnum ProductInterest__c;

    @JsonProperty("ProductInterest__c")
    public ProductInterestEnum getProductInterest__c() {
        return this.ProductInterest__c;
    }

    @JsonProperty("ProductInterest__c")
    public void setProductInterest__c(ProductInterestEnum ProductInterest__c) {
        this.ProductInterest__c = ProductInterest__c;
    }

    // Primary__c
    @XStreamConverter(PicklistEnumConverter.class)
    private PrimaryEnum Primary__c;

    @JsonProperty("Primary__c")
    public PrimaryEnum getPrimary__c() {
        return this.Primary__c;
    }

    @JsonProperty("Primary__c")
    public void setPrimary__c(PrimaryEnum Primary__c) {
        this.Primary__c = Primary__c;
    }

    // CurrentGenerators__c
    private String CurrentGenerators__c;

    @JsonProperty("CurrentGenerators__c")
    public String getCurrentGenerators__c() {
        return this.CurrentGenerators__c;
    }

    @JsonProperty("CurrentGenerators__c")
    public void setCurrentGenerators__c(String CurrentGenerators__c) {
        this.CurrentGenerators__c = CurrentGenerators__c;
    }

    // NumberofLocations__c
    private Double NumberofLocations__c;

    @JsonProperty("NumberofLocations__c")
    public Double getNumberofLocations__c() {
        return this.NumberofLocations__c;
    }

    @JsonProperty("NumberofLocations__c")
    public void setNumberofLocations__c(Double NumberofLocations__c) {
        this.NumberofLocations__c = NumberofLocations__c;
    }

}
