package com.bhagya.practice.model;

public class Instruction {

    private String Instruction;
    private String TermsAndCondition;
    private String AgreeAndContinue;

    @Override
    public String toString() {
        return "Instruction{" +
                "Instruction='" + Instruction + '\'' +
                ", TermsAndCondition='" + TermsAndCondition + '\'' +
                ", AgreeAndContinue='" + AgreeAndContinue + '\'' +
                '}';
    }

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String instruction) {
        Instruction = instruction;
    }

    public String getTermsAndCondition() {
        return TermsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        TermsAndCondition = termsAndCondition;
    }

    public String getAgreeAndContinue() {
        return AgreeAndContinue;
    }

    public void setAgreeAndContinue(String agreeAndContinue) {
        AgreeAndContinue = agreeAndContinue;
    }
}
