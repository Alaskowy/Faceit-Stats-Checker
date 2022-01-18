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
        "match_id",
        "version",
        "game",
        "region",
        "competition_id",
        "competition_type",
        "competition_name",
        "organizer_id",
        "teams",
        "voting",
        "calculate_elo",
        "configured_at",
        "started_at",
        "chat_room_id",
        "best_of",
        "results",
        "status",
        "faceit_url"
})
public class Match {

    @JsonProperty("match_id")
    private String matchId;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("game")
    private String game;
    @JsonProperty("region")
    private String region;
    @JsonProperty("competition_id")
    private String competitionId;
    @JsonProperty("competition_type")
    private String competitionType;
    @JsonProperty("competition_name")
    private String competitionName;
    @JsonProperty("organizer_id")
    private String organizerId;
    @JsonProperty("teams")
    private Teams teams;
    @JsonProperty("voting")
    private Voting voting;
    @JsonProperty("calculate_elo")
    private Boolean calculateElo;
    @JsonProperty("configured_at")
    private Integer configuredAt;
    @JsonProperty("started_at")
    private Integer startedAt;
    @JsonProperty("chat_room_id")
    private String chatRoomId;
    @JsonProperty("best_of")
    private Integer bestOf;
    @JsonProperty("results")
    private Results results;
    @JsonProperty("status")
    private String status;
    @JsonProperty("faceit_url")
    private String faceitUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match_id")
    public String getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("game")
    public String getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(String game) {
        this.game = game;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("competition_id")
    public String getCompetitionId() {
        return competitionId;
    }

    @JsonProperty("competition_id")
    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    @JsonProperty("competition_type")
    public String getCompetitionType() {
        return competitionType;
    }

    @JsonProperty("competition_type")
    public void setCompetitionType(String competitionType) {
        this.competitionType = competitionType;
    }

    @JsonProperty("competition_name")
    public String getCompetitionName() {
        return competitionName;
    }

    @JsonProperty("competition_name")
    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    @JsonProperty("organizer_id")
    public String getOrganizerId() {
        return organizerId;
    }

    @JsonProperty("organizer_id")
    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    @JsonProperty("teams")
    public Teams getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    @JsonProperty("voting")
    public Voting getVoting() {
        return voting;
    }

    @JsonProperty("voting")
    public void setVoting(Voting voting) {
        this.voting = voting;
    }

    @JsonProperty("calculate_elo")
    public Boolean getCalculateElo() {
        return calculateElo;
    }

    @JsonProperty("calculate_elo")
    public void setCalculateElo(Boolean calculateElo) {
        this.calculateElo = calculateElo;
    }

    @JsonProperty("configured_at")
    public Integer getConfiguredAt() {
        return configuredAt;
    }

    @JsonProperty("configured_at")
    public void setConfiguredAt(Integer configuredAt) {
        this.configuredAt = configuredAt;
    }

    @JsonProperty("started_at")
    public Integer getStartedAt() {
        return startedAt;
    }

    @JsonProperty("started_at")
    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    @JsonProperty("chat_room_id")
    public String getChatRoomId() {
        return chatRoomId;
    }

    @JsonProperty("chat_room_id")
    public void setChatRoomId(String chatRoomId) {
        this.chatRoomId = chatRoomId;
    }

    @JsonProperty("best_of")
    public Integer getBestOf() {
        return bestOf;
    }

    @JsonProperty("best_of")
    public void setBestOf(Integer bestOf) {
        this.bestOf = bestOf;
    }

    @JsonProperty("results")
    public Results getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Results results) {
        this.results = results;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("faceit_url")
    public String getFaceitUrl() {
        return faceitUrl;
    }

    @JsonProperty("faceit_url")
    public void setFaceitUrl(String faceitUrl) {
        this.faceitUrl = faceitUrl;
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