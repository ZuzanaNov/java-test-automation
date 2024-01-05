package cz.czechitas.automation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Example test class for functionality showcase
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
final class ExampleTest extends TestRunner {

    @Test
    void contactsPageUrlTest() {
        browser.headerMenu.goToContactsSection();
        asserter.checkPageUrl("www.czechitas.cz");
    }

    @Test
    void successfulLoginTest() {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.insertEmail("da-app.admin@czechitas.cz");
        browser.loginSection.insertPassword("Czechitas123");
        browser.loginSection.clickLoginButton();
        asserter.checkIsLoggedIn();
    }

    // paramertized test - find out what is wrong with this test
    @ParameterizedTest()
    @ValueSource(strings = {"123456789", "ASDFBVC", "123"})
    void icoFieldTest(String icoValue) {
        browser.headerMenu.goToKindergartenAndSchoolSection();
        browser.orderSection.insertICO(icoValue);
    }
@Test
    void test1() {
        browser.headerMenu.goToInstructionsAndFormsForParentSection();

}

    @Test
    void test2() {
        browser.headerMenu.goToKindergartenAndSchoolSection();
        browser.orderSection.selectSuburbanCampOption();


    }
    @Test
    void test3() {
        browser.headerMenu.goToContactsSection();
        browser.headerMenu.goToHomePage();
        browser.headerMenu.goToInstructionsAndFormsForTeacherSection();
        browser.headerMenu.goToInstructionsAndFormsForParentSection();
        browser.headerMenu.goToCreateApplicationSection();
        browser.headerMenu.goToKindergartenAndSchoolSection();


    }

    @Test
    void test4() {
        browser.headerMenu.goToInstructionsAndFormsForTeacherSection();
        browser.headerMenu.goToKindergartenAndSchoolSection();
        browser.orderSection.insertICO("22834958");

    }

    @Test
    void test6() {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.insertEmail("coolzuzik@centrum.cz");
        browser.loginSection.insertPassword("Cokolate33");
        browser.loginSection.clickLoginButton();
        browser.headerMenu.goToCreateApplicationSection();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreateApplicationButton();
    }

    @Test
    void testAssert1() {
        browser.headerMenu.goToHomePage();
        asserter.checkProgrammingSectionPresense();
    }
    @Test
    void testAssert2() {
        browser.headerMenu.goToCreateApplicationSection();
        asserter.checkRegistrationButtonPresense();
    }

    @Test
    void testAssert4() {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.insertEmail("coolzuzik@centrum.cz");
        browser.loginSection.insertPassword("Cokolate33");
        browser.loginSection.clickLoginButton();
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.openFirstApplicationDetailsPage();
        asserter.applicationDetailAction.checkPaymentMethod("Bankovní převod");
    }

}
