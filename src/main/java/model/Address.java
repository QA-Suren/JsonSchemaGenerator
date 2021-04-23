package model;

import com.github.reinert.jjschema.Attributes;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Address {

    @SerializedName("key")
    String key;
    @SerializedName("email")
    public String email;
    @SerializedName("provider")
    public String provider;
    @SerializedName("registered")
    public boolean registered;
    @SerializedName("mature")
    public boolean mature;
    @SerializedName("email_subscription_token")
    public String emailSubscriptionToken;

    @SerializedName("subscription")
    public String subscriptionInfo;

    @SerializedName("notification_settings")
    private String notificationSettings;

    @SerializedName("username_changed")
    public boolean usernameChanged = false;

    @SerializedName("resolved_location")
    public String location;

    @SerializedName("shop_subscriptions")
    public List<String> shopSubscriptionParams;

    @SerializedName("verified_emails")
    public List<String> verifiedEmails;

    @SerializedName("connections")
    private List<Employee> connectionsJson;
}
