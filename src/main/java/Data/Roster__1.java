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
        "player_id",
        "nickname",
        "avatar",
        "membership",
        "game_player_id",
        "game_player_name",
        "game_skill_level",
        "anticheat_required"
})
public class Roster__1 {

    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("membership")
    private String membership;
    @JsonProperty("game_player_id")
    private String gamePlayerId;
    @JsonProperty("game_player_name")
    private String gamePlayerName;
    @JsonProperty("game_skill_level")
    private Integer gameSkillLevel;
    @JsonProperty("anticheat_required")
    private Boolean anticheatRequired;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("membership")
    public String getMembership() {
        return membership;
    }

    @JsonProperty("membership")
    public void setMembership(String membership) {
        this.membership = membership;
    }

    @JsonProperty("game_player_id")
    public String getGamePlayerId() {
        return gamePlayerId;
    }

    @JsonProperty("game_player_id")
    public void setGamePlayerId(String gamePlayerId) {
        this.gamePlayerId = gamePlayerId;
    }

    @JsonProperty("game_player_name")
    public String getGamePlayerName() {
        return gamePlayerName;
    }

    @JsonProperty("game_player_name")
    public void setGamePlayerName(String gamePlayerName) {
        this.gamePlayerName = gamePlayerName;
    }

    @JsonProperty("game_skill_level")
    public Integer getGameSkillLevel() {
        return gameSkillLevel;
    }

    @JsonProperty("game_skill_level")
    public void setGameSkillLevel(Integer gameSkillLevel) {
        this.gameSkillLevel = gameSkillLevel;
    }

    @JsonProperty("anticheat_required")
    public Boolean getAnticheatRequired() {
        return anticheatRequired;
    }

    @JsonProperty("anticheat_required")
    public void setAnticheatRequired(Boolean anticheatRequired) {
        this.anticheatRequired = anticheatRequired;
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