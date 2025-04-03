package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 5, 6};
        try {
            System.out.println(nums[4]/1);
            // use 0 instead of 1 to get Something went wrong and use nums[any outside number] to get out of bound exceptions.
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Index");
        } catch (Exception E) {
            System.out.println("Something went wrong");
        }
    }
}
