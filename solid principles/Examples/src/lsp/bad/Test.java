package lsp.bad;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new JuniorEmployee());
        list.add(new SeniorEmployee());

        for (Employee emp : list) {
            emp.getWorkDetails(985);
        }
    }
}
