package coza.opencollab.unipoole.shared;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonGetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonSetter;

/**
 * Discussion represents the second level of a Yaft forum. Forum being the
 * parent of a discussion.
 *
 * @author OpenCollab
 */
public class Discussion {
    /**
     * Uniquely identifying ID for a discussion e.g. 1e670df9-7dd5-4b90-a001-1d819ca2b821
     */
    private String id;
    /**
     * forum id to which it belongs e.g. 915aa66a-4906-4a8a-a092-fbff5db6645d
     */
    @JsonProperty("forum_id")
    private String forumId;
    /*
     * The displayable creator name for this discussion
     */
    @JsonProperty("creator_name")
    private String creatorName;
    /**
     * The sakai id for the creator e.g. 06fb52c6-cdaa-47da-8def-5300f0a06482
     */
    @JsonProperty("creator_id")
    private String creatorId;
    /**
     * Date when the discussion was created.
     */
    @JsonProperty("create_date")
    private Date createDate;
    /**
     * PageID which is usually blank
     */
    @JsonProperty("page_id")
    private String pageId;
    /**
     * Site ID/module name to which this discussion belongs
     */
    @JsonProperty("site_id")
    private String siteId;
    /**
     * Discussion topic
     */
    private String topic;
    /**
     * Absolute URL to this discussion
     */
    private String url;
    /**
     * Content of the discussion ,you could say the description of the disucssion whcih also 
     * becomes the first message of the discussion
     */
    private String content;
    /**
     * Number of messages in this discussion
     */
    @JsonProperty("message_count")
    private int messageCount;
    /**
     * List of message objects which belong to this discussion
     */
    private List<Message> messages;
    /**
     * Date of the last created or updated message in this duscussion
     */
    @JsonProperty("last_message_date")
    private Date lastMessageDate;
    
    /**
     * Number of attachments this discussion has
     */
    @JsonProperty("attachment_count")
    private int attachmentCount;
    
    /**
     * Attachments for the Discussion
     */
    private List<Attachment> attachments;

    /*
     * ==================================================================================
     * Jackson parser functions
     * The unipoole client requires a named object to correctly parse json into meaningful objects
     * So we create a map of objects using their ID as a key and the object as the value
     * the JsonGetter annotation forces the parser to use this function when parsing the object to json instead 
     * of the regular getter for this attributes
     * ==================================================================================
     */
    @JsonGetter("messages")
    public Map<String, Message> getMessagesMap() {
        Map<String, Message> messagesMap = new LinkedHashMap<String, Message>();
        if (!messages.isEmpty()) {
            for (Message message : messages) {
                messagesMap.put(message.getId(), message);
            }
        }
        return messagesMap;
    }

    @JsonSetter("messages")
    public void setMessagesMap(Map<String, Message> messagesMap) {
        Iterator it = messagesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            messages.add((Message) pairs.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

    /**
     * ====================== Getters, Setters and toString
     * =========================
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public Date getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createdDate) {
        this.createDate = createdDate;
    }
    
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
    
    public int getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(int attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    @JsonIgnore
    public void addToAttachments(Attachment attachment) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
        }
        if (attachment != null) {
            this.attachments.add(attachment);
        }
    }

    @Override
    public String toString() {
        return "Discussion{" + "id=" + id + ", forumId=" + forumId + ", creatorName=" + creatorName + ", creatorId=" + creatorId + ", createdDate=" + createDate + ", pageId=" + pageId + ", siteId=" + siteId + ", topic=" + topic + ", url=" + url + ", content=" + content + ", messageCount=" + messageCount + ", messages=" + messages + ", lastMessageDate=" + lastMessageDate + '}';
    }
}
