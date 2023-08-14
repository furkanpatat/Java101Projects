public class Employee {
    String name;
    String surname;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;

    Employee(String name, String surname, double salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            double tax = this.salary * 0.03;
            return tax;
        }
        return 0;
    }

    public double bonus() {
        if (this.workHours>40){
            int extraHours = this.workHours - 40;
            int extraSalary = extraHours * 30;
            double totalSalary = this.salary + extraSalary;
            return extraSalary;
        }
        return 0;
    }
    public double raiseSalary(){
        if (currentYear-hireYear<10){
            double raisedSalary = (this.salary * 105/100) -this.salary;
            return raisedSalary;

        }
        else if(currentYear-hireYear>=10 && currentYear-hireYear<20){
            double raisedSalary = (this.salary * 110/100) -this.salary;
            return raisedSalary;
        }
        else if(currentYear-hireYear>=19){
            double raisedSalary = (this.salary * 115/100) -this.salary;
            return raisedSalary;
        }
        return 0;
    }
    public String toString(){
        System.out.println("Name\t:"+this.name);
        System.out.println("Surname\t:"+this.surname);
        System.out.println("Salary\t:"+this.salary);
        System.out.println("Work Hours per Week\t:"+this.workHours);
        System.out.println("Hire Year\t:"+this.hireYear);
        System.out.println("Tax\t:"+tax());
        System.out.println("Bonus\t:"+bonus());
        System.out.println("Salary Increase\t:"+raiseSalary());
        System.out.println("Total Salary\t:" + (raiseSalary()+bonus()+this.salary));

        return null;
    }
}
