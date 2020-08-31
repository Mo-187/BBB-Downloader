package moritz.bigbluebutton.elements;

public class BBBElement {

    String url;
    float in;
    float out;

    public BBBElement(String url, float in, float out) {
        this.url = url;
        this.in = in;
        this.out = out;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getIn() {
        return in;
    }

    public void setIn(float in) {
        this.in = in;
    }

    public float getOut() {
        return out;
    }

    public void setOut(float out) {
        this.out = out;
    }

}
