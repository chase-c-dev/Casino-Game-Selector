package util;
import java.util.concurrent.TimeUnit;

public class slotmachineAnimation {

    public void animation () throws InterruptedException {
        int max = 9; int max2 = 5;
        int min = 1; int min2 = 15;
        int countr = (int) (Math.random() * (max2 - min2) + min2); //generates a random number between 5 and 15
        for (int i = 1; i <= countr; i++) { //forloop random amount of times between 5 and 15
            for (int j = 0; j < 3; j++) {
                int counter = (int) ((Math.random() * (max - min)) + min); //generates a random number between 1 and 9
                System.out.print(counter + " "); //prints random numbers
            }
            for (int z = 0; z <= countr; z++) {
                int num = 10;
                num += 10;
                TimeUnit.MILLISECONDS.sleep(5+num);
            }
            System.out.println("");
        }
    }

}
