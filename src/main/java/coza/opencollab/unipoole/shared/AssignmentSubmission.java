package coza.opencollab.unipoole.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This represents an assignment submission
 *
 * @author OpenCollab
 * @since 1.0.0
 */
public class AssignmentSubmission  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("assignment_id")
    private String assignmentId;
    @JsonProperty("context")
    private String context;
    @JsonProperty("feedback_comment")
    private String feedbackComment;
    @JsonProperty("feedback_text")
    private String feedbackText;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("grade_released")
    private String gradeReleased;
    @JsonProperty("graded")
    private String graded;
    @JsonProperty("id")
    private String id;
    @JsonProperty("submitted_text")
    private String submittedText;
    private List<Attachment> attachments;

    /**
     * ================ Getters and Setters ================
     */
    
    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }
    
    public String getAssignmentId() {
        return assignmentId;
    }
    
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGradeReleased() {
        return gradeReleased;
    }

    public void setGradeReleased(String gradeReleased) {
        this.gradeReleased = gradeReleased;
    }

    public String getGraded() {
        return graded;
    }

    public void setGraded(String graded) {
        this.graded = graded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setSubmittedText(String submittedText) {
        this.submittedText = submittedText;
    }
    
    public String getSubmittedText() {
        return submittedText;
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
