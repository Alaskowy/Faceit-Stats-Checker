package Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "faction_id",
        "leader",
        "avatar",
        "roster",
        "substituted",
        "name",
        "type"
})
public class Faction1 {

    @JsonProperty("faction_id")
    private String factionId;
    @JsonProperty("leader")
    private String leader;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("roster")
    private List<Roster> roster = null;
    @JsonProperty("substituted")
    private Boolean substituted;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faction_id")
    public String getFactionId() {
        return factionId;
    }

    @JsonProperty("faction_id")
    public void setFactionId(String factionId) {
        this.factionId = factionId;
    }

    @JsonProperty("leader")
    public String getLeader() {
        return leader;
    }

    @JsonProperty("leader")
    public void setLeader(String leader) {
        this.leader = leader;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("roster")
    public List<Roster> getRoster() {
        return roster;
    }

    @JsonProperty("roster")
    public void setRoster(List<Roster> roster) {
        this.roster = roster;
    }

    @JsonProperty("substituted")
    public Boolean getSubstituted() {
        return substituted;
    }

    @JsonProperty("substituted")
    public void setSubstituted(Boolean substituted) {
        this.substituted = substituted;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}