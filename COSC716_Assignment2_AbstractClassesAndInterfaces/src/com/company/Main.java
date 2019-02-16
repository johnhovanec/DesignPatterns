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
            "02125"
        );

        ProfessionalAddrLabel professionalLabel = new ProfessionalAddrLabel(
            "James Tester",
            "M.D.",
            "55 Main Street",
            "603",
            "Towson",
            "MD",
            "21204"
        );

        AddrLabelInterface[] labels = {friendLabel, companyLabel, professionalLabel};

        for (int i = 0; i < labels.length; i++) {
            AddrLabelInterface currentLabel = labels[i];
            String[] resultLabel = LabelGenerator.getLabelLines(currentLabel);

            for(int j = 0; j < resultLabel.length; j++) {
                System.out.printf(resultLabel[j]);
            }
            System.out.println('\n');
        }
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
        return "ATTN: " + attnName + "%n";
    }

    @Override
    public String getTitle() {
        return title + "%n";
    }

    @Override
    public String getCompanyName() {
        return companyName + "%n";
    }

    @Override
    public String getName() {
        return "";
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

class ProfessionalAddrLabel extends AddrLabel {
    public ProfessionalAddrLabel(String name, String professionalSuffix, String street, String suite, String city, String state, String zipCode) {
        this.name = name;
        this.professionalSuffix = professionalSuffix;
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    private String name;
    private String professionalSuffix;
    private String street;
    private String suite;
    private String city;
    private String state;
    private String zipCode;

    @Override
    public String getName() {
        return name + ", ";
    }

    @Override
    public String getProfessionalSuffix() {
        return professionalSuffix + "%n";
    }

    @Override
    public String getStreet() {
        return street + ", ";
    }

    @Override
    public String getSuiteNum() { return "Suite " + suite + "%n"; }

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
        return zipCode + "%n";
    }
}

class LabelGenerator {
    public static String[] getLabelLines(AddrLabelInterface addr) {
        return new String [] {
            addr.getAttnName(),
            addr.getTitle(),
            addr.getName(),
            addr.getCompanyName(),
            addr.getNameSuffix(),
            addr.getProfessionalSuffix(),
            addr.getStreet(),
            addr.getSuiteNum(),
            addr.getCity(),
            addr.getState(),
            addr.getZipCode()
        };
    }
}