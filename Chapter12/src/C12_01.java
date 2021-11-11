public class C12_01 {
    /*
    java.io.IOException subclasses:

    #CharConversionException extends IOException
        -Thrown when a character conversion problem occurs in a character stream operation that must convert local
        character codes to Unicode or vice versa.

    #EOFException extends IOException
        -Thrown when the end of the file (stream) is detected while reading.

    #FileNotFoundException extends IOException
        -Thrown when the attempt to access the file specified by a given pathname fails—presumably because the file
        does not exist.

    #InterruptedIOException extends IOException
        -Thrown when a blocking I/O operation detects that the current thread has been interrupted before or during
        the operation. In principle, except for the Print stream methods, interrupting a thread should cause this
        exception if the thread is performing a blocking I/O operation. In practice most implementations only check
        for interruption before performing an operation and do not respond to interruption during the operation,
        so you cannot rely on the ability to interrupt a blocked thread. This exception is also used to signify
        that a time-out occurred during network I/O.

    #InvalidClassException extends ObjectStreamException
        -Thrown when the serialization mechanism detects a problem with a class: The serial version of the class
        does not match that read from the stream, the class contains unknown data types, or the class does not have
        an accessible no-arg constructor when needed.

    #InvalidObjectException extends ObjectStreamException
        -Thrown when the validateObject method cannot make the object valid, thus aborting the deserialization.

    #NotActiveException extends ObjectStreamException
        -Thrown when a serialization method, such as defaultReadObject, is invoked when serialization is not under
        way on the stream.

    #NotSerializableException extends ObjectStreamException
        -Thrown either by the serialization mechanism or explicitly by a class when a class cannot be serialized.

    #ObjectStreamException extends IOException
        -The superclass for all the Object stream related exceptions.

    #OptionalDataException extends ObjectStreamException
        -Thrown when the optional data (that is, not part of default serialization) in the object input stream is
        corrupt or was not read by the reading method.

    #StreamCorruptedException extends ObjectStreamException
        -Thrown when internal object stream state is missing or invalid.

    #SyncFailedException extends IOException
        -Thrown by FileDescriptor.sync when the data cannot be guaranteed to have been written to the underlying media.

    #UnsupportedEncodingException extends IOException
       - Thrown when an unknown character encoding is specified.

    #UTFDataFormatException extends IOException
       - Thrown by DataInputStream.readUTF when the string it is reading has malformed UTF syntax.

    #WriteAbortedException extends ObjectStreamException
       - Thrown when an exception occurred during a serialization write operation.*/
}
