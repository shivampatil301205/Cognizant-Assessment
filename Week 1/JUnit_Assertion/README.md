# JUnit Assertions Exercise

This exercise focus on exploring and understanding various types of assertions provided by JUnit 4. Assertions are the core mechanism used in testing to verify if a program's actual output matches the expected behavior.

---

## Project Structure

```text
JUnit_Assertion/
├── pom.xml
├── run.py
├── README.md
└── src/
    └── test/java/AssertionsTest.java
```

---

## Core Assertions Covered

In this exercise, we demonstrate the following standard JUnit assertions:

| Assertion | Description |
|-----------|-------------|
| `assertEquals(expected, actual)` | Asserts that two values are equal. In this exercise, we verify arithmetic calculation values. |
| `assertTrue(condition)` | Asserts that a boolean expression/condition evaluates to `true`. |
| `assertFalse(condition)` | Asserts that a boolean expression/condition evaluates to `false`. |
| `assertNull(object)` | Asserts that an object reference is `null`. |
| `assertNotNull(object)` | Asserts that an object reference is NOT `null`. |

---

## Code Reference

### AssertionsTest.java (`src/test/java/AssertionsTest.java`)
This test class runs directly under the default package or standard test paths to showcase different types of assertions.
```java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        int total = 7 * 3;
        
        // 1. assertEquals
        assertEquals(21, total);

        // 2. assertTrue & assertFalse
        assertTrue(total >= 20);
        assertFalse(total < 10);

        // 3. assertNull
        assertNull(null);

        // 4. assertNotNull
        Object value = Integer.valueOf(total);
        assertNotNull(value);
        assertEquals(21, ((Integer) value).intValue());
    }
}
```

---

## How to Run

### Command
Execute the following python script from this folder:
```bash
python run.py
```
This runs the underlying Maven clean and test command:
```bash
mvn clean test
```

---

## Expected Test Output

```text
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running AssertionsTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s -- in AssertionsTest

Results:

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

---

## Execution Screenshot
Below is the output screenshot showing the successful test assertions execution on the terminal:

![Assertion Test Output Screenshot](screenshot.png)

---
**Author:** Shivam Patil  
**Deep Skilling Program**
