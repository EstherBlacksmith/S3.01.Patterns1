package exercise2;

import java.util.HashMap;


public class ContactsManager {
    static HashMap<String, Contacts> contactsAgenda;
    static ReadingMethods readingMethod ;
    public ContactsManager() {
        contactsAgenda = new HashMap<>();
        readingMethod = new ReadingMethods();
    }


    protected void listContact() {
        contactsAgenda.forEach((name, contacts) ->
        {
            System.out.println(name + " -> " + contacts);
        });
    }

    protected void deleteContact() {
        String name = readingMethod.readString("Indicate the name");
        contactsAgenda.remove(name);
    }

    protected void createContact() {
        String country = readingMethod.readString("Select the country of your contact:\n1. Spain");
        if (country.equals("1")) {
            NationalContact spanishContact;
            boolean questionsInAire = true;

            while (questionsInAire) {

                try {
                    String name = readingMethod.readString("Indicate the name");
                    String surName1 = readingMethod.readString("Indicate the first surname");
                    String surName2 = readingMethod.readString("Indicate the second surname");
                    spanishContact = new NationalContact(name, surName1, surName2);


                    try {
                        contactsAgenda.putIfAbsent(surName1, spanishContact);
                    } catch (NullPointerException e) {
                        contactsAgenda.put(surName1, spanishContact);
                    }

                } finally {
                    questionsInAire = false;
                }

            }

        }

    }


}
