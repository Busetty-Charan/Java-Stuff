import javax.swing.*;

public class SimpleCalci {
    
    public static void main(String[] args) {
        
        // ---------- Window Frame Configuration Start ----------
        JFrame applicationFrame = new JFrame();
        applicationFrame.setSize(1280, 720);
        applicationFrame.setLayout(null);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ---------- Window Frame Configuration End ----------

        // ---------- Label Configurations Start ----------
        JLabel input1 = new JLabel("Input 1 : ");
        input1.setBounds(20, 100, 100, 50);

        JLabel input2 = new JLabel("Input 2 : ");
        input2.setBounds(20, 200, 100, 50);

        JLabel result = new JLabel("Result : ");
        result.setBounds(20, 300, 100, 50);

        applicationFrame.add(input1);
        applicationFrame.add(input2);
        applicationFrame.add(result);
        // ---------- Label Configurations End ----------

        // ---------- Text Field Configurations Start ----------
        JTextField input1TextField = new JTextField();
        input1TextField.setBounds(140, 100, 100, 50);

        JTextField input2TextField = new JTextField();
        input2TextField.setBounds(140, 200, 100, 50);

        JTextField resultTextField = new JTextField();
        resultTextField.setBounds(140, 300, 100, 50);

        applicationFrame.add(input1TextField);
        applicationFrame.add(input2TextField);
        applicationFrame.add(resultTextField);
        // ---------- Text Field Configurations End ----------

        // ---------- Button Configurations Start ----------
        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 600, 100, 50);

        JButton subButton = new JButton("Sub");
        subButton.setBounds(140, 600, 100, 50);

        applicationFrame.add(addButton);
        applicationFrame.add(subButton);
        // ---------- Button Configurations End ----------

        applicationFrame.setVisible(true);
    }
}
