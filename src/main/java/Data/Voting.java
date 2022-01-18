package Data;

import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "voted_entity_types",
        "location",
        "map"
})
public class Voting {

    @JsonProperty("voted_entity_types")
    private List<String> votedEntityTypes = null;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("map")
    private Map map;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("voted_entity_types")
    public List<String> getVotedEntityTypes() {
        return votedEntityTypes;
    }

    @JsonProperty("voted_entity_types")
    public void setVotedEntityTypes(List<String> votedEntityTypes) {
        this.votedEntityTypes = votedEntityTypes;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("map")
    public Map getMap() {
        return map;
    }

    @JsonProperty("map")
    public void setMap(Map map) {
        this.map = map;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}