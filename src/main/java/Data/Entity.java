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
        "class_name",
        "game_location_id",
        "guid",
        "image_lg",
        "image_sm",
        "name"
})
public class Entity {

    @JsonProperty("class_name")
    private String className;
    @JsonProperty("game_location_id")
    private String gameLocationId;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("image_lg")
    private String imageLg;
    @JsonProperty("image_sm")
    private String imageSm;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("class_name")
    public String getClassName() {
        return className;
    }

    @JsonProperty("class_name")
    public void setClassName(String className) {
        this.className = className;
    }

    @JsonProperty("game_location_id")
    public String getGameLocationId() {
        return gameLocationId;
    }

    @JsonProperty("game_location_id")
    public void setGameLocationId(String gameLocationId) {
        this.gameLocationId = gameLocationId;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("image_lg")
    public String getImageLg() {
        return imageLg;
    }

    @JsonProperty("image_lg")
    public void setImageLg(String imageLg) {
        this.imageLg = imageLg;
    }

    @JsonProperty("image_sm")
    public String getImageSm() {
        return imageSm;
    }

    @JsonProperty("image_sm")
    public void setImageSm(String imageSm) {
        this.imageSm = imageSm;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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