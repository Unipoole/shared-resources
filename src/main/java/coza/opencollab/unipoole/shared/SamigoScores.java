package coza.opencollab.unipoole.shared;

/**
 * Each submitted and graded assignment has a score, if resubmits are allowed an assignment can have multiple scores.
 * @author OpenCollab
 */
public class SamigoScores {
    /*
     * The individual score for this grading for the assignment, not guarenteed to be the final score
     */
    private String individualScore;
    /*
     * the time it took to complete the assessment
     */
    private String time;
    /*
     * The time the submission was made.
     */
    private String submitted;

    // ====================================================
    // Getters, setters and toString
    // ====================================================
    public String getIndividualScore() {
        return individualScore;
    }

    public void setIndividualScore(String individualScore) {
        this.individualScore = individualScore;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    @Override
    public String toString() {
        return "SamigoScores{" + "individualScore=" + individualScore + ", time=" + time + ", submitted=" + submitted + '}';
    }
}
