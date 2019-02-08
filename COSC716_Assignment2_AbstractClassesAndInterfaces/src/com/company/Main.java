package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public interface AddrLabelInterface {
        String getAttnName();
        String getTitle(); // Mr., Mrs., etc.
        String getName();
        String getNameSuffix(); // e.g., Jr., III
        String getProfessionalSuffix(); // O.D. String getStreet();
        String getSuiteNum();
        String getCity();
        String getState();
        String getZipCode();
    }

    public abstract class AddrLabel implements AddrLabelInterface {
        public String getAttnName() {
            return "";
        }

        public String getTitle() {
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
}

