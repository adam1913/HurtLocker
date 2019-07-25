public class ItemParcel {


    public String[] separatePound(String output) {
        String[] lines = output.split("##");
        return lines;

    }


    public String[] separateValues(String line) {
        String[] list = line.split(":|@|\\^|\\*|%|;|!");
        return list;
    }

    public String[] separatetheString(String output) {
        String[] list = separatePound(output);
        for (int i = 0; i < list.length; i++) {
            String[] tempList = separateValues(list[i]);

        }
        return null;
    }

    private static String[] sortList(String peanutbutter){
        return null;
    }



//"(?i:.*SEVEN.*)"
}
