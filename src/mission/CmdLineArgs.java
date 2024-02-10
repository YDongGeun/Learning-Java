package mission;

public class CmdLineArgs {
    public static void main(String[] args) {
        System.out.println(args.length);

        System.out.printf("%s\n", args[0]);
        System.out.printf("%s\n", args[1]);
    }
}
