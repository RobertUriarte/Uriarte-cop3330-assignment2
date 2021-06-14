/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise39;
import java.util.*;
public class Exercise39 {
    public static void main(String[] args){
        List<Map<String, String>> employeeList = create_list_of_maps();
        System.out.println("Name                | Position              | Separation Date");
        System.out.println("--------------------|-----------------------|----------------");
        String employee = "";
        for(int i = 0; i < 6; i++){
            employee = print_employees(employeeList,i);
        }
    }
    public static String print_employees(List<Map<String, String>> employeeList, int i){
        switch (i) {
            case 0 -> {
                System.out.printf("%s %s\t| %s\t\t\t\t\t|%s\n", employeeList.get(i).get("First"), employeeList.get(i).get("Last"), employeeList.get(i).get("Position"), employeeList.get(i).get("Separation Date"));
                return employeeList.get(i).get("First");
            }
            case 1 -> {
                System.out.printf("%s %s\t\t| %s\t\t\t|%s\n", employeeList.get(i).get("First"), employeeList.get(i).get("Last"), employeeList.get(i).get("Position"), employeeList.get(i).get("Separation Date"));
                return employeeList.get(i).get("First");
            }
            case 2 -> {
                System.out.printf("%s %s\t\t| %s\t\t\t\t|%s\n", employeeList.get(i).get("First"), employeeList.get(i).get("Last"), employeeList.get(i).get("Position"), employeeList.get(i).get("Separation Date"));
                return employeeList.get(i).get("First");
            }
            case 3 -> {
                System.out.printf("%s %s\t| %s\t\t|%s\n", employeeList.get(i).get("First"), employeeList.get(i).get("Last"), employeeList.get(i).get("Position"), employeeList.get(i).get("Separation Date"));
                return employeeList.get(i).get("First");
            }
            case 4 -> {
                System.out.printf("%s %s \t\t| %s\t\t\t|%s\n", employeeList.get(i).get("First"), employeeList.get(i).get("Last"), employeeList.get(i).get("Position"), employeeList.get(i).get("Separation Date"));
                return employeeList.get(i).get("First");
            }
            case 5 -> {
                System.out.printf("%s %s\t\t\t| %s\t\t|%s\n", employeeList.get(i).get("First"), employeeList.get(i).get("Last"), employeeList.get(i).get("Position"), employeeList.get(i).get("Separation Date"));
                return employeeList.get(i).get("First");
            }
        }
        return "wrong";
    }
    public static List<Map<String, String>> create_list_of_maps(){
        List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("First","John");
        map1.put("Last","Johnson");
        map1.put("Position","Manager");
        map1.put("Separation Date","2016-12-31");
        employeeList.add(map1);

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("First","Tou");
        map2.put("Last","Xiong");
        map2.put("Position","Software Engineer");
        map2.put("Separation Date","2016-10-15");
        employeeList.add(map2);

        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("First","Michaela");
        map3.put("Last","Michaelson");
        map3.put("Position","District Manager");
        map3.put("Separation Date","2015-12-19");
        employeeList.add(map3);

        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("First","Jake");
        map4.put("Last","Jacobson");
        map4.put("Position","Programmer");
        map4.put("Separation Date","");
        employeeList.add(map4);

        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("First","Jacquelyn");
        map5.put("Last","Jackson");
        map5.put("Position","DBA");
        map5.put("Separation Date","");
        employeeList.add(map5);

        Map<String, String> map6 = new HashMap<String, String>();
        map6.put("First","Sally");
        map6.put("Last","Webber");
        map6.put("Position","Web Developer");
        map6.put("Separation Date","2015-12-18");
        employeeList.add(map6);

        employeeList.sort(new Comparator<Map<String, String>>() {
            public int compare(final Map<String, String> m1, final Map<String, String> m2) {
                return m1.get("First").compareTo(m2.get("First"));
            }
        });

        return employeeList;
    }
}
