public class Rules {
    public boolean checkDescription(String description) {
        boolean isValid = false;
        if (description.length() > 50 ) {
            isValid = false;
        } else {
            isValid = true;

        }
        return isValid;

    }
}
