public class C12_07 {
    /*
    Advantages of Exceptions

Advantage 1:
Separating Error-Handling Code from "Regular" Code
Exceptions provide the means to separate the details of what to do when something out of the ordinary happens from the
main logic of a program. In traditional programming, error detection, reporting, and handling often lead to confusing
spaghetti code. For example, consider the pseudocode method here that reads an entire file into memory.

    readFile {
        open the file;
        determine its size;
        allocate that much memory;
        read the file into memory;
        close the file;
    }
At first glance, this function seems simple enough, but it ignores all the following potential errors.

    -What happens if the file can't be opened?
    -What happens if the length of the file can't be determined?
    -What happens if enough memory can't be allocated?
    -What happens if the read fails?
    -What happens if the file can't be closed?

Advantage 2:
Propagating Errors Up the Call Stack
A second advantage of exceptions is the ability to propagate error reporting up the call stack of methods. Suppose
that the readFile method is the fourth method in a series of nested method calls made by the main program: method1
calls method2, which calls method3, which finally calls readFile.

    method1 {
        call method2;
    }

    method2 {
        call method3;
    }

    method3 {
        call readFile;
    }
Suppose also that method1 is the only method interested in the errors that might occur within readFile. Traditional
error-notification techniques force method2 and method3 to propagate the error codes returned by readFile up the call
stack until the error codes finally reach method1—the only method that is interested in them.

Advantage 3:
Grouping and Differentiating Error Types
Because all exceptions thrown within a program are objects, the grouping or categorizing of exceptions is a natural
outcome of the class hierarchy. An example of a group of related exception classes in the Java platform are those
defined in java.io — IOException and its descendants. IOException is the most general and represents any type of error
that can occur when performing I/O. Its descendants represent more specific errors. For example, FileNotFoundException
means that a file could not be located on disk.

A method can write specific handlers that can handle a very specific exception. The FileNotFoundException class has no
descendants, so the following handler can handle only one type of exception.

    catch (FileNotFoundException e) {
        ...
    }
A method can catch an exception based on its group or general type by specifying any of the exception's superclasses
in the catch statement. For example, to catch all I/O exceptions, regardless of their specific type, an exception
handler specifies an IOException argument.
     */
}
