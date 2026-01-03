package startup.project.lumera.ui.model;

public class ScanResult {

    private String skinType;
    private float hydration;
    private float oiliness;
    private float acneScore;
    private String recommendation;

    public ScanResult(String skinType, float hydration,
                      float oiliness, float acneScore,
                      String recommendation) {
        this.skinType = skinType;
        this.hydration = hydration;
        this.oiliness = oiliness;
        this.acneScore = acneScore;
        this.recommendation = recommendation;
    }

    public String getSkinType() {
        return skinType;
    }

    public float getHydration() {
        return hydration;
    }

    public float getOiliness() {
        return oiliness;
    }

    public float getAcneScore() {
        return acneScore;
    }

    public String getRecommendation() {
        return recommendation;
    }
}

