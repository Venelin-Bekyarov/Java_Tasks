public class C12_03 {
    /*
An IllegalArgumentException is thrown in order to indicate that a method has been passed an illegal argument.
This exception extends the RuntimeException class and thus, belongs to those exceptions that can be thrown during
the operation of the Java Virtual Machine (JVM). It is an unchecked exception and thus, it does not need to be declared
in a method’s or a constructor’s throws clause.

Reasons for java.lang.IllegalArgumentException
    #When Arguments out of range. For example, the percentage should lie between 1 and 100. If the user entered 101 then
an IllegalArgumentException will be thrown.
    #When argument format is invalid. For example, if our method requires date format like YYYY/MM/DD but if the user is
passing YYYY-MM-DD. Then our method can’t understand then IllegalArgumentException will be thrown.
    #When a method needs non-empty string as a parameter but the null string is passed.
     */
}
