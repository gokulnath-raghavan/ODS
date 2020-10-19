package guru.learningjournal.kafka.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CustomerNumber",
        "PhoneNumber"
})
public class UserUpdateDetails {

    @JsonProperty("CustomerNumber")
    private String customerNumber;
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @JsonProperty("CustomerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("CustomerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public UserUpdateDetails withCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
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

    public UserUpdateDetails withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerNumber", customerNumber).append("phoneNumber", phoneNumber).toString();
    }

}