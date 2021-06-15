package ex39;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */


import java.util.*;

public class RecordMap {
    private final Map<String,String> employeeName = new TreeMap<>();
    private final Map<String,String> empPosition = new TreeMap<>();
    private final Map<String, String> empSepDate = new TreeMap<>();
    private final ArrayList<Map<String,String>> employeeRecords = new ArrayList<>();

    public void fillNameMap(){
        employeeName.put("Johnson","John");
        employeeName.put("Xiong","Tou");
        employeeName.put("Michaelson", "Michaela");
        employeeName.put("Jacobson", "Jake");
        employeeName.put("Jackson","Jacquelyn");
        employeeName.put("Webber","Sally");
    }

    public void fillPositionMap(){
        empPosition.put("Johnson", "Manager");
        empPosition.put("Xiong", "Software Engineer");
        empPosition.put("Michaelson","District Manager");
        empPosition.put("Jacobson","Programmer");
        empPosition.put("Jackson", "DBA");
        empPosition.put("Webber", "Web Developer");
    }

    public void fillSepMap(){
        empSepDate.put("Johnson", "2016-12-31");
        empSepDate.put("Xiong", "2016-10-05");
        empSepDate.put("Michaelson", "2015-12-19");
        empSepDate.put("Jacobson", "");
        empSepDate.put("Jackson", "");
        empSepDate.put("Webber", "2015-12-18");

    }

    public void createListofMaps(Map<String,String> employeeName,Map<String,String> empPosition, Map<String,String> empSepDate){
       employeeRecords.add(employeeName);
       employeeRecords.add(empPosition);
       employeeRecords.add(empSepDate);
    }

    public String basicPrintList(){
        createListofMaps(employeeName,empPosition,empSepDate);
        return String.valueOf(employeeRecords);
    }


    public void formatedPrint() {
        createListofMaps(employeeName, empPosition, empSepDate);
        String header1 = "Name";
        String header2 = "Position";
        String header3 = "Separation Date";
        System.out.printf("%-20s | %-20s | %-20s%n", header1, header2, header3);
        System.out.println("---------------------|----------------------|---------------------");
        //code adapted from https://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples
        Set<Map.Entry<String, String>> names = employeeName.entrySet();
        Set<Map.Entry<String, String>> position = empPosition.entrySet();
        Set<Map.Entry<String, String>> sepDate = empSepDate.entrySet();
        String[] lName = new String[employeeName.size()];
        String[] fName = new String[employeeName.size()];
        String [] fullName = new String[employeeName.size()];
        String[] pos = new String[employeeName.size()];
        String[] sd = new String[employeeName.size()];
        int ncount = 0;
        int pcount = 0;
        int scount = 0;

        for (Map.Entry<String, String> nentry : names) {
            lName[ncount] = nentry.getKey();
            fName[ncount] = nentry.getValue();
            fullName[ncount] = fName[ncount]+" "+lName[ncount];
            ncount++;
        }
            for (Map.Entry<String, String> pentry : position) {
                pos[pcount] = pentry.getValue();
                pcount++;
            }

                for (Map.Entry<String, String> sdentry : sepDate) {
                    sd[scount] = sdentry.getValue();
                    scount++;
                }

            for (int tcount = 0; tcount < lName.length; tcount++) {
                System.out.printf("%-20s | %-20s | %-20s%n", fullName[tcount], pos[tcount], sd[tcount]);
            }

    }

}
