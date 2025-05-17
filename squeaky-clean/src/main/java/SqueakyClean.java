class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll("[^a-zA-Z0-9-_ ]", "");

        if (identifier.contains(" ")) {
            identifier = identifier.replaceAll(" ", "_");
        }
        if (identifier.contains("-")) {
            String[] splitted = identifier.split("-");
            identifier = splitted[0];
            for (int i = 1; i < splitted.length; i++) {
                String word = splitted[i];
                String upperFirstLetter = word.substring(0, 1).toUpperCase() + word.substring(1);
                identifier += upperFirstLetter;
            }
        }
        if (identifier.contains("4")) {
            identifier = identifier.replaceAll("4", "a");
        }
        if (identifier.contains("3")) {
            identifier = identifier.replaceAll("3", "e");
        }
        if (identifier.contains("0")) {
            identifier = identifier.replaceAll("0", "o");
        }
        if (identifier.contains("1")) {
            identifier = identifier.replaceAll("1", "l");
        }
        if (identifier.contains("7")) {
            identifier = identifier.replaceAll("7", "t");
        }

        return identifier;
    }
}
