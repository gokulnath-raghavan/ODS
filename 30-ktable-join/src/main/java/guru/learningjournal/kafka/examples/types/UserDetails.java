package guru.learningjournal.kafka.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CustomerNumber",
        "Email",
        "DOB",
        "PhoneNumber",
        "FirstName",
        "Surname",
        "Nationality"
})
public class UserDetails {

    @JsonProperty("CustomerNumber")
    private String customerNumber;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("DOB")
    private String dOB;
    @JsonProperty("PhoneNumber")
    private String phoneNumber;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("Nationality")
    private String nationality;

    @JsonProperty("CustomerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("CustomerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public UserDetails withCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    public UserDetails withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("DOB")
    public String getDOB() {
        return dOB;
    }

    @JsonProperty("DOB")
    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public UserDetails withDOB(String dOB) {
        this.dOB = dOB;
        return this;
    }

    @JsonProperty("PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("Surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonProperty("Nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("Nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }





    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerNumber", customerNumber).append("email", email).append("dOB", dOB).append("phoneNumber", phoneNumber).append("firstName", firstName).append("surname", surname).append("nationality", nationality).toString();
    }

}