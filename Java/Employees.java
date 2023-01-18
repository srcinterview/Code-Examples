public class Employees {

    private static List<String> orgChart = Arrays.asList("Owner", "Manager", "Assistant Manager", "Teller", "Security");
    
    // returning a list of all employees after run through the comparator
    public List<Employee> renderOrgChart(List<Employee> allEmployees) {
        return Collections.sort(allEmployees, Employees.EmployeeComparator)
    }

    // Employee Comparator class
    static class EmployeeComparator implements Comparator<Employees> {
        
        @Override
        public int compare(Employees e1, Employees e2) {
            return orgChart.indexOf(e1.position) < orgChart.indexOf(e2.position);
        }
    }


}