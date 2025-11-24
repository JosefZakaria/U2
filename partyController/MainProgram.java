//Josef Zakaria
//aq1637
//SYS

package partyController;

import javax.swing.JOptionPane;

public class MainProgram {
    public static void main(String[] args) {
        int maxNbrOfGuests = 10;// Change this line later. Only using 10 as a default value to make compilations possible.

        /* Write code to read the number of guests to start with from the user by using one of
         - JOptionPane
         - Scanner and prompt
        */

        String input;
        while (true) {
            input = JOptionPane.showInputDialog("Enter max number of guests: ");
            if (input == null) {
                System.exit(0);
            }

            if (input.matches("\\d+")) {
                maxNbrOfGuests = Integer.parseInt(input);
                if (maxNbrOfGuests > 0) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please write a positive number.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Input incorrect, please try again.");
                }

            }

            Controller controller = new Controller(maxNbrOfGuests);
        }
    }
