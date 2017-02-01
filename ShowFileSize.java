/**
 * ShowFileSize - converting byte size of file to human readable KB, MB, GB, TB, PB...
 *
 * @author Dmitry Fomin
 */
class ShowFileSize {

    /**
     * Method getSize
     *
     * @param long num
     * @return object of class java.lang.String
     */
    public static String getSize(long num) {
        int flooring, numlength;
        String[] unitname = {"B", "kB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        numlength = String.valueOf(num).length();
        flooring = (int) Math.floor((numlength - 1) / 3);
        String size = unitname[flooring];
        java.text.DecimalFormat dfmt = new java.text.DecimalFormat("###.## " + size);
        return dfmt.format((double) num / Math.pow(1024, flooring));
    }

    public static void main(String[] args) {
        long argsize = Long.parseLong(args[0]);
        System.out.println(getSize(argsize));
    }
}
