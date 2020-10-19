package guru.learningjournal.kafka.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AccountNumber",
        "SortCode",
        "AccountOpeningDate",
        "AvailableBalance",
        "AvailableFunds",
        "TypeOfAccount"
})
public class AccountDetails {

    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("SortCode")
    private String sortCode;
    @JsonProperty("AccountOpeningDate")
    private String accountOpeningDate;
    @JsonProperty("AvailableBalance")
    private Integer availableBalance;
    @JsonProperty("AvailableFunds")
    private Integer availableFunds;
    @JsonProperty("TypeOfAccount")
    private String typeOfAccount;

    @JsonProperty("AccountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("AccountNumber")
    public AccountDetails withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    @JsonProperty("SortCode")
    public String getSortCode() {
        return sortCode;
    }
    @JsonProperty("SortCode")
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }
    @JsonProperty("SortCode")
    public AccountDetails withSortCode(String sortCode) {
        this.sortCode = sortCode;
        return this;
    }

    @JsonProperty("AccountOpeningDate")
    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    @JsonProperty("AccountOpeningDate")
    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    @JsonProperty("AccountOpeningDate")
    public AccountDetails withAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
        return this;
    }

    @JsonProperty("AvailableBalance")
    public Integer getAvailableBalance() {
        return availableBalance;
    }

    @JsonProperty("AvailableBalance")
    public void setAvailableBalance(Integer availableBalance) {
        this.availableBalance = availableBalance;
    }

    @JsonProperty("AvailableBalance")
    public AccountDetails withAvailableBalance(Integer availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }

    @JsonProperty("AvailableFunds")
    public Integer getAvailableFunds() {
        return availableFunds;
    }

    @JsonProperty("AvailableFunds")
    public void setAvailableFunds(Integer availableFunds) {
        this.availableFunds = availableFunds;
    }

    @JsonProperty("AvailableFunds")
    public AccountDetails withAvailableFunds(Integer availableFunds) {
        this.availableFunds = availableFunds;
        return this;
    }
    @JsonProperty("TypeOfAccount")
    public String getTypeOfAccount() {
        return typeOfAccount;
    }
    @JsonProperty("TypeOfAccount")
    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }
    @JsonProperty("TypeOfAccount")
    public AccountDetails withTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accountNumber", accountNumber).append("sortCode", sortCode).append("accountOpeningDate", accountOpeningDate).append("availableBalance", availableBalance).append("availableFunds", availableFunds).append("typeOfAccount", typeOfAccount).toString();
    }
}