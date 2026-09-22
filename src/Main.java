public class Main {
    public static void main(String[] args) {
        String[] story = new String[10];

        // Line 1 Aaryan
        story[0] = "Once upon a time, a cloud with an angry face started bringing rain and thunder over a city, and then";

        // Line 2 Kwabena or Angel
        story[1] = "The city was starting to flood and the people were drenched from the heavy rain, and then";

        // Line 3 Kwabena or Angel
        story[2] = null;

        // Line 4 Aaryan
        story[3] = null;

        for (String piece : story) {
            if (piece != null) {
                System.out.println(piece);
            }
        }
    }
}