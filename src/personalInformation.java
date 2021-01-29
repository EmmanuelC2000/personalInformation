import javax.swing.*;

public class personalInformation {

    public static void main(String[] args){

        String name, userInput, desiredJob;
        int age;

        JOptionPane.showMessageDialog(null, "Hello my name my name is Emmanuel Carrillo " +
                "and I am 20 years old I am hoping to some day become a software developer.\n" +
                "Please press \"okay\" to continue");
        name = JOptionPane.showInputDialog(null, "Please enter your first name and last " +
                "name: ");
        userInput = JOptionPane.showInputDialog(null, "Please enter your age: ");
        age = Integer.parseInt(userInput);

        if(age >= 18){
            JOptionPane.showMessageDialog(null, "You are old enough to vote!");
        } else{
            JOptionPane.showMessageDialog(null, "You are not old enough to vote! :( ");
        }
        desiredJob = JOptionPane.showInputDialog(null, "What is your dream job? ");
        JOptionPane.showMessageDialog(null, "It was a pleasure to meet you " + name +
                " hopefully some day your dream of becoming a " + desiredJob + " becomes a reality!");
    }
}
