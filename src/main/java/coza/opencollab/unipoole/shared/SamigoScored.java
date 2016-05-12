package coza.opencollab.unipoole.shared;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonGetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Submitted and/or scored assignemts
 *
 * @author OpenCollab
 */
public class SamigoScored {
    /*
     * The assignment title
     */

    private String title;
    /*
     * Stats relating to the assignment
     */
    private String stats;
    /*
     * The final recorded score for a submitted assignment. Becomes important when the student is allowed resubmittions
     * So they will have multiple scores, this represents the final score which is recorded
     * JSON annottation indicates the label or key which will be used when this object is parsed
     */
    @JsonProperty("recorded_score")
    private String recordedScore;
    /*
     * Any comments or feedback from the faculty regarding the assignment
     * JSON annottation indicates the label or key which will be used when this object is parsed
     */
    @JsonProperty("feedback_available")
    private String feedbackAvailable;
    /*
     * The id of the assignment, required by the mapping method for unipoole-client as a object  key but not to be included in the parse object
     * json ignore means this key value pair will not be included in the parse object
     */
    @JsonIgnore
    private String id;
    private List<SamigoScores> scores;

    /*
     * ==================================================================================
     * Jackson parser functions
     * The unipoole client requires a named object to correctly parse json into meaningful objects
     * So we create a map of objects using their ID as a key and the object as the value
     * the JsonGetter annotation forces the parser to use this function when parsing the object to json instead 
     * of the regular getter for this attributes
     * ==================================================================================
     */
    @JsonGetter("scores")
    public List<SamigoScores> getScoresList() {
        List<SamigoScores> scoresList = new ArrayList<SamigoScores>();
        if (scores != null) {
            for (SamigoScores score : scores) {
                scoresList.add(score);
            }
        }
        return scoresList;
    }

    // ==============================
    // Getters,Setters and toString
    // ==============================
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getRecordedScore() {
        return recordedScore;
    }

    public void setRecordedScore(String recordedScore) {
        this.recordedScore = recordedScore;
    }

    public String getFeedbackAvailable() {
        return feedbackAvailable;
    }

    public void setFeedbackAvailable(String feedbackAvailable) {
        this.feedbackAvailable = feedbackAvailable;
    }

    public List<SamigoScores> getScores() {
        return scores;
    }

    public void setScores(List<SamigoScores> scores) {
        this.scores = scores;
    }

    public void addScore(SamigoScores score) {
        if (scores == null) {
            scores = new ArrayList<SamigoScores>();
        }
        if (score != null) {
            scores.add(score);
        }
    }

    @Override
    public String toString() {
        return "SamigoScored{ title=" + title + ", stats=" + stats + ", recordedScore=" + recordedScore + ", feedbackAvailable=" + feedbackAvailable + ", scores=" + scores + '}';
    }
}
