package coza.opencollab.unipoole.shared;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonGetter;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The samigo POJO represents a single samigo instance per site/module
 * Samigo is quite a large Sakai tool, for our purposes we need specific information from Samigo
 * The URL to the specific tool instance on Sakai , so that students can do the tests off the live instance within the 
 * unipoole client
 * List of available assignments
 * List of submitted and or scored assignments
 *
 * @author OpenCollab
 */
public class Samigo {

    /*
     * The URL which the user will use to load the live samigo test. This is set in the unipoole-service
     */
    @JsonProperty("testsURL")
    private String testUrl;

    /*
     * A list of available assignments
     */
    private List<SamigoAvailable> available;
    /*
     * A list of submitted/scored assignments
     */
    private List<SamigoScored> scored;

    /*
     * ==================================================================================
     * Jackson parser functions
     * The unipoole client requires a named object to correctly parse json into meaningful objects
     * So we create a map of objects using their ID as a key and the object as the value
     * the JsonGetter annotation forces the parser to use this function when parsing the object to json instead 
     * of the regular getter for this attributes
     * ==================================================================================
     */
    @JsonGetter("available")
    public Map<String, SamigoAvailable> getAvailableMap() {
        Map<String, SamigoAvailable> availableMap = new LinkedHashMap<String, SamigoAvailable>();
        if (!available.isEmpty()) {
            for (SamigoAvailable sama : available) {
                availableMap.put(sama.getId(), sama);
            }
        }
        return availableMap;
    }

    @JsonGetter("scored")
    public Map<String, SamigoScored> getScoredMap() {
        Map<String, SamigoScored> scoredMap = new LinkedHashMap<String, SamigoScored>();
        if (!scored.isEmpty()) {
            for (SamigoScored sams : scored) {
                scoredMap.put(sams.getId(), sams);
            }
        }
        return scoredMap;
    }

    /*
     * =====================
     * Getters and Setters
     * =====================
     */
    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public List<SamigoAvailable> getAvailable() {
        return available;
    }

    public void setAvailable(List<SamigoAvailable> available) {
        this.available = available;
    }

    public List<SamigoScored> getScored() {
        return scored;
    }

    public void setScored(List<SamigoScored> scored) {
        this.scored = scored;
    }

    @Override
    public String toString() {
        return "Samigo{" + "testUrl=" + testUrl + " , available="+available.size() +" ,scored="+scored.size()+ '}';
    }
}
