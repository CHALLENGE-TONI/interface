# interface

Task 1: Interface

task
For the management of results (test results, sports competitions, ...) the class Result has to be created. It stores a name and the associated partial results (number is specified when generating). The public interface of Result consists of at least:

// constructor for setting the name and the number of scores
public result (string name, int scores)

// sets for score which the given amount
public void setScore (int which, double amount)

// returns score which
public double getScore (int which)

// returns the total score
public double getTotalScore ()

// returns a string representation of the name combinded with all
// scores and the total score
public String toString ()

The toString () method should return a string in the following form (for example, if there are 5 subtotals):

MyName: 5.0 / 3.5 / 10.0 / 0.0 / 2.75 = 21.25

The class Result should also implement the interface Measurable (see V-part).

Create at least one more meaningful class that implements the Measurable interface.

Also, create a demo program called MyMeasureableDemo that shows the actual functionality of the class and also the application of the Measurable interface.
