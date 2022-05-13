package com.company;

public class Programmer extends Person {
    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println(getName() + " programmist cod jazyp jatat! ");

    }


    @Override
    public String toString() {
        return "Programmer: " +
                super.toString() +
                "\tcompanyName - " + companyName;
    }
}
