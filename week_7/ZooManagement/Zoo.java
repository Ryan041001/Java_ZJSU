package ZooManagement;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    String name;
    String address;
    List<Admin> admins = new ArrayList<>();

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }
}
