package coza.opencollab.unipoole.shared;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonGetter;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Forum pojo is representitve of the Yaft structure.
 * Yaft can have multiple forums per tool instance per site. 
 * site/module can have multiple yaft instances, each instance can have multiple Forums
 * @author OpenCollab
 */
public class Forum {
    /*
     * Sakai formatted id e.g. a23f6f88-65cc-4611-b77e-95fa9daa76b1
     */
    private String id;
    /*
     * Forum title
     */
    private String title;
    /*
     * Creator id e.g. e1e8215d-0c36-4111-a5d1-ffa8908f1506
     * when jackson parse this object it will use the annotated value and the label/key when generating json 
     * instead of the vairable name
     */
    @JsonProperty("creator_id")
    private String creatorId;
    /*
     * The forum creators actual name ready for display
     */
    @JsonProperty("creator_name")
    private String creatorName;
    /*
     * Forum description
     */
    private String description;
    /*
     * The site/module ID
     */
    @JsonProperty("site_id")
    private String siteId;
    /*
     * Number of discussions/topics which belong to this forum
     */
    private int topics;
    /* 
     * Number of messages contained in the topics
     */
    private int messages;
    /*
     * Forum status e.g. READY , DELETED etc
     */
    private String status;
    /*
     * The start date
     */
    @JsonProperty("start")
    private Date startDate;
    /*
     * The end date
     */
    @JsonProperty("end")
    private Date endDate;
    /*
     * Direct URL to this forum in sakai
     */
    private String url;
    /*
     * The last message to be created or updated in this forum/disucssions/messages
     */
    @JsonProperty("last_message_date")
    private Date lastMessageDate;
    /*
     * number of unread messages
     */
    private int unread;
    /*
     * List of discussions belonging to this forum
     */
    private List<Discussion> discussions;
    
    /*
     * ==================================================================================
     * Jackson parser functions
     * The unipoole client requires a named object to correctly parse json into meaningful objects
     * So we create a map of objects using their ID as a key and the object as the value
     * the JsonGetter annotation forces the parser to use this function when parsing the object to json instead 
     * of the regular getter for this attribute
     * ==================================================================================
     */
    @JsonGetter("discussions")
    public Map<String, Discussion> getDiscussionsMap() {
        Map<String, Discussion> discussionsMap = new LinkedHashMap<String, Discussion>();
        if (discussions != null && !discussions.isEmpty()) {
            for (Discussion discuss : discussions) {
                discussionsMap.put(discuss.getId(), discuss);
            }
        }
        return discussionsMap;
    }
    
    /**
     * ============== Getters and Setters ===============
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

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTopics() {
        return topics;
    }

    public void setTopics(int topics) {
        this.topics = topics;
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public int getUnread() {
        return unread;
    }

    public void setUnread(int unread) {
        this.unread = unread;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public List<Discussion> getDiscussions() {
        return discussions;
    }


    public void setDiscussions(List<Discussion> discussions) {
        this.discussions = discussions;
    }

    @Override
    public String toString() {
        return "Forum{ id=" + id + ", title=" + title + ", creatorId=" + creatorId + ", creatorName=" + creatorName + ", description=" + description + ", siteId=" + siteId + ", topics=" + topics + ", messages=" + messages + ", Status=" + status + ", startDate=" + startDate + ", endDate=" + endDate + ", url=" + url + ", lastMessageDate=" + lastMessageDate + ", unread=" + unread + '}';
    }
}
