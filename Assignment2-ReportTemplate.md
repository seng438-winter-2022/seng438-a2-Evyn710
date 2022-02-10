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

# 4 How the team work/effort was divided and managed

Each group member was given 2-3 methods to write tests for. Then the members each wrote the strategy for each method. After writing the test cases for the methods and consequently testing the methods, the group was reunited to share the results. We then combined all our work into one GitHub and tested each other's work to make sure we got the same results. There may have been some discrepancies because of different file versions we were using since some of us got our files from D2L and some from GitHub.


# 5 Difficulties encountered, challenges overcome, and lessons learned

The biggest difficulty encountered was the different file versions provided. Specifically speaking about the ones downloaded from D2L and the ones from GitHub repository. This led to many inconsistencies in testing as well as affected our initial set up for our own IDE since some of us did not have access to all the libraries that were needed for testing.

# 6 Comments/feedback on the lab itself

In the future if it's possible to test the files before being pushed to the github or on D2L so that we all have the same files that would facilitate our testing and maybe even cut our workload in half. There were many issues of missing libraries so more testing in this regard would be great.
