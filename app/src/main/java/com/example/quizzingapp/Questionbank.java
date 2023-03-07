package com.example.quizzingapp;

import java.util.ArrayList;
import java.util.List;

public class Questionbank {
    private static List<QuestionList> javaQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        questionLists.add(new QuestionList("Which of the following option leads to the portability and security of Java?", "Bytecode is executed by JVM", "The applet makes the Java code secure and portable", "Use of exception handling", "Dynamic binding between objects", "Bytecode is executed by JVM", ""));
        questionLists.add(new QuestionList("Which of the following is not a Java features?", "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented", "Use of pointers", ""));
        questionLists.add(new QuestionList("The \\u0021 article referred to as a", "Unicode escape sequence", "Octal escape", "Hexadecimal", "Line feed", "Unicode escape sequence", ""));
        questionLists.add(new QuestionList("_____ is used to find and fix bugs in the Java programs.", "JVM", "JRE", "JDK", "JDB", "JDB", ""));
        questionLists.add(new QuestionList("What is the return type of the hashCode() method in the Object class?", "Object", "int", "long", "void", "int", ""));
        questionLists.add(new QuestionList("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?", "javap tool", "javaw command", "Javadoc tool", "javah command", "Javadoc tool", ""));
        questionLists.add(new QuestionList("Which of the following creates a List of 3 visible items and multiple selections abled?", "new List(false, 3)", "new List(3, true)", "new List(true, 3)", "new List(3, false)", "new List(3, false)", ""));
        questionLists.add(new QuestionList("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?", "getClass()", "intern()", "getName()", "toString()", "getName()", ""));
        questionLists.add(new QuestionList("Which of the following is true about the anonymous inner class?", "It has only methods", "Objects can't be created", "It has a fixed class name", "It has no class name", "It has no class name", ""));
        questionLists.add(new QuestionList("Which package contains the Random class?", "java.util package", "java.lang package", "java.awt package", "java.io package", "java.util package", ""));

        return questionLists;
    }
    private static List<QuestionList> phpQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        questionLists.add(new QuestionList("PHP stands for -", "Hypertext Preprocessor", "Pretext Hypertext Preprocessor", "Personal Home Processor", "None of the above", "Hypertext Preprocessor", ""));
        questionLists.add(new QuestionList("Who is known as the father of PHP?", "Drek Kolkevi", "List Barely", "Rasmus Lerdrof", "None of the above", "Rasmus Lerdrof", ""));
        questionLists.add(new QuestionList("Which of the following is the default file extension of PHP?", ".php", ".hphp", ".xml", ".html", ".php", ""));
        questionLists.add(new QuestionList("Which of the following is not a variable scope in PHP?", "Extern", "Local", "Static", "Global", "Extern", ""));
        questionLists.add(new QuestionList("Which of the following is used to display the output in PHP", "echo", "write", "print", "Both (a) and (c)", "Both (a) and (c)", ""));
        questionLists.add(new QuestionList("Which of the following is the use of strlen() function in PHP?", "The strlen() function returns the type of string", "The strlen() function returns the length of string", "The strlen() function returns the value of string", "The strlen() function returns both value and type of string", "The strlen() function returns the length of string", ""));
        questionLists.add(new QuestionList("Which of the following starts with __ (double underscore) in PHP?", "Inbuilt constants", "User-defined constants", "Magic constants", "Default constants", "Magic constants", ""));
        questionLists.add(new QuestionList("What does PEAR stands for?", "PHP extension and application repository", "PHP enhancement and application reduce", "PHP event and application repository", "None of the above", "PHP extension and application repository", ""));
        questionLists.add(new QuestionList("Which of the following PHP function is used to generate unique id?", "id()", "mdid()", "uniqueid()", "None of the above", "uniqueid()", ""));
        questionLists.add(new QuestionList("What is the use of fopen() function in PHP?", "The fopen() function is used to open folders in PHP", "The fopen() function is used to open remote server", "The fopen() function is used to open files in PHP", "None of the above", "The fopen() function is used to open files in PHP", ""));

        return questionLists;
    }
    private static List<QuestionList> androidQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        questionLists.add(new QuestionList("Android is -", "an operating system", "a web browser", "a web server", "None of the above", "an operating system", ""));
        questionLists.add(new QuestionList("For which of the following Android is mainly developed?", "Servers", "Desktops", "Laptops", "Mobile devices", "Mobile devices", ""));
        questionLists.add(new QuestionList("Which of the following is the first mobile phone released that ran the Android OS?", "HTC Hero", "Google gPhone", "T - Mobile G1", "None of the above", "T - Mobile G1", ""));
        questionLists.add(new QuestionList("Which of the following virtual machine is used by the Android operating system?", "JVM", "Dalvik virtual machine", "Simple virtual machine", "None of the above", "Dalvik virtual machine", ""));
        questionLists.add(new QuestionList("Android is based on which of the following language?", "Java", "C++", "C", "None of the above", "Java", ""));
        questionLists.add(new QuestionList("APK stands for -", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above", "Android Package Kit", ""));
        questionLists.add(new QuestionList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", ""));
        questionLists.add(new QuestionList("How can we stop the services in android?", "By using the stopSelf() and stopService() method", "By using the finish() method", "By using system.exit() method", "None of the above", "By using the stopSelf() and stopService() method", ""));
        questionLists.add(new QuestionList("What is an activity in android?", "android class", "android package", "A single screen in an application with supporting java code", "None of the above", "A single screen in an application with supporting java code", ""));
        questionLists.add(new QuestionList("On which of the following, developers can test the application, during developing the android applications?", "Third-party emulators", "Emulator included in Android SDK", "Physical android phone", "All of the above", "All of the above", ""));

        return questionLists;
    }
    private static List<QuestionList> htmlQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        questionLists.add(new QuestionList("What does the abbreviation HTML stand for?", "HighText Machine Language", "HyperText and links Markup Language", "HyperText Markup Language", "None of these", "HyperText Markup Language", ""));
        questionLists.add(new QuestionList("The correct sequence of HTML tags for starting a webpage -", "Head, Title, HTML, body", "HTML, Body, Title, Head", "HTML, Head, Title, Body", "HTML, Head, Title, Body", "HTML, Head, Title, Body", ""));
        questionLists.add(new QuestionList("Which of the following element is responsible for making the text bold in HTML?", "<pre>", "<a>", "<b>", "<br>", "<b>", ""));
        questionLists.add(new QuestionList("Which of the following tag is used for inserting the largest heading in HTML?", "<h3>", "<h1>", "<h5>", "<h6>", "<h1>", ""));
        questionLists.add(new QuestionList("How to add a background color in HTML?", "<marquee bg color: \"red\">", "<marquee bg-color = \"red\">", "<marquee bgcolor = \"red\">", "<marquee color = \"red\">", "<marquee bgcolor = \"red\">", ""));
        questionLists.add(new QuestionList("<input> is", "a format tag.", "an empty tag.", "All of the above", "None of the above", "an empty tag", ""));
        questionLists.add(new QuestionList("Which of the following tag is used to make the underlined text?", "<i>", "<ul>", "<u>", "<pre>", "<u>", ""));
        questionLists.add(new QuestionList("Which of the following tag is used to define options in a drop-down selection list?", "<select>", "<list>", "<dropdown>", "<option>", "<option>", ""));
        questionLists.add(new QuestionList("The <hr> tag in HTML is used for -", "new line", "vertical ruler", "new paragraph", "horizontal ruler", "horizontal ruler", ""));
        questionLists.add(new QuestionList("Which of the following is the container for <tr>, <th>, and <td> ?", "<data>", "<table>", "<group>", "All of the above", "<table>", ""));

        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java" :
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

}
