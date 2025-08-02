import java.util.Map;
class SqueakyClean {
    private static char translateLeetSpeak(char ch) {
        return switch (ch) {
            case '4' -> 'a';
            case '3' -> 'e';
            case '0' -> 'o';
            case '1' -> 'l';
            case '7' -> 't';
            default  -> ch;
        };
    }
    
    static String clean(String identifier) {
        StringBuilder resIdentifier = new StringBuilder("");
        
        int i = 0;
         while (i < identifier.length()) {
            char ch = identifier.charAt(i);
             
            // Task 1: Replace any spaces encountered with underscores
            if (ch == ' ') {
                resIdentifier.append('_');
            }
            // Task 2: Convert kebab-case to camelCase
            else if (ch == '-') {
                if (i < identifier.length() - 1) {
                    resIdentifier.append(Character.toUpperCase(identifier.charAt(i + 1)));
                    i++;
                }
            }
            // Task 3: Convert leetspeak to normal text
            else if (ch == '4' || ch == '3' || ch == '0' || ch == '1' || ch == '7') {
                resIdentifier.append(translateLeetSpeak(ch));
            }
            // Task 4: Omit characters that are not letters
            else if (Character.isLetter(ch)) {
                resIdentifier.append(ch);
            }
            
            i++;
        }

        return resIdentifier.toString();
    }
}