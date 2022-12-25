#include <bits/stdc++.h>
using namespace std;

// Employee class
class Employee {

  private:
  string name;
  int code;
  double salary;
  int age;
  Employee* manager;
   public:
   
  // Constructor
  Employee(string name, int code, double salary, int age)
      {
        this->name = name;
        this->code = code;
        this->salary = salary;
        this->age = age;
      }
 
  // Getters
  string getName() const { return name; }
  int getCode() const { return code; }
  double getSalary() const { return salary; }
  int getAge() const { return age; }


  // Setter

  // Print information about the employee
  void print() const {
    cout << "Name: " << name<< endl;
    cout << "Code: " << code<< endl;
    cout << "Salary: " << salary << endl;
    cout << "Age: " << age<< endl;
  }

};

// Manager class
class Manager : public Employee {
 public:

  // Constructor
  Manager(string name, int code, double salary, int age)
      : Employee(name, code, salary, age) {}
  

  // Add an employee to the list of supervised employees
  void addEmployee(Employee* employee) {
    if (supervised_employees_.size() < 10) {
      supervised_employees_.push_back(employee);
    }
  }

  // Remove an employee from the list of supervised employees
  void removeEmployee(Employee* employee) {
    for (auto it = supervised_employees_.begin();it != supervised_employees_.end(); ++it) {
      if (*it == employee) {
        supervised_employees_.erase(it);
        break;
      }
    }
  }

  // Print information about the manager and the employees he/she supervises
  void print() const {
    Employee::print();
    cout << " Supervised Employees:" << endl;
    for (const Employee* employee : supervised_employees_) {
      cout << "  - " << employee->getName() << endl;
    }
  }

 private:
  vector<Employee*> supervised_employees_;
};

int main() {

         //Entering Emolyees Information 

         Employee emp1("John Smith", 123, 45000, 35);
         Employee emp2("Jane Doe", 455, 50000, 32);
         Employee emp3("Akash", 456, 50000, 32);
         Employee emp4("Pemon", 457, 50000, 32);
         Employee emp5("Tarek", 458, 50000, 32);

        // Promoting an employee to Mannager 
         Manager mgr(emp1.getName(), emp1.getCode(), emp1.getSalary(), emp1.getAge());

       //Adding employees under supervision of Mannager
         mgr.addEmployee(&emp2);
         mgr.addEmployee(&emp3);
         mgr.addEmployee(&emp4);
         mgr.addEmployee(&emp5);
   
        // Printing Manager Information
         cout << "    Manager " << endl;
         mgr.print();


}
