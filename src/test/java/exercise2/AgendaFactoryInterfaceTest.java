package exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgendaFactoryInterfaceTest {

    private AgendaFactoryInterface internationalFactory;
    private AgendaFactoryInterface nationalFactory;
    private AgendaFactoryInterface factory;

    @Before
    public void setUp() {
        internationalFactory = new InternationalFactory();
        nationalFactory = new NationalFactory();
        factory = new NationalFactory();
    }

    @Test
    public void testCreateContactReturnNationalContact() {
        ContactInterface contact = factory.createContact("Juan", "Palomo");

        assertNotNull(contact);
        assertTrue(contact instanceof NationalContact);

        NationalContact nationalContactTest = (NationalContact) contact;
        nationalContactTest.setSecondSurName("Yomeloguiso");
        assertEquals("Juan", getField(nationalContactTest, "name"));
        assertEquals("Palomo", getField(nationalContactTest, "firstSurName"));
        assertEquals("Yomeloguiso", getField(nationalContactTest, "secondSurName"));
    }

    @Test
    public void testCannotCreateNationalContactUsingInternationalFactory() {
        AgendaApplication app = new AgendaApplication(internationalFactory);

        ContactInterface contact = app.createContact("Michael", "Jordan");
        assertFalse(contact instanceof NationalContact);
    }

    @Test
    public void testCantCreateInterNationalContactUsingNationalFactory() {
        AgendaApplication app = new AgendaApplication(nationalFactory);

        ContactInterface contact = app.createContact("Jonhy", "Walker");

        assertFalse(contact instanceof InternationalContact);
    }


    private Object getField(Object obj, String fieldName) {
        try {
            java.lang.reflect.Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}