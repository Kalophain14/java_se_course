#!/bin/bash

# Script to create Java course files organised by topic folder

# ─────────────────────────────────────────────
# Remove ALL known folder name variations
# ─────────────────────────────────────────────
echo "🧹 Cleaning up existing folders..."
for folder in \
  "09- Arrays" \
  "09 - Arrays" \
  "09-Arrays" \
  "10 - Methods" \
  "10-Methods" \
  "11- Object-Oriented Programming" \
  "11 - Object-Oriented Programming" \
  "11-ObjectOrientedProgramming" \
  "12 - Inheritance" \
  "12-Inheritance" \
  "13 - Abstract Classes" \
  "13-AbstractClasses" \
  "14 - Interfaces" \
  "14-Interfaces" \
  "15 - Inner classes" \
  "15-InnerClasses" \
  "16 - Static and Final" \
  "16-StaticAndFinal" \
  "17 - Packages" \
  "17-Packages" \
  "18 - Exception Handling" \
  "18-ExceptionHandling" \
  "19 - Multithreading" \
  "19-Multithreading" \
  "20 - Java.lang Package" \
  "20-JavaLangPackage" \
  "21 - Annotations and JavaDoc" \
  "21-AnnotationsAndJavaDoc" \
  "22 - Lambda Expressions" \
  "22-LambdaExpressions" \
  "23 - Java IO Streams" \
  "23-JavaIOStreams" \
  "24 - Java Generics" \
  "24-JavaGenerics" \
  "25 - Collection Framework" \
  "25-CollectionFramework" \
  "26 - Date and Time API" \
  "26-DateAndTimeAPI" \
  "26 - Lambda Expressions" \
  "26-LambdaExpressions" \
  "27 - Network Programming" \
  "27-NetworkProgramming" \
  "28 - JDBC using SQLite" \
  "28-JDBCusingSQLite" \
  "29 - AWT Abstract Window Toolkit" \
  "29-AWTAbstractWindowToolkit" \
  "30 - Java Swing" \
  "30-JavaSwing" \
  "31 - JavaFX" \
  "31-JavaFX"; do
  if [ -d "$folder" ]; then
    rm -rf "$folder"
    echo "  🗑  Removed: $folder"
  fi
done
echo ""
echo "🚀 Creating fresh Java files..."
echo ""

GITIGNORE_CONTENT='# Dependencies
node_modules/
vendor/

# Environment & secrets
.env
.env.local
.env.*.local

# OS files
.DS_Store
Thumbs.db
desktop.ini

# Build output
dist/
build/
out/
target/

# Java compiled files
*.class
*.jar
*.war
*.ear
*.nar

# Java logs & temp
*.log
hs_err_pid*
replay_pid*

# IDE files - IntelliJ
.idea/
*.iml
*.iws
*.ipr

# IDE files - Eclipse
.classpath
.project
.settings/
bin/

# IDE files - VS Code
.vscode/

# IDE files - NetBeans
nbproject/
nbbuild/
nbdist/
nb-configuration.xml

# Maven / Gradle
.mvn/
.gradle/
gradle-app.setting
!gradle-wrapper.jar
'

create_gitignore() {
  local folder="$1"
  echo "$GITIGNORE_CONTENT" > "$folder/.gitignore"
}

create_java_file() {
  local folder="$1"
  local class_name="$2"
  local topic="$3"

  mkdir -p "$folder"

  # Create .gitignore only once per folder
  if [ ! -f "$folder/.gitignore" ]; then
    create_gitignore "$folder"
  fi

  cat > "$folder/${class_name}.java" <<EOF
public class ${class_name} {

    public static void main(String[] args) {
        // ${topic}
    }
}
EOF
}

# ─────────────────────────────────────────────
# 09- Arrays
# ─────────────────────────────────────────────
F="09- Arrays"
create_java_file "$F" "OneDimensionalArrays"        "One-Dimensional Arrays"
create_java_file "$F" "PractisingOneDimensional"    "Practising One-Dimensional Arrays"
create_java_file "$F" "StudentChallengeFindArray"   "Student Challenge - Find"
create_java_file "$F" "StudentChallengeRotate"      "Student Challenge - Rotate"
create_java_file "$F" "StudentChallengeIncrement"   "Student Challenge - Increment"
create_java_file "$F" "TwoDimensionalArrays"        "Two-Dimensional Arrays"
create_java_file "$F" "PractisingTwoDimensional"    "Practising Two-Dimensional Arrays"
create_java_file "$F" "StudentChallengeMatrix"      "Student Challenge - Matrix"

# ─────────────────────────────────────────────
# 10 - Methods
# ─────────────────────────────────────────────
F="10 - Methods"
create_java_file "$F" "WhatAreMethods"              "What Are Methods"
create_java_file "$F" "WritingMethods"              "Writing Methods"
create_java_file "$F" "PassingObjectAsParameter"    "Passing Object as Parameter"
create_java_file "$F" "PractisingObjectPassing"     "Practising Object Passing"
create_java_file "$F" "ParameterPassingInJava"      "Parameter Passing in Java"
create_java_file "$F" "StudentChallengeFind"        "Student Challenge - Find"
create_java_file "$F" "MethodOverloading"           "Method Overloading"
create_java_file "$F" "PractisingMethodOverloading" "Practising Method Overloading"
create_java_file "$F" "StudentChallengeOverloading" "Student Challenge - Overloading"
create_java_file "$F" "VariableArguments"           "Variable Arguments"
create_java_file "$F" "PractisingVariableArguments" "Practising Variable Arguments"
create_java_file "$F" "StudentChallengeVarArgs"     "Student Challenge - Variable Arguments"
create_java_file "$F" "CommandLineArguments"        "Command-Line Arguments"
create_java_file "$F" "StudentChallengeCommandLine" "Student Challenge - Command-Line"
create_java_file "$F" "Recursion"                   "Recursion"

# ─────────────────────────────────────────────
# 11- Object-Oriented Programming
# ─────────────────────────────────────────────
F="11- Object-Oriented Programming"
create_java_file "$F" "PrinciplesOfOOP"             "Principles of Object-Oriented Programming"
create_java_file "$F" "ClassVsObject"               "Class vs Object"
create_java_file "$F" "HowToWriteAClass"            "How to Write a Class"
create_java_file "$F" "WritingAClassForCircle"      "Writing a Class for Circle"
create_java_file "$F" "StudentChallengeWriteClass1" "Student Challenge - Write a Class 1"
create_java_file "$F" "StudentChallengeWriteClass2" "Student Challenge - Write a Class 2"
create_java_file "$F" "StudentChallengeWriteClass3" "Student Challenge - Write a Class 3"
create_java_file "$F" "DataHiding"                  "Data Hiding"
create_java_file "$F" "PractisingDataHiding"        "Practising Data Hiding"
create_java_file "$F" "TypesOfProperties"           "Types of Properties"
create_java_file "$F" "Constructors"                "Constructors"
create_java_file "$F" "PractisingConstructors"      "Practising Constructors"
create_java_file "$F" "StudentChallengeConstructor" "Student Challenge - Constructors"
create_java_file "$F" "StudentChallengePractise"    "Student Challenge - Practise"
create_java_file "$F" "ArrayOfObjectsChallenge"     "Array of Objects Challenge"

# ─────────────────────────────────────────────
# 12 - Inheritance
# ─────────────────────────────────────────────
F="12 - Inheritance"
create_java_file "$F" "GeneralisationVsSpecialisation" "Generalisation vs Specialisation"
create_java_file "$F" "WhatIsInheritance"           "What is Inheritance"
create_java_file "$F" "PractisingInheritance"       "Practising Inheritance"
create_java_file "$F" "StudentChallengeAccess"      "Student Challenge - Access"
create_java_file "$F" "ConstructorsInInheritance"   "Constructors in Inheritance"
create_java_file "$F" "ParameterisedConstructors"   "Parameterised Constructors"
create_java_file "$F" "ThisVsSuper"                 "this vs super"
create_java_file "$F" "MethodOverriding"            "Method Overriding"
create_java_file "$F" "PractisingMethodOverriding"  "Practising Method Overriding"
create_java_file "$F" "ExampleMethodOverriding1"    "Example 1 - Method Overriding"
create_java_file "$F" "ExampleMethodOverriding2"    "Example 2 - Method Overriding"
create_java_file "$F" "DynamicMethodDispatch"       "Dynamic Method Dispatch"
create_java_file "$F" "PractisingDynamicDispatch"   "Practising Dynamic Method Dispatch"
create_java_file "$F" "DosAndDontsOfOverriding"     "Dos and Donts of Overriding"
create_java_file "$F" "PolymorphismUsingOverriding" "Polymorphism using Overriding"

# ─────────────────────────────────────────────
# 13 - Abstract Classes
# ─────────────────────────────────────────────
F="13 - Abstract Classes"
create_java_file "$F" "WhatIsAbstractClass"         "What is an Abstract Class"
create_java_file "$F" "PractisingAbstractClasses"   "Practising Abstract Classes"
create_java_file "$F" "ExampleAbstractClass1"       "Example 1 - Abstract Class"
create_java_file "$F" "ExampleAbstractClass2"       "Example 2 - Abstract Class"
create_java_file "$F" "StudentChallengeAbstract"    "Student Challenge - Abstract Class"
create_java_file "$F" "DosAndDontsAbstractClass"    "Dos and Donts of Abstract Class"
create_java_file "$F" "RulesForAbstractClass"       "Rules for Abstract Class"

# ─────────────────────────────────────────────
# 14 - Interfaces
# ─────────────────────────────────────────────
F="14 - Interfaces"
create_java_file "$F" "WhatAreInterfaces"           "What are Interfaces"
create_java_file "$F" "PractisingInterfaces"        "Practising Interfaces"
create_java_file "$F" "ExampleForInterface"         "Example for Interface"
create_java_file "$F" "DemoExampleForInterface"     "Demo - Example for Interface"
create_java_file "$F" "StudentChallengeInterface"   "Student Challenge - Interface"
create_java_file "$F" "DosAndDontsInterfaces"       "Dos and Donts of Interfaces"
create_java_file "$F" "InterfaceVsMultipleInherit"  "Interface vs Multiple Inheritance"

# ─────────────────────────────────────────────
# 15 - Inner classes
# ─────────────────────────────────────────────
F="15 - Inner classes"
create_java_file "$F" "WhatAreInnerClasses"         "What are Inner Classes"
create_java_file "$F" "DemoNestedInnerClasses"      "Demo - Nested Inner Classes"
create_java_file "$F" "LocalAndAnonymousInner"      "Local and Anonymous Inner Classes"
create_java_file "$F" "StaticInnerClass"            "Static Inner Class"
create_java_file "$F" "DemoLocalAndStatic"          "Demo - Local and Static Inner Classes"

# ─────────────────────────────────────────────
# 16 - Static and Final
# ─────────────────────────────────────────────
F="16 - Static and Final"
create_java_file "$F" "StaticMembers"               "Static Members"
create_java_file "$F" "DemoStaticMembers"           "Demo - Static Members"
create_java_file "$F" "StaticBlocks"                "Static Blocks"
create_java_file "$F" "DemoStaticBlock"             "Demo - Static Block"
create_java_file "$F" "FinalMembers"                "Final Members"
create_java_file "$F" "DemoFinalKeyword"            "Demo - Final Keyword"
create_java_file "$F" "SingletonClass"              "Singleton Class"
create_java_file "$F" "StudentChallengeStatic"      "Student Challenge - Static and Final"

# ─────────────────────────────────────────────
# 17 - Packages
# ─────────────────────────────────────────────
F="17 - Packages"
create_java_file "$F" "WhatArePackages"             "What are Packages"
create_java_file "$F" "CreatingAPackage"            "Creating a Package"
create_java_file "$F" "AccessModifiers"             "Access Modifiers"
create_java_file "$F" "DemoAccessModifiers"         "Demo - Access Modifiers"
create_java_file "$F" "PackageNamingConventions"    "Package Naming Conventions"

# ─────────────────────────────────────────────
# 18 - Exception Handling
# ─────────────────────────────────────────────
F="18 - Exception Handling"
create_java_file "$F" "WhatAreExceptions"           "What Are Exceptions"
create_java_file "$F" "HowToHandleExceptions"       "How to Handle Exceptions"
create_java_file "$F" "TryAndCatchBlock"            "Try and Catch Block"
create_java_file "$F" "MultipleAndNestedTryCatch"   "Multiple and Nested Try Catch"
create_java_file "$F" "ExceptionClass"              "Exception Class"
create_java_file "$F" "CheckedAndUnchecked"         "Checked and Unchecked Exceptions"
create_java_file "$F" "ThrowVsThrows"               "throw vs throws in Java"
create_java_file "$F" "FinallyBlock"                "Finally Block in Java"
create_java_file "$F" "TryWithResources"            "Try-With-Resources in Java"
create_java_file "$F" "StudentChallengeException"   "Student Challenge - Exception Handling"

# ─────────────────────────────────────────────
# 19 - Multithreading
# ─────────────────────────────────────────────
F="19 - Multithreading"
create_java_file "$F" "MultiprogrammingAndConcurrency" "Multiprogramming and Concurrency"
create_java_file "$F" "ThreadClassAndRunnable"      "Thread Class and Runnable"
create_java_file "$F" "ThreadPriorities"            "Thread Priorities in Java"
create_java_file "$F" "ThreadMethodsAndLifecycle"   "Thread Methods and Lifecycle"
create_java_file "$F" "SynchronizationAndMonitors"  "Synchronization and Monitors"
create_java_file "$F" "InterThreadCommunication"    "Inter-Thread Communication"
create_java_file "$F" "MultithreadingProblems"      "Multithreading Problems"

# ─────────────────────────────────────────────
# 20 - Java.lang Package
# ─────────────────────────────────────────────
F="20 - Java.lang Package"
create_java_file "$F" "ObjectClassInJava"              "Object Class in Java"
create_java_file "$F" "WrapperClasses"                 "Wrapper Classes (Int, Double, etc)"
create_java_file "$F" "StringVsStringBuffer"           "String vs StringBuffer vs StringBuilder"
create_java_file "$F" "MathClassInJava"                "Math Class in Java"
create_java_file "$F" "EnumInJava"                     "Enum in Java"
create_java_file "$F" "ReflectionAPIInJava"            "Introduction to Reflection API in Java"

# ─────────────────────────────────────────────
# 21 - Annotations and JavaDoc
# ─────────────────────────────────────────────
F="21 - Annotations and JavaDoc"
create_java_file "$F" "JavaDocumentation"           "Java Documentation"
create_java_file "$F" "BuiltInAnnotations"          "Built-in Annotations in Java"
create_java_file "$F" "UserDefinedAnnotations"      "User-Defined Annotations"

# ─────────────────────────────────────────────
# 23 - Java IO Streams
# ─────────────────────────────────────────────
F="23 - Java IO Streams"
create_java_file "$F" "IntroductionToStreams"       "Introduction to Streams"
create_java_file "$F" "InputStreamAndOutputStream"  "InputStream and OutputStream"
create_java_file "$F" "JavaIoPackageClasses"        "java.io Package Classes"
create_java_file "$F" "FileInputStreamAndOutput"    "FileInputStream and FileOutputStream"
create_java_file "$F" "PipedStreams"                "Piped Streams in Java"
create_java_file "$F" "RandomAccessFile"            "RandomAccessFile in Java"
create_java_file "$F" "FileClassInJava"             "File Class in Java"
create_java_file "$F" "SerializationInJava"         "Serialization in Java"
create_java_file "$F" "PrintStreamInJava"           "PrintStream in Java"

# ─────────────────────────────────────────────
# 24 - Java Generics
# ─────────────────────────────────────────────
F="24 - Java Generics"
create_java_file "$F" "JavaGenericsExplained"          "Java Generics Explained"
create_java_file "$F" "GenericMethodsAndBestPractices" "Generic Methods and Best Practices"

# ─────────────────────────────────────────────
# 25 - Collection Framework
# ─────────────────────────────────────────────
F="25 - Collection Framework"
create_java_file "$F" "IntroductionToCollections"  "Introduction to Java Collections"
create_java_file "$F" "ListInterfaceInJava"         "List Interface in Java"
create_java_file "$F" "QueueInterfaceInJava"        "Queue Interface in Java"
create_java_file "$F" "HashingTechnique"            "Hashing Technique"
create_java_file "$F" "TreeSetVsLinkedHashSet"      "TreeSet vs LinkedHashSet"
create_java_file "$F" "HashMapVsTreeMap"            "HashMap vs TreeMap"
create_java_file "$F" "LinkedHashMapAndHashtable"   "LinkedHashMap and Hashtable"
create_java_file "$F" "ComparableVsComparator"      "Comparable vs Comparator"
create_java_file "$F" "UtilityClassesInJava"        "Utility Classes in Java Collections"
create_java_file "$F" "JavaCollectionsProject"      "Java Collections Project"

# ─────────────────────────────────────────────
# 26 - Date and Time API
# ─────────────────────────────────────────────
F="26 - Date and Time API"
create_java_file "$F" "JavaDateAndTimeClasses"      "Java Date and Time Classes"
create_java_file "$F" "DateFormattingAndParsing"    "Date Formatting and Parsing"

# ─────────────────────────────────────────────
# 26 - Lambda Expressions
# ─────────────────────────────────────────────
F="26 - Lambda Expressions"
create_java_file "$F" "IntroductionToLambda"        "Introduction to Lambda Expressions"
create_java_file "$F" "LambdaParametersAndValues"   "Lambda Parameters and Values"
create_java_file "$F" "MethodReferenceInJava"       "Method Reference in Java"

# ─────────────────────────────────────────────
# 27 - Network Programming
# ─────────────────────────────────────────────
F="27 - Network Programming"
create_java_file "$F" "IntroToNetworkProgramming"   "Introduction to Network Programming"
create_java_file "$F" "TCPReverseEchoServer"        "TCP Reverse Echo Server"
create_java_file "$F" "MultithreadedReverseEcho"    "Multithreaded Reverse Echo Server"
create_java_file "$F" "DatagramCommunication"       "Datagram Communication"

# ─────────────────────────────────────────────
# 28 - JDBC using SQLite
# ─────────────────────────────────────────────
F="28 - JDBC using SQLite"
create_java_file "$F" "DatabaseBasicsAndTerminology" "Database Basics and Terminology"
create_java_file "$F" "SQLiteInstallation"           "SQLite Installation and SQL Basics"
create_java_file "$F" "SQLQueriesSelect"             "SQL Queries - SELECT, JOIN"
create_java_file "$F" "AdvancedSQLSubqueries"        "Advanced SQL - Subqueries"
create_java_file "$F" "WritingFirstJDBCProgram"      "Writing First JDBC Program"
create_java_file "$F" "PreparedStatementAndData"     "PreparedStatement and Data"

# ─────────────────────────────────────────────
# 29 - AWT Abstract Window Toolkit
# ─────────────────────────────────────────────
F="29 - AWT Abstract Window Toolkit"
create_java_file "$F" "JavaAWTCompleteTutorial"     "Java AWT Complete Tutorial"
create_java_file "$F" "JavaAWTEventHandling"        "Java AWT Event Handling"

# ─────────────────────────────────────────────
# 30 - Java Swing
# ─────────────────────────────────────────────
F="30 - Java Swing"
create_java_file "$F" "JavaSwingCompleteCourse"     "Java Swing Complete Course"

# ─────────────────────────────────────────────
# 31 - JavaFX
# ─────────────────────────────────────────────
F="31 - JavaFX"
create_java_file "$F" "JavaFXCompleteCourse"        "JavaFX Complete Course"

echo "✅ All Java files created successfully!"
