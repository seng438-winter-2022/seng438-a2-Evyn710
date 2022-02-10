**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#2:      |     |
| -------------- | --- |
| Student Names: |     |
| Evyn Rissling               |30096936     |
| Andres Caicedo  |     |
| John Abo               |     |
| Kyle Hasan             |     |

# 1 Introduction

The purpose of this lab was to learn about creating unit tests for black box testing. Mock tests were used in place of external objects. A total of ten functions were tested using a combination of mock tests and standard unit tests. Our group used Eclipse as well as VSCode to make and run the necessary tests.

# 2 Detailed description of unit test strategy

The input partitions for the getUpper,getLower and getLength methods involved partitioning the upper bound input variable and lower bound input variable. The partitions for these inputs involved a negative value, positive value and zero value. Each partition also involved floating point numbers. The max and min double values were tested to make sure that the inputs were not being stored as floats. These partitions were chosen to cover all possible cases for double values.

The partitions for both the createNumberArray involved testing different sized arrays including empty arrays and also passing a null value to test the exceptions for each. Arrays containing negative numbers and decimals were also tested to make sure it would handle both as well. For the toString() function for the Range class, various lower and upper bounds were tested, such as zeroes, negative values, and decimal point values.

The partitions for calculateColumnTotal and calculateRowTotal tested on a Values2D object with a single element, one with more than one element, and one that was given null. Each Values2D object was mocked to return a specific size, with values in each cell, including those that’re out of bounds.

The partitions for contains method involved getting the upper bound value and lower bound value. Partitioning included negative ranges of values as well as positive and zero values. For each test, black-blox testing will be done since only the requirements were provided. The upper and lower bound will be tested using boundary value analysis. The test will cover one number contained within each range as well as one which is not contained. Using equivalence testing on all tests. 

Partitioning for the getCumulativePercentage method was done on two mock objects for the KeyedValued object, one contained 4 positive values and another contained 3 negative ones. The domain was found to include values, the key associated with each value and the index of each keyed value. All these will be mocked using jMock. Boundary analysis will be tested by testing the value returned by each key, the keys returned by each index and the index returned by each key. For both objects the total sum of the values will be tested as well also tested using equivalence testing since the percentages for each keyed value should be the value/total of all values. Finally the getCumulativePercentage test will be run using both objects.


# 3 Test cases developed

| Method (1-5 are Range, 6-10 are DataUtilities)          | Who’s Testing it |
| ------------------------------------------------------- | ---------------- |
| getLowerBound(): double                                 | Kyle Hasan       |
| getUpperBound(): double                                 | Kyle Hasan       |
| getLength(): double                                     | Kyle Hasan       |
| toString(): String                                      | Evyn Rissling    |
| contains(double value)                                  | Andres Caicedo   |
| calulateColumnTotal(values2D data,int column): double | John Abo         |
| calculateRowTotal(values2D data,int row): double      | John Abo         |
| createNumberArray(double\[\] data)                      | Evyn Rissling    |
| createNumberArray2D(double\[\]\[\] data)                | Evyn Rissling    |
| getCumulativePercentages(KeyedValues data)              | Andres Caicedo   |
 
&nbsp; 

| Test Case (getLower()) | Lower                   | Upper               | Expected getLower()   | Actual getLower()     |
| ---------------------- | ----------------------- | ------------------- | --------------------- | ----------------------- |
| testNegativeRange      | \-0.4                   | \-0.1               | \-0.4                 | \-0.4                   |
| testPositiveRange      | 8.01                    | 24.11               | 8.01                  | 8.01                    |
| testZeroRange          | 0                       | 0                   | 0                     | 0                       |
| testMixedRange         | \-1.0                   | 2.0                 | \-1.0                 | \-1.0                   |
| testBoundaryRange      | \-Double.MAX\_VALUE | Double.MAX\_VALUE | \-Double.MAX\_VALUE | \-Double.MAX\_VALUE |

&nbsp;

| Test Case (getUpper()) | Lower                   | Upper               | Expected getUpper() | Actual getUpper()    |
| ---------------------- | ----------------------- | ------------------- | ------------------- | --------------------- |
| testNegativeRange      | \-0.4                   | \-0.1               | \-0.1               | \-0.1                 |
| testPositiveRange      | 8.01                    | 24.11               | 24.11               | 24.11                 |
| testZeroRange          | 0                       | 0                   | 0                   | 0                     |
| testMixedRange         | \-1.0                   | 2.0                 | 2.0                 | 2                     |
| testBoundaryRange      | \-Double.MAX\_VALUE | Double.MAX\_VALUE | Double.MAX\_VALUE | Double.MAX\_VALUE |

&nbsp;

| Test Case (getLength()) | Lower | Upper               | Expected getLength() | Actual getLength()   |
| ----------------------- | ----- | ------------------- | -------------------- | --------------------- |
| testNegativeRange       | \-0.4 | \-0.1               | 0.3                  | 0.3                   |
| testPositiveRange       | 8.01  | 24.11               | 16.10                | 16.10                 |
| testZeroRange           | 0     | 0                   | 0                    | 0                     |
| testMixedRange          | \-1.0 | 2.0                 | 3                    | 3                     |
| testBoundaryRangeLength | 0     | Double.MAX\_VALUE | Double.MAX\_VALUE  | Double.MAX\_VALUE |

&nbsp;

| toString() tests                 | Lower  | Upper | Expected Output       | Actual Output         |
| -------------------------------- | ------ | ----- | --------------------- | --------------------- |
| testNegativeLowerRange           | \-1.0  | 2.0   | "Range\[-1.0,2.0\]"   | "Range\[-1.0,2.0\]"   |
| testNormalRange                  | 1.0    | 2.0   | "Range\[1.0,2.0\]"    | "Range\[1.0,2.0\]"    |
| testNegativeRange                | \-3.0  | \-1.0 | "Range\[-3.0,-1.0\]"  | "Range\[-3.0,-1.0\]"  |
| testUpperZeroRange               | \-1.0  | 0.0   | "Range\[-1.0,0.0\]"   | "Range\[-1.0,0.0\]"   |
| testLowerZeroRange               | 0.0    | 1.0   | "Range\[0.0,1.0\]"    | "Range\[0.0,1.0\]"    |
| testNonZeroPositiveDecimalsRange | 8.11   | 16.18 | “Range\[8.11,16.18\]” | "Range\[8.11,16.18\]" |
| testNonZeroNegativeDecimalsRange | \-8.11 | 4.02  | "Range\[-8.11,4.02\]" | "Range\[-8.11,4.02\]" |

&nbsp;

| contains() test                | Input | Expected Output | Actual Output |
| ------------------------------ | ----- | --------------- | ------------- |
| testNullzeroContainsMethodTest | 0     | true            | true          |
| zeroNotContainsMethodTest      | 5     | false           | false         |
| mixedContainsMethodTest        | 0     | true            | true          |
| mixedNotContainsMethodTest     | 21    | false           | false         |
| mixedLowerBoundContainTest     | \-10  | true            | true          |
| mixedUpperBoundContainTest     | 2     | true            | true          |
| positiveContainsMethodTest     | 5.8   | true            | true          |
| positiveNotContainsMethodTest  | 5     | false           | false         |
| positiveLowerBoundContainTest  | 5.6   | true            | true          |
| positiveUpperBoundContainTest  | 20.8  | true            | true          |
| negativeContainsMethodTest     | \-6.4 | true            | true          |
| negativeNotContainsMethodTest  | 5     | false           | false         |
| negativeLowerBoundContainTest  | \-10  | true            | true          |
| negativeUpperBoundContainTest  | \-1   | true            | true          |

&nbsp;

| calculateColumnTotal() tests                 | Input                   | Expected Output                  | Actual Output                   |
| -------------------------------------------- | ----------------------- | -------------------------------- | ------------------------------- |
| testCalculateColumnTotalSingleton            | Mock Values2D object, 0 | 3.3                              | 3.3                             |
| testCalculateColumnTotalSingletonOutOfBounds | Mock Values2D object, 1 | 0.0                              | 1.1                             |
| testCalculateColumnTotalNonzeroPosition      | Mock Values2D object, 1 | 3.3                              | 3.3                             |
| testCalculateColumnTotalOutOfBounds          | Mock Values2D object, 2 | 0                                | 3.3                             |
| testCalculateColumnTotalInvalidParameter     | Null, 0                 | InvalidParameterException thrown | IllegalArgumentException thrown |

&nbsp;

| calculateRowTotal() tests                 | Input                   | Expected Output                  | Actual Output                   |
| ----------------------------------------- | ----------------------- | -------------------------------- | ------------------------------- |
| testCalculateRowTotalSingleTon            | Mock Values2D object, 0 | 3.3                              | 3.3                             |
| testCalculateRowTotalSingletonOutOfBounds | Mock Values2D object, 1 | 0                                | 3.3                             |
| testCalculateRowTotalNonzeroPosition      | Mock Values2D object, 1 | 4.4                              | 4.4                             |
| testCalculateRowTotalOutOfBounds          | Mock Values2D object, 2 | 0                                | 6.6                             |
| testCalculateRowTotalInvalidParameter     | Null, 0                 | InvalidParameterException thrown | IllegalArgumentException thrown |

&nbsp;

| createNumberArray() tests | Input                        | Expected Output                              | Actual Output                                |
| ------------------------- | ---------------------------- | -------------------------------------------- | -------------------------------------------- |
| testNull                  | null                         | InvalidParameterException           | IllegalArgumentException                     |
| testIntegerDoubleArray    | \[1, 2, 3\]                  | \[1.0, 2.0, 3.0\] as Number array            | \[1.0, 2.0, 3.0\] as Number array           |
| testDoubleDecimalArray    | \[1.25, 2.25, 3.25\]         | \[1.25, 2.25, 3.25\] as Number array         | \[1.25, 2.25, 3.25\] as Number array        |
| testEmptyArray            | \[\]                         | \[\] as Number array                         | \[\] as Number array                         |
| testNegativeArray         | \[-1.25, 2.25, -3.25, -4.5\] | \[-1.25, 2.25, -3.25, -4.5\] as Number array | \[-1.25, 2.25, -3.25, -4.5\] as Number array |
| testZeroArray             | \[0.0, 0.0, 0.0, 0.0\]       | \[0.0, 0.0, 0.0, 0.0\] as Number array       | \[0.0, 0.0, 0.0, 0.0\] as Number array       |

&nbsp;

| createNumberArray2D() tests | Input                                | Expected Output                                      | Actual Output                                        |
| --------------------------- | ------------------------------------ | ---------------------------------------------------- | ---------------------------------------------------- |
| testNull                    | null                                 | InvalidParameterException                            | IllegalArgumentException                             |
| testIntegerDoubleArray      | \[\[1.0, 2.0\], \[3.0,4.0\]\]        | \[\[1.0, 2.0\], \[3.0, 4.0\]\] as Number array       | \[\[1.0, 2.0\], \[3.0, 4.0\]\] as Number array       |
| testDoubleDecimalArray      | \[\[1.25, 2.25\], \[3.25, 4.25\]\]   | \[\[1.25, 2.25\], \[3.25, 4.25\]\] as Number array   | \[\[1.25, 2.25\], \[3.25, 4.25\]\] as Number array   |
| testEmptyArray              | \[\[\]\]                             | \[\[\]\] as Number array                             | \[\[\]\] as Number array                             |
| testNegativeArray           | \[\[-1.25, 2.25\], \[-3.25, 4.25\]\] | \[\[-1.25, 2.25\], \[-3.25, 4.25\]\] as Number array | \[\[-1.25, 2.25\], \[-3.25, 4.25\]\] as Number array |
| testZeroArray               | \[\[0.0, 0.0\], \[0.0, 0.0\]\]       | \[\[0.0, 0.0\], \[0.0, 0.0\]\] as Number array       | \[\[0.0, 0.0\], \[0.0, 0.0\]\] as Number array       |

&nbsp;

| getCumulativePercentaces() test               | Expected Output                       | Actual Output                         |
| --------------------------------------------- | ------------------------------------- | ------------------------------------- |
| positiveGetItemCountTest                      | 4                                     | 4                                     |
| negativeGetItemCountTest                      | 3                                     | 3                                     |
| positiveGetTotalTest                          | 20.0                                  | 20.0                                  |
| negativeGetTotalTest                          | \-16.0                                | \-16.0                                |
| getValuesWithKey                              | {5.0, 9.0, 2.0, 4.0, -5.0, 7.0, -4.0} | {5.0, 9.0, 2.0, 4.0, -5.0, 7.0, -4.0} |
| getKeyWithIndex                               | {0, 1, 2, 3, 0, 1, 2}                 | {0, 1, 2, 3, 0, 1, 2}                 |
| getIndexWithKey                               | {0, 1, 2, 3, 0, 1, 2}                 | {0, 1, 2, 3, 0, 1, 2}                 |
| getPositiveCumulativePercentagesWithValueTest | {0.25, 0.45, 0.1, 0.2}                | {0.333, 0.933, 1.066, 1.333}          |
| getNegativeCumulativePercentagesWithValueTest | {0.3125, 0.4375, 0.25}                | {0.4545, 1.0909, 1.4545}              |

# 4 How the team work/effort was divided and managed

Each group member was given 2-3 methods to write tests for. Then the members each wrote the strategy for each method. After writing the test cases for the methods and consequently testing the methods, the group was reunited to share the results. We then combined all our work into one GitHub and tested each other's work to make sure we got the same results. There may have been some discrepancies because of different file versions we were using since some of us got our files from D2L and some from GitHub.


# 5 Difficulties encountered, challenges overcome, and lessons learned

The biggest difficulty encountered was the different file versions provided. Specifically speaking about the ones downloaded from D2L and the ones from GitHub repository. This led to many inconsistencies in testing as well as affected our initial set up for our own IDE since some of us did not have access to all the libraries that were needed for testing.

# 6 Comments/feedback on the lab itself

In the future if it's possible to test the files before being pushed to the github or on D2L so that we all have the same files that would facilitate our testing and maybe even cut our workload in half. There were many issues of missing libraries so more testing in this regard would be great.
