package coza.opencollab.unipoole.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This represents an assignment
 *
 * @author OpenCollab
 * @since 1.0.0
 */
public class Assignment implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("author_last_modified")
    private String authorLastModified;
    @JsonProperty("context")
    private String context;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("drop_dead_time")
    private String dropDeadTime;
    @JsonProperty("due_time")
    private String dueTime;
    @JsonProperty("group_project")
    private String groupProject;
    @JsonProperty("id")
    private String id;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("max_grade_point_display")
    private String maxGradePointDisplay;
    @JsonProperty("open_time")
    private String openTime;
    @JsonProperty("title")
    private String title;
    private List<Attachment> attachments;
    
    /**
     * ================ Getters and Setters ================
     */
    
    public String getAuthorLastModified() {
        return authorLastModified;
    }

    public void setAuthorLastModified(String authorLastModified) {
        this.authorLastModified = authorLastModified;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDropDeadTime() {
        return dropDeadTime;
    }

    public void setDropDeadTime(String dropDeadTime) {
        this.dropDeadTime = dropDeadTime;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getGroupProject() {
        return groupProject;
    }

    public void setGroupProject(String groupProject) {
        this.groupProject = groupProject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getMaxGradePointDisplay() {
        return maxGradePointDisplay;
    }

    public void setMaxGradePointDisplay(String maxGradePointDisplay) {
        this.maxGradePointDisplay = maxGradePointDisplay;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
    
    public void addToAttachments(Attachment attachment) {
        if(this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
            this.attachments.add(attachment);
        }
        else {
            this.attachments.add(attachment);
        }
    }
}
