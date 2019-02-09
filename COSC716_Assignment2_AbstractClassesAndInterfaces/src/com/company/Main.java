package com.company;

public class Main {

    public static void main(String[] args) {
        FriendAddrLabel friendLabel = new FriendAddrLabel();
        System.out.printf(friendLabel.getName());

        String[] resultLabel = LabelGenerator.getLabelLines(friendLabel);
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
    private String name = "Joe Test";
    private String street = "Main St.";
    private String city = "Helena";
    private String state = "MT";
    private String zipCode = "85938";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }
}

class CompanyAddrLabel extends AddrLabel {
    private String attnName = "Joe Attn";
    private String title= "Director of Operations";
    private String companyName= "ABC Co.";
    private String street = " 44 Main St.";
    private String city = "Baltimore";
    private String state = "MD";
    private String zipCode = "21212";

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
        return new String [] {addr.getName(), addr.getStreet(), addr.getCity(), addr.getState(), addr.getZipCode()};
    }
}