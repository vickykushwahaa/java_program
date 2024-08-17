public class StringManipulation {
    public static void main(String[] args) {
        String first_Name="vicky";
        String Last_Name="Kushwaha";
        String full_Name=first_Name+" "+Last_Name;
        System.out.println(full_Name);
        full_Name=first_Name.concat(" ").concat(Last_Name);
        System.out.println(full_Name);
        System.out.println(full_Name.toUpperCase());
}
}
