public class Employees {

    private static List<String> orgChart = Arrays.asList("Owner", "Manager", "Assistant Manager", "Teller", "Security");
    
    public List<Employee> renderOrgChart(List<Employee> allEmployees) {
        return Collections.sort(allEmployees, Employees.EmployeeComparator)
    }

    static class EmployeeComparator implements Comparator<Employees> {
        
        @Override
        public int compare(Employees e1, Employees e2) {
            return orgChart.indexOf(e1.position) < orgChart.indexOf(e2.position);
        }
    }


}