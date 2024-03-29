# Point3D
---
## About
Point3D is a Java library for implementing and utilising 3D coordinates in the Java language. It is an extension of the Point2D library in Java, the code for which can be found [here](http://developer.classpath.org/doc/java/awt/geom/Point2D-source.html).

## Implementing the Library
To utilise the library, clone/download the code in your Computer and store it in a directory alongside your code (or whatever directory suits you) and just use the regular import statement ( ``` import <packagename> ``` ) to import the library into your program. The main class is in ```src/Point3D/Point3D.java```

## Functions And Classes
The [JavaDoc](https://github.com/periperidip/Point3D/blob/master/doc/Point3D/Point3D.html) file for the code contains all the details regarding the functions and classes in the code.

## Sample Output
For the input,
```
Point3D FirstPoint = new Point3D.Double(1,3,5);
Point3D SecondPoint = new Point3D.Double(2,3,4);
System.out.println(FirstPoint.distance(SecondPoint));
System.out.println(FirstPoint.distance(0, 0, 0));
```		
The output is, <br>
`1.4142135623730951` <br>
`5.916079783099616`

### Developer's Note
An additional function called the ```RandomCoordinateGenerator()``` has been added in the library. This function generates a random 3D coordinate in xyz plane.
