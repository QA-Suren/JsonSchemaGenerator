package model;

import com.github.reinert.jjschema.Attributes;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
@Attributes(description = "Challenge object")
public class Challenge {

    @Attributes(required = true)
    @SerializedName("data")
    private List<String > data ;
    @Attributes(minimum = 0)
    @SerializedName("cursor")
    private Integer cursor;
    @SerializedName("title")
    private String title;
    @SerializedName("type")
    private String type;
    @SerializedName("content_url")
    private String contentUrl;
    @SerializedName("header_title")
    private String headerTitle;
    @SerializedName("desc")
    private String desc;
    @SerializedName("min_desc")
    private String minDesc;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("rules")
    private String rules;
    @SerializedName("name")
    private String name;
    @SerializedName("cover")
    private String cover;
    @SerializedName("thumb")
    private String thumb;
    @SerializedName("banner")
    private String banner;
    @Attributes(required = true, minimum = 0, maximum = 12)
    @SerializedName("version")
    private Integer version;
    @SerializedName("created")
    private String created;
    @SerializedName("contest_type")
    private String contestType;
    @SerializedName("rule")
    private String rule;
    @SerializedName("prize")
    private String prize;
    @SerializedName("started")
    private String started;
    @SerializedName("closed")
    private String closed;
    @SerializedName("ended")
    private String ended;
    @SerializedName("headline")
    private String headline;
    @SerializedName("experiments")
    private List<Object> experiments = null;
    @SerializedName("segments")
    private List<Object> segments = null;
    @SerializedName("visibility")
    private String visibility;
    @SerializedName("promoted_position")
    private Integer promotedPosition;
    @SerializedName("is_source_updated")
    private Boolean isSourceUpdated;
    @SerializedName("tutorial_url")
    private String tutorialUrl;
    @SerializedName("owner")
    private String user;
    @SerializedName("id")
    private String id;
    @SerializedName("state")
    private String state;
    @SerializedName("share_options")
    private String shareOptions;
    @SerializedName("submissions_count")
    private Integer submissionsCount;
    @SerializedName("asset")
    private String asset;
    @SerializedName("remix_item_id")
    private Long remixItemId;
}