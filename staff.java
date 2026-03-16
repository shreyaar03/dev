class Staff {
    int staffId;
    String name;
    String phone;
    double salary;

    
    Staff(int staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

  
    void displayStaff() {
        System.out.println("Staff Id: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
    }
}


class Teaching extends Staff {
    String domain;

    Teaching(int staffId, String name, String phone, double salary, String domain) {
        super(staffId, name, phone, salary);
        this.domain = domain;
    }

    void display() {
        displayStaff();
        System.out.println("Teaching Domain: " + domain);
        System.out.println();
    }
}


class Publication extends Staff {
    int publications;

    Publication(int staffId, String name, String phone, double salary, int publications) {
        super(staffId, name, phone, salary);
        this.publications = publications;
    }

    void display() {
        displayStaff();
        System.out.println("Number of Publications: " + publications);
        System.out.println();
    }
}


class Contract extends Staff {
    int cont;

    Contract(int staffId, String name, String phone, double salary, int cont) {
        super(staffId, name, phone, salary);
        this.cont = cont;
    }

    void display() {
        displayStaff();
        System.out.println("Contract Period (months): " + cont);
        System.out.println();
    }
}


class TechnicalSkill extends Staff {
    String skill;

    TechnicalSkill(int staffId, String name, String phone, double salary, String skill) {
        super(staffId, name, phone, salary);
        this.skill = skill;
    }

    void display() {
        displayStaff();
        System.out.println("Technical Skill: " + skill);
        System.out.println();
    }
}


public class StaffDemo {
    public static void main(String[] args) {

        Teaching t = new Teaching(101, "Rahul", "9876543210", 50000, "Computer Science");
        Publication p = new Publication(102, "Anita", "6874587623", 54000, 10);
        TechnicalSkill ts = new TechnicalSkill(103, "Vikram", "7584732489", 90000, "Java Programming");
        Contract c = new Contract(104, "Neha", "894773464", 45987, 12);

        t.display();
        p.display();
        ts.display();
        c.display();
    }
}
