package week2day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java of basics as part of java sessions in java week1";
        String temp = "";
        String[] arr = text.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i].equals(arr[j])) {
                    temp = arr[i];
                    count++;
                }
            }
        }
        if (count > 1) {
            System.out.println("Displaying the String without duplicate words:");
            System.out.println("---------------------------------------------------");
            System.out.println(text.replace(temp, ""));
        }
    }

	}
