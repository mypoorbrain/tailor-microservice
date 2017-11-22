package ng.com.soh.ms.core.model;

import javax.validation.constraints.NotNull;

/**
 * Created by Blurryface on 10/25/17.
 */
public class Measurement extends BaseModel {
    @NotNull
    private int biceps;
    @NotNull
    private int blazerLength;
    @NotNull
    private int chest;
    @NotNull
    private int crotch;
    @NotNull
    private int hip;
    @NotNull
    private int knee;
    @NotNull
    private int neck;
    @NotNull
    private int pantsLength;
    @NotNull
    private int shoulders;
    @NotNull
    private int sleeve;
    @NotNull
    private int stomach;
    @NotNull
    private int thigh;
    @NotNull
    private int wrist;

    public int getBiceps() {
        return biceps;
    }

    public void setBiceps(int biceps) {
        this.biceps = biceps;
    }

    public int getBlazerLength() {
        return blazerLength;
    }

    public void setBlazerLength(int blazerLength) {
        this.blazerLength = blazerLength;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getCrotch() {
        return crotch;
    }

    public void setCrotch(int crotch) {
        this.crotch = crotch;
    }

    public int getHip() {
        return hip;
    }

    public void setHip(int hip) {
        this.hip = hip;
    }

    public int getKnee() {
        return knee;
    }

    public void setKnee(int knee) {
        this.knee = knee;
    }

    public int getNeck() {
        return neck;
    }

    public void setNeck(int neck) {
        this.neck = neck;
    }

    public int getPantsLength() {
        return pantsLength;
    }

    public void setPantsLength(int pantsLength) {
        this.pantsLength = pantsLength;
    }

    public int getShoulders() {
        return shoulders;
    }

    public void setShoulders(int shoulders) {
        this.shoulders = shoulders;
    }

    public int getSleeve() {
        return sleeve;
    }

    public void setSleeve(int sleeve) {
        this.sleeve = sleeve;
    }

    public int getStomach() {
        return stomach;
    }

    public void setStomach(int stomach) {
        this.stomach = stomach;
    }

    public int getThigh() {
        return thigh;
    }

    public void setThigh(int thigh) {
        this.thigh = thigh;
    }

    public int getWrist() {
        return wrist;
    }

    public void setWrist(int wrist) {
        this.wrist = wrist;
    }
}
