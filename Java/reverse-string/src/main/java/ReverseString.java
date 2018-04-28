class ReverseString {

    String reverse(String inputString) {
        String result = "";
        if(!inputString.equals("")) //Skips the reversal for empty strings to optimize performance.
        {
          StringBuilder builder = new StringBuilder(inputString);
          result = builder.reverse().toString();
        }
        return result;
    }

}
