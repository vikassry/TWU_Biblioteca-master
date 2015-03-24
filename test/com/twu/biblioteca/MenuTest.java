package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MenuTest {

    @Rule
    public ExpectedException thrown  = ExpectedException.none();
    private Menu menu;
    private MenuItem quit;

    @Before
    public void setUp() throws Exception {
        menu = new Menu();
        quit = new MenuItem("Quit", new QuitCommand());
    }

    @Test
    public void testMenuAddsMenuItemsToTheMenu() throws BibliotecaQuitException, InvalidOptionException {
        menu.addItem(quit);
        thrown.expect(BibliotecaQuitException.class);
        thrown.expectMessage("Thank You! Visit again");
        menu.handleOption(1);
    }

    @Test
    public void testMenuHandleOptionThrowsInvalidOptionErrorForWrongOption() throws BibliotecaQuitException, InvalidOptionException {
        thrown.expect(InvalidOptionException.class);
        thrown.expectMessage("Invalid Option! Try again......."+System.lineSeparator());
        menu.handleOption(-3);
    }


}