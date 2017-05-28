package com.company.model;

/**
 * Created by djha5 on 5/28/2017.
 */
public enum BloodGroup {

    A_POSITIVE("A+", "A+ve"),
    A_NEGATIVE("A-", "A-ve"),
    B_POSITIVE("B+", "B+ve"),
    B_NEGATIVE("B-", "B-ve"),
    O_POSITIVE("O+", "O+ve"),
    O_NEGATIVE("O-", "O-ve"),
    AB_POSITIVE("AB+", "AB+ve"),
    AB_NEGATIVE("AB-", "AB-ve"),
    NONE("none", "none");

    private String bldGrp;
    private String blg;

    BloodGroup(String bldGrp, String blg) {
        this.bldGrp = bldGrp;
        this.blg = blg;
    }

    public static BloodGroup fromString(String v_bldGrp) {
        for (BloodGroup bloodGroup : BloodGroup.values()) {
            return v_bldGrp.equalsIgnoreCase(bloodGroup.bldGrp) || v_bldGrp.equalsIgnoreCase(bloodGroup.blg) ? bloodGroup : NONE;
        }
        return NONE;
    }

    @Override
    public String toString() {
        return this.bldGrp;
    }

}
