package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder result = new StringBuilder("");
        // create a `counter`
        int counter=0;
        // while `counter` is less than length of array
        while(counter < personArray.length){

            result.append("\nMy first name is ").append(personArray[counter].getFirstName()).append("\nMy last name is ").append(personArray[counter].getLastName());

            counter++;
        }
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder("");
        // identify initial value
        for (int i = 0; i < personArray.length; i++) {
            result.append("\nMy first name is ").append(personArray[i].getFirstName()).append("\nMy last name is ").append(personArray[i].getLastName());

        }
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder("");
        // identify array's type
        // identify array's variable-name

            for(Person elements :personArray){
                //result.append("My first name is ").append(personArray.getFirstName()).append("\nMy last name is ").append(personArray[elements].getLastName()).append("\n");//did not work
                result.append(elements.toString());
            }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
