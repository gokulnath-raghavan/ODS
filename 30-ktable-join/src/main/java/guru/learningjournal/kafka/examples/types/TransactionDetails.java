package guru.learningjournal.kafka.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CustomerNumber",
        "AccountNumber",
        "Amount",
        "Currency",
        "TransactionTime",
        "TransactionId"
})
public class TransactionDetails {
    @JsonProperty("CustomerNumber")
    private String customerNumber;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("Amount")
    private Integer amount;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("TransactionTime")
    private String transactionTime;
    @JsonProperty("TransactionId")
    private String transactionId;

    @JsonProperty("CustomerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("CustomerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("CustomerNumber")
    public TransactionDetails withCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    @JsonProperty("AccountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("AccountNumber")
    public TransactionDetails withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @JsonProperty("Amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("Amount")
    public TransactionDetails withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("Currency")
    public TransactionDetails withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("TransactionTime")
    public String getTransactionTime() {
        return transactionTime;
    }

    @JsonProperty("TransactionTime")
    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    @JsonProperty("TransactionTime")
    public TransactionDetails withTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    @JsonProperty("TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("TransactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("TransactionId")
    public TransactionDetails withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerNumber", customerNumber).append("accountNumber", accountNumber).append("amount", amount).append("currency", currency).append("transactionTime", transactionTime).append("transactionId", transactionId).toString();
    }
}
