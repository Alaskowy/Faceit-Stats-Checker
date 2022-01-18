package Data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "faction2",
        "faction1"
})
public class Score {

    @JsonProperty("faction2")
    private Integer faction2;
    @JsonProperty("faction1")
    private Integer faction1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faction2")
    public Integer getFaction2() {
        return faction2;
    }

    @JsonProperty("faction2")
    public void setFaction2(Integer faction2) {
        this.faction2 = faction2;
    }

    @JsonProperty("faction1")
    public Integer getFaction1() {
        return faction1;
    }

    @JsonProperty("faction1")
    public void setFaction1(Integer faction1) {
        this.faction1 = faction1;
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