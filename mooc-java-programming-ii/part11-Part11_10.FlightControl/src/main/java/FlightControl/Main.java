package FlightControl;

import java.util.Scanner;

import FlightControl.domain.*;
import FlightControl.logic.*;
import FlightControl.ui.*;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(scanner, flightControl);
        ui.start();
    }
}
