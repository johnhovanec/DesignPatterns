package com.company;

public class Main {

    public static void main(String[] args) {
        FriendAddrLabel friendLabel = new FriendAddrLabel(
                "Joe Test",
                "123 Main Street",
                "Helena",
                "MT",
                "82302"
        );

        CompanyAddrLabel companyLabel = new CompanyAddrLabel(
                "Rebecca Rollins",
                "Principal Architect",
                "A1 Technology",
                "85 Main Street",
                "Watertown",
                "MA",
                "021225"
        );

        String[] resultLabel = LabelGenerator.getLabelLines(friendLabel);
        resultLabel = LabelGenerator.getLabelLines(companyLabel);
        System.out.printf(String.valueOf(resultLabel[0]));
    }
}

interface AddrLabelInterface {
    String getAttnName();
    String getTitle(); // Mr., Mrs., etc.
    String getName();
    String getCompanyName();
    String getNameSuffix(); // e.g., Jr., III
    String getProfessionalSuffix(); // O.D.
    String getStreet();
    String getSuiteNum();
    String getCity();
    String getState();
    String getZipCode();
}

abstract class AddrLabel implements AddrLabelInterface {
    public String getAttnName() {
        return "";
    }
    public String getTitle() {
        return "";
    }
    public String getCompanyName() {
        return "";
    }
    public String getNameSuffix() {
        return "";
    }
    public String getProfessionalSuffix() {
        return "";
    }
    public String getSuiteNum() {
        return "";
    }
}

class FriendAddrLabel extends AddrLabel {

    public FriendAddrLabel(String name, String street, String city, String state, String zipCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    private String name;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @Override
    public String getName() {
        return name + "%n";
    }

    @Override
    public String getStreet() {
        return street + "%n";
    }

    @Override
    public String getCity() {
        return city + ", ";
    }

    @Override
    public String getState() {
        return state + " ";
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }
}

class CompanyAddrLabel extends AddrLabel {

    public CompanyAddrLabel(String attnName, String title, String companyName, String street, String city, String state, String zipCode) {
        this.attnName = attnName;
        this.title = title;
        this.companyName = companyName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    private String attnName;
    private String title;
    private String companyName;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @Override
    public String getAttnName() {
        return "ATTN: " + attnName;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return null;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public String getZipCode() {
        return null;
    }
}

class ProfessionalAddrLabel extends AddrLabel {
    private String name = "Joe Prof";
    private String professionalSuffix= "M.D.";
    private String street = "121 Main St.";
    private String suite= "321";
    private String city = "Baltimore";
    private String state = "MD";
    private String zipCode = "21212";

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getProfessionalSuffix() {
        return professionalSuffix;
    }

    @Override
    public String getStreet() {
        return null;
    }

    @Override
    public String getSuiteNum() {
        return suite;
    }

    @Override
    public String getCity() {
        return null;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public String getZipCode() {
        return null;
    }
}

class LabelGenerator {
    public static String[] getLabelLines(AddrLabelInterface addr) {
        return new String [] {addr.getName().concat(addr.getStreet()).concat(addr.getCity()).concat(addr.getState()).concat(addr.getZipCode())};
    }
}