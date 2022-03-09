package lsp.good;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<IEmployee> list = new ArrayList<>();

        list.add(new JuniorEmployee());
        list.add(new SeniorEmployee());

        for (IEmployee emp : list) {
            emp.getEmployeeDetails(985);
        }
    }
}