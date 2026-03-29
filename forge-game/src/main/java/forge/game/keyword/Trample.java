package forge.game.keyword;

public class Trample extends KeywordWithType {
    @Override
    protected String formatReminderText(String reminderText) {
        if (!type.isEmpty()) {
            // REVOLUTION
            String attacked;
            if(type.equals("Planeswalker")) attacked = "controller";
            else attacked = "defender";
            return "This creature can deal excess combat damage to the " + attacked + " of the " + type + " it's attacking.";
        }
        return reminderText;
    }
}
