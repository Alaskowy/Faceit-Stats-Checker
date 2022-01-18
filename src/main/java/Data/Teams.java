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
        "faction1",
        "faction2"
})

public class Teams {

    @JsonProperty("faction1")
    private Faction1 faction1;
    @JsonProperty("faction2")
    private Faction2 faction2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faction1")
    public Faction1 getFaction1() {
        return faction1;
    }

    @JsonProperty("faction1")
    public void setFaction1(Faction1 faction1) {
        this.faction1 = faction1;
    }

    @JsonProperty("faction2")
    public Faction2 getFaction2() {
        return faction2;
    }

    @JsonProperty("faction2")
    public void setFaction2(Faction2 faction2) {
        this.faction2 = faction2;
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