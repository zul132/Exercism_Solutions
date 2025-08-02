import java.util.Map;
class SqueakyClean {
    private final static Map<Character, Character> LEET_SPEAK = Map.ofEntries(
        Map.entry('4', 'a'),
        Map.entry('3', 'e'),
        Map.entry('0', 'o'),
        Map.entry('1', 'l'),
        Map.entry('7', 't')
    );
    
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
                resIdentifier.append(Character.toUpperCase(identifier.charAt(i + 1)));
                i++;
            }
            // Task 3: Convert leetspeak to normal text
            else if (LEET_SPEAK.containsKey(ch)) {
                resIdentifier.append(LEET_SPEAK.get(ch));
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