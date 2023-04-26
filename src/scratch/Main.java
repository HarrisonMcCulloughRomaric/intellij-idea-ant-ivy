package scratch;

import org.apache.commons.lang.*;

import java.util.*;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        if (args.length > 0)
        {
            System.out.println(Arrays.stream(args).map(WordUtils::capitalize).collect(Collectors.joining(" ")));
        }
    }
}
