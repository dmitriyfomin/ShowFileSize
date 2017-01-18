
/**
 * ShowFileSize - converting byte size of file to KB, MB, GB, TB, PB...
 * @author Dmitry Fomin
 */
class ShowFileSize {

    public static String getSize(long num, int digits) {
        String[] unitname = {"B", "kB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        int numlength = String.valueOf(num).length();
        int flooring = (int) Math.floor((numlength - 1) / 3);
        String size = unitname[flooring];
        java.text.DecimalFormat dfmt = new java.text.DecimalFormat("###.## " + size);
        return dfmt.format((double) num / Math.pow(1024, flooring));
    }

    public static void main(String[] args) {
        Long argsize = Long.parseLong(args[0]);
        System.out.println(getSize(argsize, 2));
    }
}