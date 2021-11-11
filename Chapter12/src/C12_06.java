public class C12_06 {
    /*
    Typically, a try-catch-finally construct looks like this:

    try {
        // code can throw exceptions
    } catch (Exception ex) {
        // exception hanlder
    } finally {
        // this block is always executed
    }
The interesting point is that, code in the finally block always gets executed regardless of what happens in the try block.
That means whether the exceptions throw or not, the Java Virtual Machine always execute code in the finally block. Hence,
the finally is preferred to clean up resources such as closing files, network connections, database connections and
so on.
     */
}
