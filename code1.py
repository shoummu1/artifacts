# Class representing a person
class Person:
    # Constructor to initialize the object
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Method to print person details
    def print_details(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")

    # Method to update the person's name
    def set_name(self, name):
        self.name = name

    # Method to update the person's age
    def set_age(self, age):
        if age > 0:
            self.age = age
        else:
            print("Age must be positive.")

# Main function
if __name__ == "__main__":
    # Create a new Person object
    person1 = Person("John", 25)
    
    # Print initial details of the person
    person1.print_details()

    # Modify person1's attributes
    person1.set_name("John Doe")
    person1.set_age(30)

    # Print updated details of the person
    person1.print_details()
