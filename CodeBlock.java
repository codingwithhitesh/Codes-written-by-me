class StringBuilderExample {
    public static String Concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(Concatenate("Hitesh"));
        System.out.println(Concatenate("Singh"));


    }
}
