package coza.opencollab.unipoole.shared;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * This represents the welcome tool content
 *
 * @author OpenCollab
 * @since 1.0.0
 */
public class Welcome {
    
    /**
     * The HTML content that is displayed in the Welcome tool, there will only be
     * one content entry for a site
     */
    private String content;
    /**
     * List of attachments associated with the message.
     */
    private List<Attachment> attachments;

    /**
     * The HTML content in the welcome tool
     * 
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * The HTML content in the welcome tool
     * 
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * List of attachments associated with the message.
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * List of attachments associated with the message.
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * Add a attachment associated with the message.
     */
    @JsonIgnore
    public void addToAttachments(Attachment attachment) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
        }
        if (attachment != null) {
            this.attachments.add(attachment);
        }
    }
}
