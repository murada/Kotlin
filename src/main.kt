import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>){

    // Numbers variables in kotlin
    val a:Int = 1000 ;
    val d:Double = 54.365;
    val f:Float = 41.3f;
    val l:Long = 24103;
    val s:Short = 414;
    val b:Byte = 4;


    println("Th value of int : " + a );
    println("Th value of double : " + d);
    println("Th value of float : " + f);
    println("Th value of short: "+s);
    println("Th value of long : "+l);
    println("Th value of byte : "+b);


    // Characters

    val letter:Char = 'A';
    println("$letter");

    // boolean

    val flag: Boolean = true ;
    println("The boolean value = "+"$flag");


    // Strings

    val str:String ="Murad";
    println("My name is : "+"$str");

    // arrays
    val numbers:IntArray = intArrayOf(1,2,3,4);
    println("The value of index 2 = "+numbers[2])

    // collections



    println("Hello World");
}