package model;

import com.github.reinert.jjschema.Attributes;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ChallengeResponse {
    @Attributes(required = true, minLength = 12, maxLength = 98)
    @SerializedName("status")
    private String status;
    @SerializedName("response")
    private List<Challenge> challenges = null;
}