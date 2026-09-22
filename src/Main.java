public class Main {
    public static void main(String[] args) {
        String[] story = new String[50];

        // Line 1 Aaryan
        story[0] = "Once upon a time, a cloud with an angry face started bringing rain and thunder over a city, and then";

        // Line 2 Kwabena or Angel
        story[1] = null;

        // Line 3 Kwabena or Angel
        story[2] = null;

        // Line 4 Aaryan
        story[3] = null;

        for (int i = 0; i < story.length; i++) {
            if (story[i] != null) {
                System.out.println(story[i]);
            }
        }
    }
}