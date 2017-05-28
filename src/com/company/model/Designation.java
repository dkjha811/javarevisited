package com.company.model;

/**
 * Created by djha5 on 5/28/2017.
 */
public enum Designation {
    TRAINEE("TR"),
    SOFTWARE_ENGINEER("SE"),
    SR_SOFTWARE_ENGINEER("SSE"),
    TEAM_LEAD("TL"),
    NONE("none");

    private String designation;

    Designation(String designation) {
        this.designation = designation;
    }

    public static Designation desigValidation(String lDesignation) {
        for (Designation desg : Designation.values()) {
            return desg.designation.equalsIgnoreCase(lDesignation) ? desg : NONE;
        }
        return NONE;
    }

    @Override
    public String toString() {
        return this.designation;
    }
}
