package coza.opencollab.unipoole.shared;

import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This POJO represents an available/un-taken/un-submitted Samigo assignment
 *
 * @author OpenCollab
 */
public class SamigoAvailable {
    /*
     * The samigo specific id long value, but stored as String to keep in standard with other modules.
     */

    private String id;
    /*
     * assingment title
     */
    private String title;
    /*
     * Assignment time limit, e.g. 1h , 1d etc
     * json annotation means that when this pojo is parsed into json it will use the annotation instead of the pojo attribute name
     */
    @JsonProperty("time_limit")
    private String timeLimit;
    /*
     * Assignment due date
     * json annotation means that when this pojo is parsed into json it will use the annotation instead of the pojo attribute name
     */
    @JsonProperty("date_due")
    private Date dateDue;

    /*
     * =========================================================================
     * Getters ,setters and toStrig
     * =========================================================================
     */
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

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    @Override
    public String toString() {
        return "SamigoAvailable{ id=" + id + ", title=" + title + ", timeLimit=" + timeLimit + ", dateDue=" + dateDue + '}';
    }
}
