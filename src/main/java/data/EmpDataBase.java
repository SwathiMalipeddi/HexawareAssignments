package data;

import java.util.Arrays;
import java.util.List;

public class EmpDataBase {

    public EmpDataBase() {
    }

    public static List<Emp> getAllEmployees(){

        Emp e1 = new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0 );
        Emp e2 = new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Emp e3 = new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        Emp e4 = new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        Emp e5 = new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        Emp e6 = new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0);
        Emp e7 = new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        Emp e8 = new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0);
        Emp e9 = new Emp(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0);

        List<Emp> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9);
        return employees;
    }
}
