class StringManipulation {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Object Language");
        System.out.println("Original String: " + str);

        //Obtaining String Length
        System.out.println("Length of String: " + str.length());

        //Inserting a string in the middle
        String aString = new String(str.toString());
        int pos = aString.indexOf(" Language");
        str.insert(pos," Oriented");
        
        //Modifying Characters
        str.setCharAt(6, '-');
        System.out.println("Original String: " + str);

        str.append(" improves security");
        System.out.println("Modified String: " + str);


    }
}
