package coza.opencollab.unipoole.shared;

import java.util.Date;

/**
 * The FAQ content object containing the question and answer
 * 
 * @author OpenCollab
 */
public class Faq {
    
    /**
     * UID for each question
     */
    private int id;
    
    /**
     * The id of the category if it is a content node
     */
    private int parentId;
    
    /**
     * Description if it is a category
     */
    private String description;
    
    /**
     * Question
     */
    private String question;
    
    /**
     * Answer
     */
    private String answer;
    
    /**
     * Date of last change
     */
    private Date modifiedOn;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @return the modifiedOn
     */
    public Date getModifiedOn() {
        return modifiedOn;
    }

    /**
     * @param modifiedOn the modifiedOn to set
     */
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * @return the parentId
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
