class Twofer {

    String twofer(String name) {
        String value;
        value = (name == null) ? "you" : name;
        return "One for "+value+", one for me.";
    }

}
