/* Refaktorer koden for at gøre den mere læselig.
   Hvad betyder fx 1.2?
   Hvorfor > 2500?
   Hvad er formålet med denne formel? 
*/

void main() {
    int raiseThreshold = 2500;
    double raiseFactor = 1.2;

    double salary = 3000;

    //We're just giving our guys more money for making more money I guess [shrug]
    if (salary > raiseThreshold) {
        salary = salary * raiseFactor;
    }

    IO.println(salary);
}
